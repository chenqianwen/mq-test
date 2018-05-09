package com.example.userconnect;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.CountDownLatch;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserConnectApplicationTests {

    public static RestTemplate restTemplate = new RestTemplate();
    public static String url = "http://localhost:8086/sys/user/1";
    /**
     * 并发量
     */
    private static final int COUNT = 50;
    private static CountDownLatch cld = new CountDownLatch(COUNT);

    @Test
    public void testCon() throws InterruptedException {
        for (int i = 0; i < COUNT; i++) {
            new Thread(new UserRequest()).start();
            cld.countDown();
        }
        Thread.sleep(2000);
    }

    public class UserRequest implements Runnable{
        @Override
        public void run() {
            try {
                cld.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String body = restTemplate.getForEntity(url, String.class).getBody();
            System.out.println("-----------------------------"+body);
            System.out.println("");
            System.out.println("");
            System.out.println("");
        }
    }

}
