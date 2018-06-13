package com.example.clientdemo3.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: LoanController
 * @Package com.example.clientdemo3.controller
 * @Description:
 * @Date 2018/6/4下午 2:13
 */
@RestController
public class LoanController {
    @RequestMapping(value = "testParams",params = {"param1=value1","param2","!param3"})
    @ModelAttribute

    public String testParams(){
        System.out.println("test Params........");
        return "testParams";
    }
}
