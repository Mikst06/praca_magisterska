package ug.master.mstempin.pattern.creational.factory.simple.model;

import ug.master.mstempin.pattern.creational.factory.simple.BaseObject;

public class BaseObjectC extends BaseObject {

    public BaseObjectC() {
        setBaseByte(new byte[300000]);
    }
}
