package performance.builder;

import ug.master.mstempin.pattern.creational.CreationalService;

public class PerformanceTest {
    private static final CreationalService service = CreationalService.getInstance();

    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
//            builderObject_1();
//            constructorObject_1();
//
//            builderObject_2();
//            constructorObject_2();
//
//            builderObject_3();
//            constructorObject_3();

//            builderObject_3_50field();
//            constructorObject_3_50field();

//            builderObject_3_100field();
            constructorObject_3_100field();
        }
    }

    private static void builderObject_1() {
        service.createObjectByBuilder_1();
    }

    private static void constructorObject_1() {
        service.createObjectWithoutBuilder_1();
    }

    private static void builderObject_2() {
        service.createObjectByBuilder_2();
    }

    private static void constructorObject_2() {
        service.createObjectWithoutBuilder_2();
    }

    private static void builderObject_3() {
        service.createObjectByBuilder_3();
    }

    private static void constructorObject_3() {service.createObjectWithoutBuilder_3();}

    private static void builderObject_3_50field() {
        service.createObjectByBuilder_3_50field();
    }

    private static void constructorObject_3_50field() {service.createObjectWithoutBuilder_3_50field();}

    private static void builderObject_3_100field() {
        service.createObjectByBuilder_3_100field();
    }

    private static void constructorObject_3_100field() {service.createObjectWithoutBuilder_3_100field();}

}
