package com.conan.proxy.demo01;

public class Proxy implements Rent{
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        signContract();
        toll();
    }

    public void seeHouse() {
        System.out.println("中介带看房子");
    }

    public void signContract() {
        System.out.println("签合同");
    }
    public void toll() {
        System.out.println("收中介费");
    }
}
