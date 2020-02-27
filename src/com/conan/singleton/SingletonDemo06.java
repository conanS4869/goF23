package com.conan.singleton;

//枚举  安全 不能延时加载
public enum SingletonDemo06 {
    INSTANCE;

    public SingletonDemo06 getInstance() {
        return INSTANCE;
    }
}

class SingletonDemo06Test{
    public static void main(String[] args) {
        SingletonDemo06 instance = SingletonDemo06.INSTANCE;
        SingletonDemo06 instance2 = SingletonDemo06.INSTANCE;
        System.out.println(instance==instance2);
    }