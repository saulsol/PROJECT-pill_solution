package project.pill_solution.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.pill_solution.domain.Prescription;
import project.pill_solution.domain.Symptom;
import project.pill_solution.dto.PrescriptionResponseDto;
import project.pill_solution.dto.SymptomResponseDto;
import project.pill_solution.repository.PrescriptionRepository;
import project.pill_solution.repository.SymptomRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DetailPageService {

    private final PrescriptionRepository prescriptionRepository;
    public List<PrescriptionResponseDto> prescriptionList() {

        List<Prescription> prescriptions = prescriptionRepository.findAll();
        List<PrescriptionResponseDto> responseDto = new ArrayList<>();

        for(Prescription prescription : prescriptions) {

            PrescriptionResponseDto tempDto = new PrescriptionResponseDto();
            tempDto.setPrescriptionName(prescription.getPrescriptionName());
            tempDto.setImageUrl(prescription.getImageUrl());
            tempDto.setPrescriptionDetail(prescription.getPrescriptionDetail());
            tempDto.setPrescriptionNumber(prescription.getPrescriptionNumber());

            responseDto.add(tempDto);
        }

        return responseDto;
    }



}
