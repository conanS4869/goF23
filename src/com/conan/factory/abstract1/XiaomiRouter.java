package com.conan.factory.abstract1;

public class XiaomiRouter implements IRouterProduct {
    @Override
    public void start() {
        System.out.println("小米路由开启");
    }

    @Override
    public void shutdown() {
        System.out.println("小米路由关机");

    }

    @Override
    public void openWifi() {
        System.out.println("小米路由开wifi");

    }

    @Override
    public void setting() {
        System.out.println("小米路由设置");

    }
}
