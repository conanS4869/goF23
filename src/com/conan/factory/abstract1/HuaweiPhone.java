package com.conan.factory.abstract1;

public class HuaweiPhone implements IphoneProduct {
    @Override
    public void start() {
        System.out.println("华为手机开启");
    }

    @Override
    public void shutdown() {
        System.out.println("华为手机关闭");
    }

    @Override
    public void callup() {
        System.out.println("华为手机打电话");
    }

    @Override
    public void sendSMS() {
        System.out.println("华为手机发短信");
    }
}
