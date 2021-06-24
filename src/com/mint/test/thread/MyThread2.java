package com.mint.test.thread;

/**
 * @projectName: test-project
 * @packageName: com.mint.test.thread
 * @className: MyThread2
 * @description: 线程类，通过实现 Runnable
 * @author: Guo Zheng Min
 * @date: 6/23/2021
 */
public class MyThread2 implements Runnable{

    private String name;

    public MyThread2() {
    }

    public MyThread2(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("打印 " + name + " 第 " + i + " 次；");
        }
    }
}
