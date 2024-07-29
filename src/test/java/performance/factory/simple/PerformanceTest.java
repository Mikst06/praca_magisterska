package performance.factory.simple;

import ug.master.mstempin.pattern.creational.CreationalService;
import ug.master.mstempin.pattern.creational.factory.simple.SimpleFactory;
import ug.master.mstempin.pattern.creational.factory.simple.model.BaseObjectType;

public class PerformanceTest {
    private static final CreationalService service = new CreationalService();

    public static void main(String[] args){
        for(int i = 0; i < 1000000; i++) {
            simpleFactory_ObjectA();
//            constructor_ObjectA();
//            simpleFactory_ObjectA_Singleton();

//            simpleFactory_ObjectB();
//            constructor_ObjectB();

//            simpleFactory_ObjectC();
//            constructor_ObjectC();

//            simpleFactory_Object_1();
//            simpleFactory_Object_5();
//            simpleFactory_Object_10();
        }
    }

    private static void simpleFactory_ObjectA() {
        CreationalService creationalService = new CreationalService();
        creationalService.createBaseObjectABySimpleFactory();
    }

    private static void simpleFactory_ObjectA_Singleton() {
        service.createBaseObjectABySimpleFactory();
    }

    private static void simpleFactory_ObjectB() {
        service.createBaseObjectBBySimpleFactory();
    }

    private static void simpleFactory_ObjectC() {
        service.createBaseObjectCBySimpleFactory();
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

    private static void simpleFactory_Object_1() {
        service.createBaseObject_1_BySimpleFactory2();
    }

    private static void simpleFactory_Object_5() {
        service.createBaseObject_5_BySimpleFactory2();
    }

    private static void simpleFactory_Object_10() {
        service.createBaseObject_10_BySimpleFactory2();
    }
}
