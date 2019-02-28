package com.easyzhang.github.blockqueue;

import java.util.concurrent.BlockingQueue;

/**
 * @author EasyZhang
 * @date 2019/2/25 -  14:52
 */

public class Procuder implements Runnable {

    private BlockingQueue<String> blockingQueue;

    public Procuder(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    public void run() {
        for(int i=0 ; i<10 ;i++){
            try {
                System.out.println("塞入数据" + i);
                blockingQueue.put(i+"");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
