package com.conan.proxy.proxystatic;

public class StaticProxy {
    public static void main(String[] args) {
        You you = new You();
        new Thread(()-> System.out.println("我爱你")).start();

        new WeddingCompany(new You()).happyMarry();
    }
}

interface  Marry{
    void happyMarry();
}

class You implements Marry{

    @Override
    public void happyMarry() {
        System.out.println("要结婚了");
    }
}

class WeddingCompany implements Marry{
private Marry target;

    public WeddingCompany(Marry target) {
        this.target = target;
    }

    @Override
    public void happyMarry() {
        before();
        this.target.happyMarry();
        after();
    }

    private void after() {
        System.out.println("后期收尾");
    }

    private void before() {
        System.out.println("前期准备");
    }
}
