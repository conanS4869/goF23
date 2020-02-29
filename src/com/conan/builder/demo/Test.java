package com.conan.builder.demo;

public class Test {
    public static void main(String[] args) {
        Director director= new Director();
        //指挥具体工人
        Product build = director.build(new Worker());
        System.out.println(build.toString());

    }
}
