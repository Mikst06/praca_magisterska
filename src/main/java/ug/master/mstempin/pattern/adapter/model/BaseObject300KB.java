package ug.master.mstempin.pattern.adapter.model;

import ug.master.mstempin.pattern.creational.factory.simple.BaseObject;

public class BaseObject300KB extends BaseObject {

    public BaseObject300KB() {
        setBaseByte(new byte[300000]);
    }
}
