package com.example.clientdemo3.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @ClassName: LoanService
 * @Package com.example.clientdemo3.service
 * @Description:
 * @Date 2018/6/4下午 2:12
 */
@Service
public class LoanService {

    @Async
    public void executAsyncTask(Integer integer){
        System.out.println("执行异步任务"+integer);

    }
}
