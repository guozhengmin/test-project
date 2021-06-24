package com.mint.test.thread;

/**
 * @projectName: test-project
 * @packageName: com.mint.test.thread
 * @className: MyThread1
 * @description: 测试线程，继承 Thread 类
 * @author: Guo Zheng Min
 * @date: 6/23/2021
 */
public class MyThread1 extends Thread{

    private String name;

    public MyThread1() {
    }

    public MyThread1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("打印 " + name + " 第 " + i + " 次；");
        }
    }
}
