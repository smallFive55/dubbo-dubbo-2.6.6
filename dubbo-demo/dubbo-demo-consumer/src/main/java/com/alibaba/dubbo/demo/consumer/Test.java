package com.alibaba.dubbo.demo.consumer;

import java.util.HashMap;

/**
 * TODO
 *
 * @author:Five-云析学院
 * @since:2019年06月19日 16:37
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("2","1");
        map.put("18","2");

//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("1");
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//        System.out.println(System.currentTimeMillis());
//        t.join();
//        System.out.println(System.currentTimeMillis());
//        t.start();
//        System.out.println(System.currentTimeMillis());
    }

}
