package com.conan.builder.demo02;

public class Test {
    public static void main(String[] args) {
        Worker worker=new Worker();
        //链式编程
        Product product = worker.builderD("奶茶")
                .builderA("拿铁")
                .builderC("全家桶")
                .getProduct();
        System.out.println(product.toString());
    }
}
