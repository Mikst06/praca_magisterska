package performance.mediator;

import ug.master.mstempin.pattern.mediator.MediatorService;

public class PerformanceTest {

    private static final MediatorService service = MediatorService.getInstance();

    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {

//            _2_With_MEDIATOR();
//            _2_WITHOUT();
//            _4_With_MEDIATOR();
//            _4_WITHOUT();
//            _6_With_MEDIATOR();
            _6_WITHOUT();
        }
    }

    private static void _2_With_MEDIATOR() {service._2_components_MEDIATOR();}
    private static void _2_WITHOUT() {
        service._2_components_WITHOUT();
    }
    private static void _4_With_MEDIATOR() {service._4_components_MEDIATOR();}
    private static void _4_WITHOUT() {
        service._4_components_WITHOUT();
    }
    private static void _6_With_MEDIATOR() {service._6_components_MEDIATOR();}
    private static void _6_WITHOUT() {
        service._6_components_WITHOUT();
    }
}
