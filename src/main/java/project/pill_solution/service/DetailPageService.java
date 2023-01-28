package project.pill_solution.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.pill_solution.domain.Prescription;
import project.pill_solution.dto.PrescriptionResponseDto;
import project.pill_solution.repository.PrescriptionRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DetailPageService {

    private final PrescriptionRepository prescriptionRepository;

    public List<PrescriptionResponseDto> prescriptionList(Long id){

        List<Prescription> prescriptions = prescriptionRepository.findBySymptom_SymptomId(id);
        List<PrescriptionResponseDto> responseDto = new ArrayList<>();

        for(Prescription prescription : prescriptions){

            PrescriptionResponseDto tempDto = new PrescriptionResponseDto();
            tempDto.setPrescriptionDetail(prescription.getPrescriptionDetail());
            tempDto.setDrugName(prescription.getDrugName());
            tempDto.setDrugEat(prescription.getDrugEat());
            tempDto.setDrugEffect(prescription.getDrugEffect());
            tempDto.setDrugProvideImageURL(prescription.getDrugProvideImageURL());
            tempDto.setCureURL(prescription.getCureURL());

            responseDto.add(tempDto);
        }

        return responseDto;
    }



}
