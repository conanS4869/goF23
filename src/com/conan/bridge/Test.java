package com.conan.bridge;

public class Test {
    public static void main(String[] args) {
        //苹果笔记本
        Computer computer = new Laptop(new Apple());
        computer.info();
        //联想台式机
        Computer computer2 = new Desktop(new Lenovo());
                computer2.info();
                //戴尔手表
        Computer computer3 = new Watch(new Dell());
        computer3.info();
    }
}
