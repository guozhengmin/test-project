package com.mint.test.thread;

import java.util.concurrent.Callable;

/**
 * @projectName: test-project
 * @packageName: com.mint.test.thread
 * @className: MyThread3
 * @description: 线程类，通过实现 Callable
 * @author: Guo Zheng Min
 * @date: 6/23/2021
 */
public class MyThread3 implements Callable {


    @Override
    public Object call() throws Exception {
        return "通过 CallAble 创建线程";
    }
}
