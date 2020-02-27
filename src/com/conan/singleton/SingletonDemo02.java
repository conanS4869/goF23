package com.conan.singleton;
//懒汉式
public class SingletonDemo02 {

    private SingletonDemo02() {
    }
    //不立即加载对象
    private static SingletonDemo02 instance;
//有synchronized 效率低
    public static synchronized SingletonDemo02 getInstance() {
        if (instance == null) {
            instance= new SingletonDemo02();
        }
        return instance;
    }
}

class SingletonDemo02Test {
    public static void main(String[] args) {
        SingletonDemo02 instance = SingletonDemo02.getInstance();
        SingletonDemo02 instance2 = SingletonDemo02.getInstance();
        System.out.println(instance==instance2);
    }
}
