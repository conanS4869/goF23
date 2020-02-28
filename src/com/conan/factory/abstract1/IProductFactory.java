package com.conan.factory.abstract1;
//抽象产品工厂  需要在产品稳定的时候
public interface IProductFactory {

    //生产手机
    IphoneProduct iphoneProduct();
    //生产路由器
    IRouterProduct iRouterProduct();

    //生产笔记本 ...

}
