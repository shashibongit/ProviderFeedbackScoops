package com.scoopsservice.scoopsservice.service;
import com.scoopsservice.scoopsservice.dto.ScoopRequest;
import com.scoopsservice.scoopsservice.dto.ScoopResponse;
import com.scoopsservice.scoopsservice.model.Scoop;
import com.scoopsservice.scoopsservice.repository.ScoopRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ScoopService {

    private final ScoopRepository scoopRepository;

    public void createScoop(ScoopRequest scoopRequest){
        Scoop scoop= Scoop.builder()
                .city(scoopRequest.getCity())
                .specialization(scoopRequest.getSpecialization())
                .drName(scoopRequest.getDrName())
                .hospitalName(scoopRequest.getHospitalName())
                .address(scoopRequest.getAddress())
                .treatment(scoopRequest.getTreatment())
                .review(scoopRequest.getReview()) //make a nlp call to validate the review (make a tag of good or bad review) + store in table
                .empName(scoopRequest.getEmpName())
                .empEmail(scoopRequest.getEmpEmail())
                .empPhone(scoopRequest.getEmpPhone())
                .build();
        scoopRepository.save(scoop);
        log.info("Scoop for {} is saved", scoop.getDrName());

                    }

    public List<ScoopResponse> getAllScoops() {
        List<Scoop> scoops = scoopRepository.findAll();

        return scoops.stream().map(this::mapToScoopResponse).toList();
    }

    private ScoopResponse mapToScoopResponse(Scoop scoop) {
        return ScoopResponse.builder()
                .city(scoop.getCity())
                .specialization(scoop.getSpecialization())
                .drName(scoop.getDrName())
                .hospitalName(scoop.getHospitalName())
                .address(scoop.getAddress())
                .treatment(scoop.getTreatment())
                .review(scoop.getReview())
                .empName(scoop.getEmpName())
                .empEmail(scoop.getEmpEmail())
                .empPhone(scoop.getEmpPhone())
                .build();
    }
}