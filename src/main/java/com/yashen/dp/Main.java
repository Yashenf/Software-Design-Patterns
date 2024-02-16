package com.yashen.dp;

import com.yashen.dp.faced.pack1.Faced;
import com.yashen.dp.faced.pack5.G;
import com.yashen.dp.factory.IPhone;
import com.yashen.dp.factory.PhoneFactory;
import com.yashen.dp.singleton.DBConnection;

public class Main {
    public static void main(String[] args) {
        Faced faced = new Faced(new G());
        // simple window
    }
}
