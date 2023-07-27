package com.scoopsservice.scoopsservice.controller;


import com.scoopsservice.scoopsservice.dto.ScoopRequest;
import com.scoopsservice.scoopsservice.dto.ScoopResponse;
import com.scoopsservice.scoopsservice.service.ScoopService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/scoop")
@RequiredArgsConstructor
public class ScoopController {

    private final ScoopService scoopService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createScoop(@RequestBody ScoopRequest scoopRequest) {
        scoopService.createScoop(scoopRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ScoopResponse> getAllProducts() {
        return scoopService.getAllScoops();
    }

}