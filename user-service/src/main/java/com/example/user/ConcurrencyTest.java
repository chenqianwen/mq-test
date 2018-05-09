package com.example.user;

import org.springframework.web.client.RestTemplate;

import java.util.concurrent.CountDownLatch;

/**
 * @author： ygl
 * @date： 2018/5/9-17:12
 * @Description：
 * 并发测试
 */
public class ConcurrencyTest {

    public static RestTemplate restTemplate = new RestTemplate();
    public static String url = "http://localhost:8086/sys/user/1";
    /**
     * 并发量
     */
    private static final int COUNT = 50;
    private static CountDownLatch cld = new CountDownLatch(COUNT);

    public static void main(String[] args) throws InterruptedException {
        ConcurrencyTest test = new ConcurrencyTest();
        test.testCon();
    }

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
