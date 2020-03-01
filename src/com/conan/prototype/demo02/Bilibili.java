package com.conan.prototype.demo02;

import java.util.Date;

public class Bilibili {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        Video v1 = new Video("conan", date);
        Video v2 = (Video) v1.clone();

        System.out.println("v1=>"+v1);
        System.out.println("v2=>"+v2);

        System.out.println("================");
     //z   date.setTime(222233332);

        System.out.println("v1=>"+v1);
        System.out.println("v2=>"+v2);
    }
}

