package ug.master.mstempin.pattern.creational.abstractF;

import ug.master.mstempin.pattern.creational.abstractF.model.AbstractObject;
import ug.master.mstempin.pattern.creational.abstractF.model.AbstractObjectType;
import ug.master.mstempin.pattern.creational.abstractF.model.AbstractObject_A;
import ug.master.mstempin.pattern.creational.abstractF.model.AbstractObject_B;
import ug.master.mstempin.pattern.creational.abstractF.model.AbstractObject_C;
import ug.master.mstempin.pattern.creational.abstractF.part.PartFactory;
import ug.master.mstempin.pattern.creational.abstractF.part.PartFactoryI;

public class AbstractFactory extends AbstractFactoryCreator {

    private static AbstractFactory instance;

    public static AbstractFactory getInstance() {
        if ( instance == null ) {
            instance = new AbstractFactory();
        }
        return instance;
    }

    PartFactoryI partFactory = PartFactory.getInstance();

    AbstractObject orderObject(AbstractObjectType type) {
        switch (type) {
            case A:
                return new AbstractObject_A(partFactory);
            case B:
                return new AbstractObject_B(partFactory);
            case C:
                return new AbstractObject_C(partFactory);
            default:
                return null;
        }
    }
}
