package performance.decorator;

import ug.master.mstempin.pattern.decorator.DecoratorService;

public class PerformanceTest {

    private static final DecoratorService service = DecoratorService.getInstance();

    public static void main(String[] args){
        for(int i = 0; i < 1000000; i++) {
//            _300KB_WithoutDecorator();
//            _300KB_WithDecorator();
//            _500KB_WithoutDecorator();
//            _500KB_WithDecorator();
//            _800KB_WithoutDecorator();
//            _800KB_WithDecorator();
//
            _800KB_WithDecorator_2Level();
//            _800KB_WithDecorator_3Level();
            _800KB_WithoutDecorator_2Level();
            _800KB_WithoutDecorator_3Level();
        }
    }

    private static void _300KB_WithoutDecorator() {service._300KB_WithoutDecorator();}
    private static void _300KB_WithDecorator() {
        service._300KB_WithDecorator_1Level();
    }

    private static void _500KB_WithoutDecorator() {service._500KB_WithoutDecorator();}
    private static void _500KB_WithDecorator() {
        service._500KB_WithDecorator_1Level();
    }

    private static void _800KB_WithoutDecorator() {service._800KB_WithoutDecorator();}
    private static void _800KB_WithDecorator() {
        service._800KB_WithDecorator_1Level();
    }
    //---------------------------------------------------------------------------------------
    private static void _800KB_WithDecorator_1Level() {
        service._800KB_WithDecorator_1Level();
    }
    private static void _800KB_WithDecorator_2Level() {
        service._800KB_WithDecorator_2Level();
    }
    private static void _800KB_WithDecorator_3Level() {
        service._800KB_WithDecorator_3Level();
    }
    private static void _800KB_WithoutDecorator_1Level() {
        service._800KB_WithoutDecorator();
    }
    private static void _800KB_WithoutDecorator_2Level() {
        service._800KB_WithoutDecorator_2Level();
    }
    private static void _800KB_WithoutDecorator_3Level() {
        service._800KB_WithoutDecorator_3Level();
    }
}
