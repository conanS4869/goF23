package com.conan.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//DCL懒汉式
public class SingletonDemo03 {
    private SingletonDemo03() {
        synchronized (SingletonDemo03.class) {
            if (instance != null) {
                throw new RuntimeException("不要试图破坏单例模式");
            }
        }
    }

    //不立即加载对象
    private volatile static SingletonDemo03 instance;

    //
    public static SingletonDemo03 getInstance() {
        if (instance == null) {
            synchronized (SingletonDemo03.class) {
                if (instance == null) {
                    instance = new SingletonDemo03();
                }
            }
        }
        return instance;
    }
    //1 分配内存
    //2 执行构造方法
    //3 指向地址
}

class SingletonDemo03Test {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        SingletonDemo03 instance = SingletonDemo03.getInstance();
        SingletonDemo03 instance2 = SingletonDemo03.getInstance();
        Constructor<SingletonDemo03> declaredConstructor = SingletonDemo03.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        SingletonDemo03 instance3 = declaredConstructor.newInstance();
        System.out.println(instance==instance2);
        System.out.println(instance==instance3);
    }
}
