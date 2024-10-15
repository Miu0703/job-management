package com.example;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;
import io.grpc.protobuf.services.ProtoReflectionService;

public class JobServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(50052)
                .addService(new JobServiceImpl())
                .addService(ProtoReflectionService.newInstance()) // 添加反射服务
                .build();

        System.out.println("Server started, listening on port 50052");
        server.start();
        server.awaitTermination();
    }
}
