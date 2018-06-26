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
            System.out.println("结束时间戳:" + ts);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void threadPerTaskWebServer() throws IOException {
        ServerSocket serverSocket = new ServerSocket(80);
        while (true) {
            Socket accept = serverSocket.accept();
        }
    }


    @Test
    public void test001() {
        Integer i = 1234;
        Integer j = 1234;
        if (i.equals(j)) {
            System.out.println(i + "equals" + j);
        } else {
            System.out.println(i + "!equals" + j);
        }

        Integer n = 127;
        Integer k = 127;
        if (n == k) {
            System.out.println(n + "==" + k);
        } else {
            System.out.println(n + "!=" + k);
        }
    }

    @Test
    public void contexTest() {
            new Thread(new Thread2("c")).start();
            new  Thread(new Thread2("d")).start();
    }

}

class Thread2 implements Runnable {
    private String name;

    public Thread2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println(name+"运行:"+i);
            try {
                Thread.sleep((int) (Math.random()*10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
