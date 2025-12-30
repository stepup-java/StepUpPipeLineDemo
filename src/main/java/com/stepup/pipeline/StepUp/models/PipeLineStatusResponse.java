package com.stepup.pipeline.StepUp.models;

import lombok.Data;

import java.util.UUID;

@Data
public class PipeLineStatusResponse {

    private String id = UUID.randomUUID().toString();
    private String message;
    private String timestamp = String.valueOf(System.currentTimeMillis());
}
