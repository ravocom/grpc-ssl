package com.rimaz.grpc.service;

import com.rimaz.availability.AvailabilityRequest;
import com.rimaz.availability.AvailabilityResponse;
import com.rimaz.availability.AvailabilityServiceGrpc;
import io.grpc.stub.StreamObserver;

public class AvailabilityServiceImpl extends AvailabilityServiceGrpc.AvailabilityServiceImplBase {

    @Override
    public void availability(AvailabilityRequest request, StreamObserver<AvailabilityResponse> responseObserver) {
        int flightId = request.getFlightId();
        System.out.println("SericeImpl- Getting the availability for the flight id " + flightId);

        responseObserver.onNext(AvailabilityResponse.newBuilder().setSeats(20).build());
        responseObserver.onCompleted();
    }
}
