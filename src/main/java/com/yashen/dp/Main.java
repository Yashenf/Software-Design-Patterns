package com.yashen.dp;

import com.yashen.dp.factory.IPhone;
import com.yashen.dp.factory.PhoneFactory;
import com.yashen.dp.singleton.DBConnection;

public class Main {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();
        IPhone iPhone14ProMax = (IPhone) phoneFactory.getInstance();
    }
}
