package com.yashen.dp.faced.pack1;

import com.yashen.dp.faced.pack2.C;
import com.yashen.dp.faced.pack5.G;

public class Faced {
    A a = new A();
    B b = new B();
    C c = new C();
    G g;

    public Faced(G g) {
        this.g = g;
    }

    public int process(){
        // do something complex things with those classes.
        /*
        * developer provide sequence , process. he hides complexity
        * */
        a.getI();
        b.n();
        g.m();
        return 10;
    }
}
