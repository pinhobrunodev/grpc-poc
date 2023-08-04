package com.pinhobrunodev.service1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateEventDto {
    private String eventId;
    private String eventName;
    private String eventImgLink;
    private String eventAddress;
    private String lat;
    private String lng;
    private List<String> categories = new ArrayList<>();

}