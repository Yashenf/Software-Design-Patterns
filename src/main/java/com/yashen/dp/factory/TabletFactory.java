package com.yashen.dp.factory;

public class TabletFactory implements AppleFactory{
    @Override
    public Apple getInstance() {
        return new IPad();
    }
}
