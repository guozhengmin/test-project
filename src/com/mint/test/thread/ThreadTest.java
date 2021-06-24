package com.mint.test.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @projectName: test-project
 * @packageName: com.mint.test.thread
 * @className: ThreadTest
 * @description: 线程测试
 * @author: Guo Zheng Min
 * @date: 6/23/2021
 */
public class ThreadTest {

    public static void main(String[] args) {
        /*
        龟兔赛跑：20米     //只要为了看到效果，所有距离缩短了
        要求：
        1.兔子每秒0.5米的速度，每跑2米休息10秒，
        2.乌龟每秒跑0.1米，不休息
        3.其中一个跑到终点后另一个不跑了

        返回最后的比赛时间
         */

//        thread1Test();
//        thread2Test();
        thread3Test();
    }


    /**
     * @author: Guo Zheng Min
     * @methodsName: thread1Test
     * @description: thread1Test
     * @date: 6/23/2021
     */
    private static void thread1Test() {
        //测试线程1， 通过继承 Thread 类
        Thread thread1_1 = new Thread(new MyThread1("thread1_1"));
        Thread thread1_2 = new Thread(new MyThread1("thread1_2"));
        //启动线程
        thread1_1.start();
        thread1_2.start();
    }

    /**
     * @author: Guo Zheng Min
     * @methodsName: thread2Test
     * @description: thread2Test
     * @date: 6/23/2021
     */
    private static void thread2Test() {
        //测试线程1， 通过继承 Thread 类
        Thread thread2_1 = new Thread(new MyThread2("thread2_1"));
        Thread thread2_2 = new Thread(new MyThread2("thread2_2"));
        //启动线程
        thread2_1.start();
        thread2_2.start();
    }

    /**
     * @author: Guo Zheng Min
     * @methodsName: thread3Test
     * @description: thread3Test
     * @date: 6/23/2021
     */
    private static void thread3Test() {
        FutureTask<String> futureTask = new FutureTask<String>(new MyThread3());
        new Thread(futureTask).start();

        try {
            String result = futureTask.get();
            System.out.println("返回值：" + result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
