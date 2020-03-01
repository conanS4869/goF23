package com.conan.adapter;
//客户端, 想上网，插不上线
public class Computer {
    public void net(NetToUsb adapter) {
        //找一个转接头
        adapter.handleRequest();
    }

    public static void main(String[] args) {
        Computer computer= new Computer();  //电脑
        Adaptee adaptee= new Adaptee();   //网线
        Adapter2 adapter= new Adapter2(adaptee);  //适配器

        computer.net(adapter);

    }
}
