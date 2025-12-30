package com.stepup.pipeline.StepUp.controller;

import com.stepup.pipeline.StepUp.models.PipeLineStatusResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PipeLineController {


    @GetMapping("/status")
    public ResponseEntity<?> status() {
        PipeLineStatusResponse response = new PipeLineStatusResponse();
        response.setMessage("StepUp Pipeline is running");
        return ResponseEntity.badRequest().build();
    }
}
