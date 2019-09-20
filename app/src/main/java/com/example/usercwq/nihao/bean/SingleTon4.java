package com.example.usercwq.nihao.bean;

/**
 * Created by usercwq on 2019/9/20.
 */

/**
 *
 * 静态内部类单例
 *
 */
public class SingleTon4 {
    private SingleTon4(){};
    public static SingleTon4 getInstance(){
        return SingleTonme.singleTon4;
    }
    private static class SingleTonme{
        private static SingleTon4 singleTon4=new SingleTon4();
    }
}
