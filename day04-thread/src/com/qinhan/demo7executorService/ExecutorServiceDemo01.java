package com.qinhan.demo7executorService;

import java.util.concurrent.*;

public class ExecutorServiceDemo01 {
    public static void main(String[] args) {
        // 目标：创建线程池对象来使用
        // 1.使用线程池的实现类ThreadPoolExecutor声明7个参数来创建线程池对象
        ExecutorService pool = new ThreadPoolExecutor(
                3,
                5,
                10,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(3),    // 任务队列
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );
        // 2.使用线程池来处理任务，看会不会复用线程
        Runnable target = new MyRunnable();
        pool.execute(target);   // 提交第一个任务 创建线程
        pool.execute(target);   // 提交第二个任务 创建线程
        pool.execute(target);   // 提交第三个任务 创建线程
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);   // 到了临时线程的创建时机
        pool.execute(target);   // 到了临时线程的创建时机
        pool.execute(target);   // 到了任务拒绝策略，忙不过来

        // 3.关闭线程池：一般不关闭线程池
        //pool.shutdown(); // 等所有任务执行完毕才关闭线程池
        //pool.shutdownNow(); // 立即关闭线程池
    }
}
