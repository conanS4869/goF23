package com.conan.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//静态内部类
public class SingletonDemo04 {
    private SingletonDemo04() {
    }
    private static class InnerClass{
        private static final SingletonDemo04 instance= new SingletonDemo04();
    }

    public static SingletonDemo04 getInstance() {
        return InnerClass.instance;
    }
}

class SingletonDemo04Test {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        SingletonDemo04 instance = SingletonDemo04.getInstance();
        SingletonDemo04 instance2 = SingletonDemo04.getInstance();

        Constructor<SingletonDemo04> declaredConstructor = SingletonDemo04.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        SingletonDemo04 instance3 = declaredConstructor.newInstance();
        System.out.println(instance==instance2);
        System.out.println(instance==instance3);
    }
}
