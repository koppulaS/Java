package com.Sai.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {
	   
    @GetMapping("/userServiceFallBack")
    public String userServiceFallBackMethod() {
        return "User Service is taking longer than Expected." +
                " Please try again later else Reachout Teja IT 7013781152";
    }
                  
    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallBackMethod() {
        return "Department Service is taking longer than Expected." +
                " Please try again later  else Reachout Teja IT 7013781152";
    }
}
