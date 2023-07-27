package com.searchscoops.searchscoopsservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class ScoopResponse {

    private String city;
    private String specialization;
    private String drName;
    private String hospitalName;
    private String address;
    private String treatment;
    private String review;
    private String empName;
    private String empEmail;
    private String empPhone;
}
