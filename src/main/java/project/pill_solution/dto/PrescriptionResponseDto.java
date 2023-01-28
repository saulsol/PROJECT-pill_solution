package project.pill_solution.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PrescriptionResponseDto {

    //디테일 페이지 제공 내용 [처방에 대한 세부 설명, 약 이름, 복용법, 효과, 이미지 URL, 치료방법 URL  ]

    private List<String> prescriptionDetail; //처방에 대한 세부 설명s

    private String drugName; // 약 이름

    private String drugEat; // 복용법

    private String drugEffect; // 효과

    private String drugProvideImageURL; //이미지 URL (보여주기용)

    List<String> cureURL; // 치료방법 URL
}
