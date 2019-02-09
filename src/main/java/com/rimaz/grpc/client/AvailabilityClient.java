package com.rimaz.grpc.client;

import com.rimaz.availability.AvailabilityRequest;
import com.rimaz.availability.AvailabilityResponse;
import com.rimaz.availability.AvailabilityServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.netty.shaded.io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;

import javax.net.ssl.SSLException;
import java.io.File;

public class AvailabilityClient {

    public static void main(String[] args) throws SSLException {
        AvailabilityClient client = new AvailabilityClient();
        client.run();
    }

    private void run() throws SSLException {
       // communicationViaNonSecureChannel();
        communicationViaSecureChannel();
    }




    private static void communicationViaNonSecureChannel() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        AvailabilityServiceGrpc.AvailabilityServiceBlockingStub stub = AvailabilityServiceGrpc.newBlockingStub(channel);
        AvailabilityResponse response = stub.availability(AvailabilityRequest.newBuilder().setFlightId(100).build());

        System.out.println("Server Response - Available Seats =" + response.getSeats());
    }

    private void communicationViaSecureChannel() throws SSLException {
        ManagedChannel channel = NettyChannelBuilder.forAddress("localhost", 50051)
                .sslContext(GrpcSslContexts.forClient().trustManager(new File("ssl/ca.crt")).build())
                .build();


        AvailabilityServiceGrpc.AvailabilityServiceBlockingStub stub = AvailabilityServiceGrpc.newBlockingStub(channel);
        AvailabilityResponse response = stub.availability(AvailabilityRequest.newBuilder().setFlightId(100).build());

        System.out.println("Server Response - Available Seats =" + response.getSeats());
    }


}
