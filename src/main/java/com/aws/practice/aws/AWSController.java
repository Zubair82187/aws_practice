package com.aws.practice.aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AWSController {

    @GetMapping("/aws")
    public String helloAWS(){
        return "hello this is my first application on amazon aws EC2 and it is successfully deployed.";
    }
}
