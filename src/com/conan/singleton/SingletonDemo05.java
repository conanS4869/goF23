package com.conan.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//DCL懒汉式
public class SingletonDemo05 {
    private static boolean flag=false;

    private SingletonDemo05() {
        synchronized (SingletonDemo03.class) {
            if (flag == false) {
                flag=true;
            }else {
                throw new RuntimeException("不要试图破坏单例模式");
            }

        }
    }

    //不立即加载对象
    private volatile static SingletonDemo05 instance;

    //
    public static SingletonDemo05 getInstance() {
        if (instance == null) {
            synchronized (SingletonDemo05.class) {
                if (instance == null) {
                    instance = new SingletonDemo05();
                }
            }
        }
        return instance;
    }
    //1 分配内存
    //2 执行构造方法
    //3 指向地址
}

class SingletonDemo05Test {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Constructor<SingletonDemo05> declaredConstructor = SingletonDemo05.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        SingletonDemo05 instance3 = declaredConstructor.newInstance();
        SingletonDemo05 instance = declaredConstructor.newInstance();

        System.out.println(instance==instance3);
    }
}
