package com.pinhobrunodev.service1;

import io.grpc.stub.StreamObserver;

public class SendToTrakerServiceImpl extends EventServiceGrpc.EventServiceImplBase {

    @Override
    public void createEvent(EventRequest request, StreamObserver<EventResponse> responseObserver) {
        EventResponse response = EventResponse.newBuilder().build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
