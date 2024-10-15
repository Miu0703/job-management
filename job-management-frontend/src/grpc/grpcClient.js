import { JobServiceClient } from 'C:/Users/Lenovo/Desktop/demo/src/grpc/generated/job_management_grpc_web_pb';
//import { Empty, JobRequest } from 'C:/Users/Lenovo/Desktop/demo/src/grpc/generated/job_management_pb';


// Configure the gRPC client
const client = new JobServiceClient('http://localhost:8080', null, null);

export default client;

