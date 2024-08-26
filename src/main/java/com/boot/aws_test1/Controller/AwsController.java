package com.boot.aws_test1.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AwsController {
    @GetMapping("/aws/v1")
    public String hello() {
        log.info("/aws/v1 호출");

        return "<h1>aws v1 호출</h1>";
    }
}