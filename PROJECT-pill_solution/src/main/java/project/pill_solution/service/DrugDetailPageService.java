package project.pill_solution.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.pill_solution.domain.Drug;
import project.pill_solution.dto.DrugResponseDto;
import project.pill_solution.repository.DrugRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DrugDetailPageService {

    private final DrugRepository drugRepository;
    public List<DrugResponseDto> drugList() {

        List<Drug> drugList = drugRepository.findAll();
        List<DrugResponseDto> responseDto = new ArrayList<>();

        for(Drug drug : drugList) {

            DrugResponseDto tempDto = new DrugResponseDto();
            tempDto.setDrugName(drug.getDrugName());
            tempDto.setDrugDetail(drug.getDrugDetail());
            tempDto.setImageUrl(drug.getImageUrl());
            tempDto.setDrugEffect(drug.getDrugEffect());
            tempDto.setDrugNumber(drug.getDrugNumber());

            responseDto.add(tempDto);
        }

        return responseDto;
    }



}
