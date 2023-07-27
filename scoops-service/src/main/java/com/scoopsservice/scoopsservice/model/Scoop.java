package com.searchscoops.searchscoopsservice.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "scoop")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Scoop {
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
