package performance.factory.abstractF;

import ug.master.mstempin.pattern.creational.CreationalService;
import ug.master.mstempin.pattern.creational.abstractF.AbstractFactory;
import ug.master.mstempin.pattern.creational.abstractF.model.AbstractObjectType;

public class PerformanceTest {

    private static final AbstractFactory abstractFactory = AbstractFactory.getInstance();
    private static final CreationalService service = new CreationalService();

    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            abstractFactory_ObjectA();
            constructor_ObjectA();

            abstractFactory_ObjectB();
            constructor_ObjectB();

            abstractFactory_ObjectC();
            constructor_ObjectC();
        }
    }

    private static void abstractFactory_ObjectA() {
        abstractFactory.createObject(AbstractObjectType.A);
    }

    private static void abstractFactory_ObjectB() {
        abstractFactory.createObject(AbstractObjectType.B);
    }

    private static void abstractFactory_ObjectC() {
        abstractFactory.createObject(AbstractObjectType.C);
    }

    private static void constructor_ObjectA() {
        service.createAbstractObjectA();
    }

    private static void constructor_ObjectB() {
        service.createAbstractObjectB();
    }

    private static void constructor_ObjectC() {
        service.createAbstractObjectC();
    }
}
