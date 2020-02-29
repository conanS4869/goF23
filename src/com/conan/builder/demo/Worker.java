package com.conan.builder.demo;

public class Worker extends Builder {

    private Product product;

    public Worker() {
        product = new Product();
    }

    @Override
    void builderA() {
        product.setBuilderA("地基");
        System.out.println("地基");
    }

    @Override
    void builderB() {
        product.setBuilderB("电线");
        System.out.println("电线");
    }

    @Override
    void builderC() {
        product.setBuilderC("水泥");
        System.out.println("水泥");
    }

    @Override
    void builderD() {
        product.setBuilderD("粉刷");
        System.out.println("粉刷");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
