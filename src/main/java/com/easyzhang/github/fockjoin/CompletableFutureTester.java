package com.easyzhang.github.fockjoin;

import com.alibaba.fastjson.JSON;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;

/**
 * @author EasyZhang
 * @date 2019/3/1 -  14:40
 */

public class CompletableFutureTester {

    public static void main(String[] args){
      CompletableFuture<Void> completableFutur = CompletableFuture.runAsync(()->{
          //正确情况
         /* System.out.println("我进入到线程内部了...");*/
          //错误情况
           Object object = null;
           object.toString();
        });
      completableFutur.whenComplete((k,v)->{
           if(Objects.nonNull(v)){
               System.out.println("报错了...");
           }
      });
    }
}
