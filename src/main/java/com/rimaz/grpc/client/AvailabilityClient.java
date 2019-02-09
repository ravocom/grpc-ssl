package com.rimaz.grpc.client;

import com.rimaz.availability.AvailabilityRequest;
import com.rimaz.availability.AvailabilityResponse;
import com.rimaz.availability.AvailabilityServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class AvailabilityClient {

    public static void main(String[] args) {
        AvailabilityClient client = new AvailabilityClient();
        client.run();
    }

    private void run() {
        communicationViaNonSecureChannel();
    }



    private static void communicationViaNonSecureChannel() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        AvailabilityServiceGrpc.AvailabilityServiceBlockingStub stub = AvailabilityServiceGrpc.newBlockingStub(channel);
        AvailabilityResponse response = stub.availability(AvailabilityRequest.newBuilder().setFlightId(100).build());

        System.out.println("Server Response - Available Seats =" + response.getSeats());
    }


}
