package com.example.clientdemo3.controller;

import com.example.clientdemo3.bean.LoanBean;
import com.example.clientdemo3.entity.Loan;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName: LoanController
 * @Package com.example.clientdemo3.controller
 * @Description:
 * @Date 2018/6/4下午 2:13
 */
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
}
