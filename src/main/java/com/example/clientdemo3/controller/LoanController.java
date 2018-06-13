package com.example.clientdemo3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: LoanController
 * @Package com.example.clientdemo3.controller
 * @Description:
 * @Date 2018/6/4下午 2:13
 */
@RestController
public class LoanController {
    @GetMapping(value = "testParams")
    public String testParams(){
        System.out.println("test Params........");
        return "testParams";
    }
}
