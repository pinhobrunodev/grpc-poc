package com.pinhobrunodev.service1;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class CreateEventTrackerClient {

    private final EventServiceGrpc.EventServiceBlockingStub eventServiceBlockingStub;

    public CreateEventTrackerClient(String host, int port) {
        ManagedChannel channel =
                ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
        eventServiceBlockingStub = EventServiceGrpc.newBlockingStub(channel);
    }

    public void create(CreateEventDto createEventDto) {
        EventRequest request = EventRequest.newBuilder()
                .setEvent(
                        Event.newBuilder()
                                .setEventId(createEventDto.getEventId())
                                .setEventName(createEventDto.getEventName())
                                .setEventImgLink(createEventDto.getEventImgLink())
                                .setEventAddress(createEventDto.getEventAddress())
                                .setLat(createEventDto.getLat())
                                .setLng(createEventDto.getLng())
                                .addAllCategories(createEventDto.getCategories())
                                .build()
                )
                .build();
        EventResponse response = eventServiceBlockingStub.createEvent(request);
        System.out.println(response.getResult());
    }
}
