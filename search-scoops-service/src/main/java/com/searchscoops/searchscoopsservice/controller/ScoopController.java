package com.searchscoops.searchscoopsservice.controller;


import com.searchscoops.searchscoopsservice.dto.ScoopRequest;
import com.searchscoops.searchscoopsservice.dto.ScoopResponse;
import com.searchscoops.searchscoopsservice.model.Scoop;
import com.searchscoops.searchscoopsservice.service.ScoopService;
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