package com.conan.factory.method;

public class MobikeFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Mobike();
    }
}
