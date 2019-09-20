package com.example.usercwq.nihao.bean;

/**
 * Created by usercwq on 2019/9/20.
 */

/**
 *
 * 诶韩式
 */
public class Singleton {
    private static Singleton singleTOp=  new Singleton();
    private Singleton(){};
    public static Singleton getInstance(){
        return singleTOp;
    }

}
