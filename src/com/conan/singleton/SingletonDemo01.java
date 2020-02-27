package com.conan.singleton;
//饿汉式单例
public class SingletonDemo01{
//私有化构造器
    private SingletonDemo01() {
    }
//类初始化时，立即加载该对象
    private static SingletonDemo01 instance= new SingletonDemo01();
//提供获取该对象单方法，没有synchronzied，效率高
    public static SingletonDemo01 getInstance() {
        return instance;
    }
}

class SingletonDemo01Test {
    public static void main(String[] args) {
        SingletonDemo01 instance = SingletonDemo01.getInstance();
        SingletonDemo01 instance2 = SingletonDemo01.getInstance();
        System.out.println(instance==instance2);
    }
}
