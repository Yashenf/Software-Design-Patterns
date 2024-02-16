package com.yashen.dp.factory;

public class LaptopFactory implements AppleFactory{
    @Override
    public Apple getInstance() {
        return new MacBook();
    }
}
