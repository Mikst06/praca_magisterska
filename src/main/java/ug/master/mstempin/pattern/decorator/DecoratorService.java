package ug.master.mstempin.pattern.decorator;

import ug.master.mstempin.pattern.adapter.model.BaseObject300KB;
import ug.master.mstempin.pattern.adapter.model.BaseObject500KB;
import ug.master.mstempin.pattern.adapter.model.BaseObject800KB;
import ug.master.mstempin.pattern.decorator.model.BaseObjectExtended;
import ug.master.mstempin.pattern.decorator.model.BaseObjectExtendedExtended;

public class DecoratorService {

    private static DecoratorService instance;

    public static DecoratorService getInstance() {
        if ( instance == null ) {
            instance = new DecoratorService();
        }
        return instance;
    }

    public void _300KB_WithDecorator_1Level(){
        BaseObject300KB baseObject300KB = new BaseObject300KB();
        DecoratorLevel1_300KB decoratorLevel1 = new DecoratorLevel1_300KB(baseObject300KB);
        decoratorLevel1.action();
    }

    public void _300KB_WithoutDecorator(){
        BaseObject300KB baseObject300KB = new BaseObject300KB();
        action();
    }

    public void _500KB_WithDecorator_1Level(){
        BaseObject500KB baseObject500KB = new BaseObject500KB();
        DecoratorLevel1_500KB decoratorLevel1 = new DecoratorLevel1_500KB(baseObject500KB);
        decoratorLevel1.action();
    }

    public void _500KB_WithoutDecorator(){
        BaseObject500KB baseObject500KB = new BaseObject500KB();
        action();
    }

    public void _800KB_WithDecorator_1Level(){
        BaseObject800KB baseObject800KB = new BaseObject800KB();
        DecoratorLevel1_800KB decoratorLevel1 = new DecoratorLevel1_800KB(baseObject800KB);
        decoratorLevel1.action();
    }

    public void _800KB_WithoutDecorator(){
        BaseObject800KB baseObject800KB = new BaseObject800KB();
        action();
    }

    public void _800KB_WithDecorator_2Level(){
        BaseObject300KB baseObject300KB = new BaseObject300KB();
        DecoratorLevel1_300KB decoratorLevel1 = new DecoratorLevel1_300KB(baseObject300KB);
        DecoratorLevel2 decoratorLevel2 = new DecoratorLevel2(decoratorLevel1, new byte[500000]);
        decoratorLevel2.action();
    }

    public void _800KB_WithoutDecorator_2Level(){
        BaseObjectExtended baseObjectExtended = new BaseObjectExtended(new byte[800000]);
    }

    public void _800KB_WithDecorator_3Level(){
        BaseObject300KB baseObject300KB = new BaseObject300KB();
        DecoratorLevel1_300KB decoratorLevel1 = new DecoratorLevel1_300KB(baseObject300KB);
        DecoratorLevel2 decoratorLevel2 = new DecoratorLevel2(decoratorLevel1, new byte[250000]);
        DecoratorLevel2 decoratorLevel3 = new DecoratorLevel2(decoratorLevel2, new byte[250000]);
        decoratorLevel3.action();
    }

    public void _800KB_WithoutDecorator_3Level(){;
        BaseObjectExtendedExtended baseObjectExtendedExtended = new BaseObjectExtendedExtended(new byte[800000]);
    }

    private void action(){

    }
}
