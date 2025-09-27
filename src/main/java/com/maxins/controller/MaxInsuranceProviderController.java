package com.maxins.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/axismax-insurance-service")
public class MaxInsuranceProviderController {

    @GetMapping("/getAllPlans")
    public List<String> getAllPlans() {
        return List.of("Max Plan A", "Max Plan B", "Max Plan C");
    }
}
