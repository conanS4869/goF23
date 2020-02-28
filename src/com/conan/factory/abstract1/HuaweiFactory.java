package com.conan.factory.abstract1;

public class HuaweiFactory implements IProductFactory {
    @Override
    public IphoneProduct iphoneProduct() {
        return new HuaweiPhone();
    }

    @Override
    public IRouterProduct iRouterProduct() {
        return new HuaweiRouter();
    }
}
