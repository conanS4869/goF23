package com.conan.proxy.demo03;

public class Client {
    public static void main(String[] args) {
        Host host= new Host();

        //代理，现在没有
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //通过调用程序处理角色来处理我们要调用的接口对象
        pih.setRent(host);
        Rent proxy = (Rent) pih.getProxy();

        proxy.rent();

    }
}
