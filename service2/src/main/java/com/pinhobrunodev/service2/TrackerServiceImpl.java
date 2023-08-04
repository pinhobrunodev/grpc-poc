package com.pinhobrunodev.service2;

import io.grpc.stub.StreamObserver;

public class TrackerServiceImpl extends EventServiceGrpc.EventServiceImplBase {
    @Override
    public void createEvent(EventRequest request, StreamObserver<EventResponse> responseObserver) {

        EventResponse response = EventResponse.newBuilder()
                .setResult("Voce mandou isso => \n" + request.getEvent())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
