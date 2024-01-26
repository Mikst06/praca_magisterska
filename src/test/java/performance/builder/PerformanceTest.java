package performance.builder;

import ug.master.mstempin.pattern.creational.CreationalService;

public class PerformanceTest {
    private static final CreationalService service = CreationalService.getInstance();

    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            builderObject_1();
            constructorObject_1();

            builderObject_2();
            constructorObject_2();

            builderObject_3();
            constructorObject_3();
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

    private static void constructorObject_3() {
        service.createObjectWithoutBuilder_3();
    }

}
