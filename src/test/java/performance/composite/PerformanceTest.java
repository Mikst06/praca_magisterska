package performance.composite;

import ug.master.mstempin.pattern.composite.CompositeService;

public class PerformanceTest {

    private static final CompositeService service = CompositeService.getInstance();

    public static void main(String[] args){
        for(int i = 0; i < 1000000; i++) {
            _300KB_WithComposite();
//            _300KB_WithoutComposite();
//            _500KB_WithComposite();
//            _500KB_WithoutComposite();
//            _800KB_WithComposite();
//            _800KB_WithoutComposite();
//
//            WithComposite_Level1();
//            WithoutComposite_Level1();
//            WithComposite_Level2();
//            WithoutComposite_Level2();
//            WithComposite_Level3();
//            WithoutComposite_Level3();
        }
    }

    private static void _300KB_WithoutComposite() {service._300KB_WithoutComposite();}
    private static void _300KB_WithComposite() {
        service._300KB_WithComposite();
    }

    private static void _500KB_WithoutComposite() {service._500KB_WithoutComposite();}
    private static void _500KB_WithComposite() {
        service._500KB_WithComposite();
    }

    private static void _800KB_WithoutComposite() {service._800KB_WithoutComposite();}
    private static void _800KB_WithComposite() {
        service._800KB_WithComposite();
    }

    private static void WithoutComposite_Level1() {service.WithoutComposite_Level1();}
    private static void WithComposite_Level1() {
        service.WithComposite_Level1();
    }

    private static void WithoutComposite_Level2() {service.WithoutComposite_Level2();}
    private static void WithComposite_Level2() {
        service.WithComposite_Level2();
    }

    private static void WithoutComposite_Level3() {service.WithoutComposite_Level3();}
    private static void WithComposite_Level3() {
        service.WithComposite_Level3();
    }
}
