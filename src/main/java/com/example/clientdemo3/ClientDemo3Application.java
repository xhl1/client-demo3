package com.example.clientdemo3;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringCloudApplication
@EnableTransactionManagement
@EnableFeignClients
@EnableAspectJAutoProxy
public class ClientDemo3Application {

    public static void main(String[] args) {
        SpringApplication.run(ClientDemo3Application.class, args);
    }
}
