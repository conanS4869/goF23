package com.conan.builder.demo;
//指挥
public  class Director {
    //指挥工人按照顺序
    public Product build(Builder builder) {
        builder.builderA();
        builder.builderB();
        builder.builderC();
        builder.builderD();

        return builder.getProduct();

    }

}
