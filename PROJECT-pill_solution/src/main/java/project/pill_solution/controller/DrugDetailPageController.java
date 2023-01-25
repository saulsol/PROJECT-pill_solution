package project.pill_solution.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.pill_solution.dto.DrugResponseDto;
import project.pill_solution.service.DrugDetailPageService;


import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/{symptomId}")
public class DrugDetailPageController {

    private final DrugDetailPageService drugDetailPageService;

    @GetMapping("/{detailId}")
    public List<DrugResponseDto> list() {

        return drugDetailPageService.drugList();
    }
}
