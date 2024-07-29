package ug.master.mstempin.pattern.creational.factory.simple;

import ug.master.mstempin.pattern.creational.factory.simple.model.BaseObjectA;
import ug.master.mstempin.pattern.creational.factory.simple.model.BaseObjectB;
import ug.master.mstempin.pattern.creational.factory.simple.model.BaseObjectC;
import ug.master.mstempin.pattern.creational.factory.simple.model.BaseObjectType;

public class SimpleFactory2 {
    public BaseObject createObject(BaseObjectType type) {
        switch (type) {
            case A:
                return new BaseObjectA();
            case D2:
                return new BaseObjectB();
            case D3:
                return new BaseObjectB();
            case D4:
                return new BaseObjectB();
            case B:
                return new BaseObjectA();
            case D6:
                return new BaseObjectC();
            case D7:
                return new BaseObjectC();
            case D8:
                return new BaseObjectC();
            case D9:
                return new BaseObjectC();
            case C:
                return new BaseObjectA();
            default:
                return null;
        }
    }
}
