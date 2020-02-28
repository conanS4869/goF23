package com.conan.factory.abstract1;

public class Client {
    public static void main(String[] args) {
        System.out.println("========小米系列=======");
        //小米工厂
        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        IphoneProduct iphoneProduct = xiaomiFactory.iphoneProduct();
        iphoneProduct.callup();
        iphoneProduct.sendSMS();

        IRouterProduct iRouterProduct = xiaomiFactory.iRouterProduct();
        iRouterProduct.openWifi();


        System.out.println("========华为系列=======");
        //华为工厂
        HuaweiFactory huaweiFactory = new HuaweiFactory();
         iphoneProduct = huaweiFactory.iphoneProduct();
         iphoneProduct.callup();
         iphoneProduct.sendSMS();

         iRouterProduct= huaweiFactory.iRouterProduct();
         iRouterProduct.openWifi();
    }
}
