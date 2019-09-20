package com.example.usercwq.nihao.bean;

public class MainSingleton {
    private volatile static MainSingleton mainSingleton;

    private MainSingleton() {
    };

    public static MainSingleton getIntener() {
        if (mainSingleton == null) {
            synchronized (MainSingleton.class) {
                if (mainSingleton == null) {
                    mainSingleton = new MainSingleton();
                }
            }

        }
        return mainSingleton;
    }
}