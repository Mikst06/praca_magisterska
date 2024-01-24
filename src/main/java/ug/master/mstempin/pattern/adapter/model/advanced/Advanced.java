package ug.master.mstempin.pattern.adapter.model.advanced;

import ug.master.mstempin.pattern.adapter.model.basic.Basic;

public class Advanced {

    Basic a;

    Basic b;

    Basic c;

    public Advanced(Basic a, Basic b, Basic c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Advanced() {
    }

    public Basic getA() {
        return a;
    }

    public Basic getB() {
        return b;
    }

    public Basic getC() {
        return c;
    }
}
