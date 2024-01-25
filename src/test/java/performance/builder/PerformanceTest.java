package performance.builder;

import ug.master.mstempin.pattern.creational.CreationalService;

public class PerformanceTest {
    private static final CreationalService service = CreationalService.getInstance();

    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            builderObject();
            constructorObject();
        }
    }

    private static void builderObject() {
        service.createObjectByBuilder();
    }

    private static void constructorObject() {
        service.createObjectWithoutBuilder();
    }

}
