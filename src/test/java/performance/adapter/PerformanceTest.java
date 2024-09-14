package performance.adapter;

import ug.master.mstempin.pattern.adapter.AdapterService;

public class PerformanceTest {

    private static final AdapterService service = AdapterService.getInstance();

    public static void main(String[] args){
        for(int i = 0; i < 1000000; i++) {
//            _300KB_WithoutAdapter();
//            _300KB_WithAdapter();
//            _500KB_WithoutAdapter();
//            _500KB_WithAdapter();
            _800KB_WithoutAdapter();
//            _800KB_WithAdapter();
        }
    }

    private static void _300KB_WithoutAdapter() {service._300KB_WithoutAdapter();}
    private static void _300KB_WithAdapter() {
        service._300KB_WithAdapter();
    }

    private static void _500KB_WithoutAdapter() {service._500KB_WithoutAdapter();}
    private static void _500KB_WithAdapter() {
        service._500KB_WithAdapter();
    }

    private static void _800KB_WithoutAdapter() {service._800KB_WithoutAdapter();}
    private static void _800KB_WithAdapter() {
        service._800KB_WithAdapter();
    }
}
