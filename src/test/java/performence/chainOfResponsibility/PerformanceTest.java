package performence.chainOfResponsibility;

import ug.master.mstempin.pattern.chainOfResponsibility.ChainOfResponsibilityService;

public class PerformanceTest {

    private static final ChainOfResponsibilityService service = ChainOfResponsibilityService.getInstance();

    public static void main(String[] args){
        for(int i = 0; i < 1000000; i++) {
            withoutChain_three_numbers();
//            withChain_three_numbers();

//            withoutChain_ten_numbers();
//            withChain_ten_numbers();
        }
    }

    private static void withoutChain_three_numbers() {service.withoutChain_three_numbers();}
    private static void withChain_three_numbers() {
        service.withChain_three_numbers();
    }

    private static void withoutChain_ten_numbers() {service.withoutChain_ten_numbers();}
    private static void withChain_ten_numbers() {
        service.withChain_ten_numbers();
    }
}
