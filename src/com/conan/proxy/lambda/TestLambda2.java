package com.conan.proxy.lambda;

public class TestLambda2 {
    public static void main(String[] args) {
        ILove love;
        love = (a) -> {
            System.out.println("i love " + a);
        };
        love = a -> {
            System.out.println("i love " + a);
        };

        love = a -> System.out.println("i love  " + a);
// 只有一行才能去掉{}
        //多个参数必须保持()
        love.love(521);
    }
}

interface ILove {
    void love(int a);
}
