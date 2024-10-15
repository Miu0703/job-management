<template>
  <div>
    <h1>Job List</h1>
    <ul>
      <li v-for="job in jobs" :key="job.jobId" @click="getJobDetails(job.jobId)">
        {{ job.jobName }} - {{ job.jobStatus }}
      </li>
    </ul>
    <div v-if="selectedJob">
      <h2>Job Details</h2>
      <p>Job ID: {{ selectedJob.jobId }}</p>
      <p>Job Name: {{ selectedJob.jobName }}</p>
      <p>Status: {{ selectedJob.jobStatus }}</p>
      <p>Created At: {{ selectedJob.createdAt }}</p>
    </div>
  </div>
</template>

<script>
// 引入 gRPC 客户端
import { JobServiceClient } from 'C:/Users/Lenovo/Desktop/demo/src/grpc/generated/job_management_grpc_web_pb';
import { EmptyRequest } from 'C:/Users/Lenovo/Desktop/demo/src/grpc/generated/job_management_pb';

export default {
  data() {
    return {
      jobs: [],
      selectedJob: null
    };
  },
  mounted() {
    console.log("Mounted hook called, invoking listAllJobs...");
    this.listAllJobs();
  },
  methods: {
    listAllJobs() {
  const client = new JobServiceClient('http://localhost:8080');
  const request = new EmptyRequest();

  client.listAllJobs(request, {}, (err, response) => {
    if (err) {
      console.error("Error from gRPC request:", err);
      return;
    }
    console.log("gRPC request successful, response:", response);

    const statusMapping = {
      0: 'SUBMITTED',
      1: 'RUNNING',
      2: 'COMPLETED'
    };

    // 将返回的 job 数据解析并存储
    this.jobs = response.getJobsList().map(job => ({
      jobId: job.getJobid(),
      jobName: job.getJobname(),
      jobStatus: statusMapping[job.getJobstatus()], // 映射状态码到状态字符串
      createdAt: job.getCreatedat()
    }));

    if (this.jobs.length === 0) {
      console.warn("No jobs received from the server.");
    }
  });
},
    getJobDetails(jobId) {
      const selected = this.jobs.find(job => job.jobId === jobId);
      if (selected) {
        console.log("Job details fetched for jobId:", jobId);
        this.selectedJob = selected;
      } else {
        console.error("Job with jobId not found:", jobId);
      }
    }
  }
};
</script>

<style scoped>
ul {
  list-style-type: none;
  padding: 0;
}
li {
  cursor: pointer;
  margin: 10px 0;
}
li:hover {
  text-decoration: underline;
}
</style>
