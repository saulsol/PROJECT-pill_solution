package project.pill_solution.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.pill_solution.dto.PrescriptionResponseDto;
import project.pill_solution.dto.SymptomResponseDto;
import project.pill_solution.service.DetailPageService;
import project.pill_solution.service.MainPageService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/{symptomId}")
public class DetailPageController {
    // 세 번째 페이지
    // 증상에 대한 아이디가 넘어왔을 때 해당 증상에 대한 상세정보 리턴
    private final DetailPageService detailPageService;
    @GetMapping
    public List<PrescriptionResponseDto> list() {

        return detailPageService.prescriptionList();
    }

    //

}
