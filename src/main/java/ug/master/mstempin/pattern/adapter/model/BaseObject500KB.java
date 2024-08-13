package ug.master.mstempin.pattern.adapter.model;

import ug.master.mstempin.pattern.creational.factory.simple.BaseObject;

public class BaseObject500KB extends BaseObject {

    public BaseObject500KB() {
        setBaseByte(new byte[500000]);
    }
}
