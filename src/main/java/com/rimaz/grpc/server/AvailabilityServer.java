package com.rimaz.grpc.server;

import com.rimaz.grpc.service.AvailabilityServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class AvailabilityServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(50051)
                .addService(new AvailabilityServiceImpl())
                .build();

        server.start();

        System.out.println("gRPC server is up and running");

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Server is shutting down");
            server.shutdown();
        }));


        server.awaitTermination();
    }
}
