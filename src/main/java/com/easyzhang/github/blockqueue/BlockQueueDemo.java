package com.easyzhang.github.blockqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author EasyZhang
 * @date 2019/2/25 -  14:48
 */

public class BlockQueueDemo {

    public static void main(String[] args){
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<String>(5);
        new Thread(new Procuder(blockingQueue)).start();
        new Thread(new Cousumer(blockingQueue)).start();
    }

}
