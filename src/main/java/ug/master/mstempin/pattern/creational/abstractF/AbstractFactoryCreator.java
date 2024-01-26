package ug.master.mstempin.pattern.creational.abstractF;

import ug.master.mstempin.pattern.creational.abstractF.model.AbstractObject;
import ug.master.mstempin.pattern.creational.abstractF.model.AbstractObjectType;

public abstract class AbstractFactoryCreator {

    abstract AbstractObject orderObject(AbstractObjectType type);

    public AbstractObject createObject(AbstractObjectType type) {
        AbstractObject object = orderObject(type);

        object.prepare();

        return object;
    }
}
