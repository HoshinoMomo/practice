package com.easyzhang.github.blockqueue;


import java.util.concurrent.BlockingQueue;

/**
 * @author EasyZhang
 * @date 2019/2/25 -  14:53
 */

public class Cousumer implements Runnable {

    private BlockingQueue<String> blockingQueue;

    public Cousumer(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    public void run() {
        while (true){
            try {
                System.out.println("消费者消费" + blockingQueue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
