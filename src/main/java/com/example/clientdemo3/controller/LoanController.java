package com.example.clientdemo3.controller;

import com.example.clientdemo3.bean.LoanBean;
import com.example.clientdemo3.entity.Loan;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName: LoanController
 * @Package com.example.clientdemo3.controller
 * @Description:
 * @Date 2018/6/4下午 2:13
 */
@Slf4j
@RestController
public class LoanController {
    @PostMapping(value = "testParams")
    public String testParams(@RequestBody LoanBean loanBean) throws InvocationTargetException, IllegalAccessException {
        System.out.println("LoanBean:"+loanBean);
        Loan loan = new Loan();
        BeanUtils.copyProperties(loan,loanBean);
        System.out.println("Loan:"+loan);
        return "成功";
    }

    @GetMapping("/test001")
    public String testGet(@PathVariable String param){
        System.out.println(param);
        return "GET:成功!";
    }
    @PostMapping("/test001")
    public String testPost(){
        System.out.println();
        return "POST:成功!";
    }

    @GetMapping("/test000002")
    public void testGet(){
        log.info("成功访问Get路径");
    }
}
