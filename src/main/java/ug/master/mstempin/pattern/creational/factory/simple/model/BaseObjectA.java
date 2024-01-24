package ug.master.mstempin.pattern.creational.factory.simple.model;

import ug.master.mstempin.pattern.creational.factory.simple.BaseObject;

public class BaseObjectA extends BaseObject {
    public BaseObjectA() {
        setBaseByte(new byte[900000]);
    }
}
