package project.pill_solution.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PrescriptionResponseDto {

    // 처방 DTO - 세번째 페이지
    // 처방 종류의 이름과 처방에 대한 상세설명
    
    private String prescriptionName;

    private String prescriptionDetail;

    private String imageUrl;

    private String prescriptionNumber;
}
