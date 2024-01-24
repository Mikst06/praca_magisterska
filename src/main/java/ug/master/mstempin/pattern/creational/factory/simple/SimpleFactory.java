package ug.master.mstempin.pattern.creational.factory.simple;

import ug.master.mstempin.pattern.creational.factory.simple.model.BaseObjectA;
import ug.master.mstempin.pattern.creational.factory.simple.model.BaseObjectB;
import ug.master.mstempin.pattern.creational.factory.simple.model.BaseObjectC;
import ug.master.mstempin.pattern.creational.factory.simple.model.BaseObjectType;

public class SimpleFactory {

    private static SimpleFactory instance;

    public static SimpleFactory getInstance() {
        if ( instance == null ) {
            instance = new SimpleFactory();
        }
        return instance;
    }
    public BaseObject createObject(BaseObjectType type) {
        switch (type) {
            case A:
                return new BaseObjectA();
            case B:
                return new BaseObjectB();
            case C:
                return new BaseObjectC();
            default:
                return null;
        }
    }
}
