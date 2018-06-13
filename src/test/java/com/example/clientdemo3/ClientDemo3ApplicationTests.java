package com.example.clientdemo3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientDemo3ApplicationTests {

    //获取当日开始时间戳
    @Test
    public void contextLoads() {
        long timeStamp = 1531843199000L;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
        System.out.println(sd);
        try {
            Date date = sdf.parse(sd);
            long ts = date.getTime();
            System.out.println("开始时间戳:" + ts);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    //获取当日结束时间戳
    @Test
    public void dateToTimestamp() {
        long timeStamp = 1542902400000L;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
        String time = sd + " 23:59:59";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date = simpleDateFormat.parse(time);
            long ts = date.getTime();
            System.out.println("结束时间戳:"+ts);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void threadPerTaskWebServer() throws IOException {
        ServerSocket serverSocket = new ServerSocket(80);
        while (true){
            Socket accept = serverSocket.accept();
        }
    }

}
