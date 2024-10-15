package com.example;

import job.JobServiceGrpc;
import job.JobManagement.EmptyRequest;
import job.JobManagement.JobListResponse;
import job.JobManagement.JobRequest;
import job.JobManagement.JobDetailsResponse;
import io.grpc.stub.StreamObserver;
import job.JobManagement.Job;
import job.JobManagement.JobStatus;



import java.util.ArrayList;
import java.util.List;

public class JobServiceImpl extends JobServiceGrpc.JobServiceImplBase {
    @Override
    public void listAllJobs(EmptyRequest request, StreamObserver<JobListResponse> responseObserver) {
        //mock 数据
        Job job1 = Job.newBuilder().setJobId("1").setJobName("Data Processing").setJobStatus(JobStatus.SUBMITTED).setCreatedAt("2024-10-11T10:00:00").build();
        Job job2 = Job.newBuilder().setJobId("2").setJobName("Model Training").setJobStatus(JobStatus.RUNNING).setCreatedAt("2024-10-11T11:00:00").build();

        JobListResponse response = JobListResponse.newBuilder().addJobs(job1).addJobs(job2).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getJobDetails(JobRequest request, StreamObserver<JobDetailsResponse> responseObserver) {
        //job 细节
        Job job = Job.newBuilder().setJobId(request.getJobId()).setJobName("Data Processing").setJobStatus(JobStatus.COMPLETED).setCreatedAt("2024-10-11T10:00:00").build();
        JobDetailsResponse response = JobDetailsResponse.newBuilder().setJob(job).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
