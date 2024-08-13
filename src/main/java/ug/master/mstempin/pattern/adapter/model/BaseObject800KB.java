package ug.master.mstempin.pattern.adapter.model;

import ug.master.mstempin.pattern.creational.factory.simple.BaseObject;

public class BaseObject800KB extends BaseObject {
    public BaseObject800KB() {
        setBaseByte(new byte[800000]);
    }
}
