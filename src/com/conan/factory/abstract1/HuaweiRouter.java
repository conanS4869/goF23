package com.conan.factory.abstract1;

public class HuaweiRouter implements IRouterProduct {
    @Override
    public void start() {
        System.out.println("华为路由开启");
    }

    @Override
    public void shutdown() {
        System.out.println("华为路由关机");

    }

    @Override
    public void openWifi() {
        System.out.println("华为路由开wifi");

    }

    @Override
    public void setting() {
        System.out.println("华为路由设置");

    }
}
