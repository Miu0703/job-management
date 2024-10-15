package job;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.49.0)",
    comments = "Source: job_management.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class JobServiceGrpc {

  private JobServiceGrpc() {}

  public static final String SERVICE_NAME = "job.JobService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<job.JobManagement.EmptyRequest,
      job.JobManagement.JobListResponse> getListAllJobsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAllJobs",
      requestType = job.JobManagement.EmptyRequest.class,
      responseType = job.JobManagement.JobListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<job.JobManagement.EmptyRequest,
      job.JobManagement.JobListResponse> getListAllJobsMethod() {
    io.grpc.MethodDescriptor<job.JobManagement.EmptyRequest, job.JobManagement.JobListResponse> getListAllJobsMethod;
    if ((getListAllJobsMethod = JobServiceGrpc.getListAllJobsMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getListAllJobsMethod = JobServiceGrpc.getListAllJobsMethod) == null) {
          JobServiceGrpc.getListAllJobsMethod = getListAllJobsMethod =
              io.grpc.MethodDescriptor.<job.JobManagement.EmptyRequest, job.JobManagement.JobListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAllJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  job.JobManagement.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  job.JobManagement.JobListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("ListAllJobs"))
              .build();
        }
      }
    }
    return getListAllJobsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<job.JobManagement.JobRequest,
      job.JobManagement.JobDetailsResponse> getGetJobDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetJobDetails",
      requestType = job.JobManagement.JobRequest.class,
      responseType = job.JobManagement.JobDetailsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<job.JobManagement.JobRequest,
      job.JobManagement.JobDetailsResponse> getGetJobDetailsMethod() {
    io.grpc.MethodDescriptor<job.JobManagement.JobRequest, job.JobManagement.JobDetailsResponse> getGetJobDetailsMethod;
    if ((getGetJobDetailsMethod = JobServiceGrpc.getGetJobDetailsMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getGetJobDetailsMethod = JobServiceGrpc.getGetJobDetailsMethod) == null) {
          JobServiceGrpc.getGetJobDetailsMethod = getGetJobDetailsMethod =
              io.grpc.MethodDescriptor.<job.JobManagement.JobRequest, job.JobManagement.JobDetailsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetJobDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  job.JobManagement.JobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  job.JobManagement.JobDetailsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("GetJobDetails"))
              .build();
        }
      }
    }
    return getGetJobDetailsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JobServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobServiceStub>() {
        @java.lang.Override
        public JobServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobServiceStub(channel, callOptions);
        }
      };
    return JobServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JobServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobServiceBlockingStub>() {
        @java.lang.Override
        public JobServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobServiceBlockingStub(channel, callOptions);
        }
      };
    return JobServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static JobServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobServiceFutureStub>() {
        @java.lang.Override
        public JobServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobServiceFutureStub(channel, callOptions);
        }
      };
    return JobServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class JobServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void listAllJobs(job.JobManagement.EmptyRequest request,
        io.grpc.stub.StreamObserver<job.JobManagement.JobListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAllJobsMethod(), responseObserver);
    }

    /**
     */
    public void getJobDetails(job.JobManagement.JobRequest request,
        io.grpc.stub.StreamObserver<job.JobManagement.JobDetailsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetJobDetailsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListAllJobsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                job.JobManagement.EmptyRequest,
                job.JobManagement.JobListResponse>(
                  this, METHODID_LIST_ALL_JOBS)))
          .addMethod(
            getGetJobDetailsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                job.JobManagement.JobRequest,
                job.JobManagement.JobDetailsResponse>(
                  this, METHODID_GET_JOB_DETAILS)))
          .build();
    }
  }

  /**
   */
  public static final class JobServiceStub extends io.grpc.stub.AbstractAsyncStub<JobServiceStub> {
    private JobServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobServiceStub(channel, callOptions);
    }

    /**
     */
    public void listAllJobs(job.JobManagement.EmptyRequest request,
        io.grpc.stub.StreamObserver<job.JobManagement.JobListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAllJobsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getJobDetails(job.JobManagement.JobRequest request,
        io.grpc.stub.StreamObserver<job.JobManagement.JobDetailsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetJobDetailsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class JobServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<JobServiceBlockingStub> {
    private JobServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public job.JobManagement.JobListResponse listAllJobs(job.JobManagement.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAllJobsMethod(), getCallOptions(), request);
    }

    /**
     */
    public job.JobManagement.JobDetailsResponse getJobDetails(job.JobManagement.JobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetJobDetailsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class JobServiceFutureStub extends io.grpc.stub.AbstractFutureStub<JobServiceFutureStub> {
    private JobServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<job.JobManagement.JobListResponse> listAllJobs(
        job.JobManagement.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAllJobsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<job.JobManagement.JobDetailsResponse> getJobDetails(
        job.JobManagement.JobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetJobDetailsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_ALL_JOBS = 0;
  private static final int METHODID_GET_JOB_DETAILS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final JobServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(JobServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_ALL_JOBS:
          serviceImpl.listAllJobs((job.JobManagement.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<job.JobManagement.JobListResponse>) responseObserver);
          break;
        case METHODID_GET_JOB_DETAILS:
          serviceImpl.getJobDetails((job.JobManagement.JobRequest) request,
              (io.grpc.stub.StreamObserver<job.JobManagement.JobDetailsResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class JobServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    JobServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return job.JobManagement.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("JobService");
    }
  }

  private static final class JobServiceFileDescriptorSupplier
      extends JobServiceBaseDescriptorSupplier {
    JobServiceFileDescriptorSupplier() {}
  }

  private static final class JobServiceMethodDescriptorSupplier
      extends JobServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    JobServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (JobServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new JobServiceFileDescriptorSupplier())
              .addMethod(getListAllJobsMethod())
              .addMethod(getGetJobDetailsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
