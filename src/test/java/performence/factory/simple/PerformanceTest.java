package performence.factory.simple;

import ug.master.mstempin.pattern.creational.CreationalService;
import ug.master.mstempin.pattern.creational.factory.simple.SimpleFactory;
import ug.master.mstempin.pattern.creational.factory.simple.model.BaseObjectType;

public class PerformanceTest {

    private static final SimpleFactory simpleFactory = SimpleFactory.getInstance();
    private static final CreationalService service = CreationalService.getInstance();

    public static void main(String[] args){
        for(int i = 0; i < 1000000; i++) {
            simpleFactory_ObjectA();
            constructor_ObjectA();

            simpleFactory_ObjectB();
            constructor_ObjectB();

            simpleFactory_ObjectC();
            constructor_ObjectC();
        }
    }

    private static void simpleFactory_ObjectA() {
        simpleFactory.createObject(BaseObjectType.A);
    }

    private static void simpleFactory_ObjectB() {
        simpleFactory.createObject(BaseObjectType.B);
    }

    private static void simpleFactory_ObjectC() {
        simpleFactory.createObject(BaseObjectType.C);
    }

    private static void constructor_ObjectA() {
        service.createBaseObjectA();
    }

    private static void constructor_ObjectB() {
        service.createBaseObjectB();
    }

    private static void constructor_ObjectC() {
        service.createBaseObjectC();
    }
}
