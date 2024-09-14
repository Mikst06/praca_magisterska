package performance.chainOfResponsibility;

import ug.master.mstempin.pattern.chainOfResponsibility.ChainOfResponsibilityService;

public class PerformanceTest {

    private static final ChainOfResponsibilityService service = ChainOfResponsibilityService.getInstance();

    public static void main(String[] args){
        for(int i = 0; i < 1000000; i++) {
//            withChain_100KB();
//            withoutChain_100KB();
//            withChain_300KB();
//            withoutChain_300KB();
            withChain_500KB();
//            withoutChain_500KB();
//            withChain_800KB();
//            withoutChain_800KB();
//
//            withChain_800KB_10levels();
//            withoutChain_800KB_10levels();
//            withChain_800KB_30levels();
//            withoutChain_800KB_30levels();
//            withChain_800KB_50levels();
//            withoutChain_800KB_50levels();
        }
    }

    private static void withoutChain_100KB() {service.withoutChain_100KB();}
    private static void withChain_100KB() {
        service.withChain_100KB();
    }
    private static void withoutChain_300KB() {service.withoutChain_300KB();}
    private static void withChain_300KB() {
        service.withChain_300KB();
    }
    private static void withoutChain_500KB() {service.withoutChain_500KB();}
    private static void withChain_500KB() {
        service.withChain_500KB();
    }
    private static void withoutChain_800KB() {service.withoutChain_800KB();}
    private static void withChain_800KB() {
        service.withChain_800KB();
    }
    //--------------------------------------------------------------------------------------------------------
    private static void withChain_800KB_10levels() {service.withChain_800KB_10levels();}
    private static void withoutChain_800KB_10levels() {
        service.withoutChain_800KB_10levels();
    }
    private static void withChain_800KB_30levels() {service.withChain_800KB_30levels();}
    private static void withoutChain_800KB_30levels() {
        service.withoutChain_800KB_30levels();
    }
    private static void withChain_800KB_50levels() {service.withChain_800KB_50levels();}
    private static void withoutChain_800KB_50levels() {
        service.withoutChain_800KB_50levels();
    }
}
