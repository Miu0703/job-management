# Job Management System

## Overview

This repository contains both the backend gRPC service and the frontend Vue.js application for a job management system.

- **Backend**: A Java-based gRPC service running on port 50052.
- **Frontend**: A Vue.js application served on port 8080.
- **Proxy**: A gRPC-Web proxy to bridge the communication between the frontend and backend.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Node.js and npm
- Protocol Buffers compiler (`protoc`)
- gRPC-Web proxy (`grpcwebproxy`)

## Backend (gRPC Service)

### Setup

1. **Navigate to Backend Directory**

   ```sh
   cd backend
   ```

2. **Build and Run the gRPC Service**

   ```sh
   ./gradlew build
   ./gradlew run
   ```

   The gRPC server will start on port 50052.

### Notes

- Make sure the required dependencies are installed, such as `grpc-java` and `netty`.

## Frontend (Vue.js Application)

### Setup

1. **Navigate to Frontend Directory**

   ```sh
   cd frontend
   ```

2. **Install Dependencies**

   ```sh
   npm install
   ```

3. **Generate gRPC Web Client Code**

   ```sh
   protoc --proto_path=../backend/proto job_management.proto --js_out=import_style=commonjs:./src/grpc --grpc-web_out=import_style=commonjs,mode=grpcwebtext:./src/grpc
   ```

4. **Run Vue.js Application**

   ```sh
   npm run serve
   ```

   The application will be served on `http://localhost:8080`.

### Notes

- Make sure the gRPC web proxy is running to bridge the communication between the Vue.js frontend and the gRPC backend.
- Run the proxy using:

  ```sh
  grpcwebproxy --backend_addr=localhost:50052 --run_tls_server=false --allow_all_origins
  ```

