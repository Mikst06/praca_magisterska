package performence.adapter;

import ug.master.mstempin.pattern.adapter.AdapterService;

public class PerformenceTest {

    private static final AdapterService service = AdapterService.getInstance();

    public static void main(String[] args){
        for(int i = 0; i < 1000000; i++) {
//            basicAdapterWithout();
//            basicAdapterWith();
//            advancedAdapterWithout();
//            advancedAdapterWith();
//            advancedAdapterWithout_BIG_DATA();
//            advancedAdapterWith_BIG_DATA();
            advancedAdapterWithout_HUGE_DATA();
//            advancedAdapterWith_HUGE_DATA();
        }
    }

    private static void basicAdapterWithout() {service.basicToClientObjectWithoutAdapter();}
    private static void basicAdapterWith() {
        service.basicToClientObjectWithAdapter();
    }

    private static void advancedAdapterWithout() {service.advancedToClientObjectWithoutAdapter();}
    private static void advancedAdapterWith() {
        service.advancedToClientObjectWithAdapter();
    }

    private static void advancedAdapterWithout_BIG_DATA() {service.advancedToClientObjectWithoutAdapter_BIG_DATA();}
    private static void advancedAdapterWith_BIG_DATA() {
        service.advancedToClientObjectWithAdapter_BIG_DATA();
    }

    private static void advancedAdapterWithout_HUGE_DATA() {service.advancedToClientObjectWithoutAdapter_HUGE_DATA();}
    private static void advancedAdapterWith_HUGE_DATA() {service.advancedToClientObjectWithAdapter_HUGE_DATA();}
}
