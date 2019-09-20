package com.example.usercwq.nihao.bean;

/**
 * Created by usercwq on 2019/9/20.
 */

public class SingleTon2 {

    private static SingleTon2 singleTon2;

    private SingleTon2(){};
    public static SingleTon2 getSingleTop2(){
        if (singleTon2==null) {
            singleTon2 = new SingleTon2();
        }
        return singleTon2;
    }
}
