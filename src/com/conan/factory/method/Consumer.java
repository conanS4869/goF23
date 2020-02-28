package com.conan.factory.method;

public class Consumer {
    public static void main(String[] args) {
        Car car = new WuLingFactory().getCar();
        Car car2 = new TeslaFactory().getCar();
// 消费者到工厂拿车
        Car car3 = new MobikeFactory().getCar();

        car.name();
        car2.name();
        car3.name();
    }
}
