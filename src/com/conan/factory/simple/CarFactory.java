package com.conan.factory.simple;
//静态工厂模式
//开闭原则

public class CarFactory {
    public static Car getCar(String car) {
        if (car.equals("五菱")) {
            return new WuLing();
        } else if (car.equals("特斯拉")) {
            return new Tesla();
        } else {
            return null;
        }
    }

    public static Car getWuLing() {
        return new WuLing();
    }

    public static Car getTesla() {
        return new Tesla();
    }
}
