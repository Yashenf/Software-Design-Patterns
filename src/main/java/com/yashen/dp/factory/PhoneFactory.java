package com.yashen.dp.factory;

public class PhoneFactory implements AppleFactory{
    @Override
    public Apple getInstance() {
        return new IPhone();
    }
}
