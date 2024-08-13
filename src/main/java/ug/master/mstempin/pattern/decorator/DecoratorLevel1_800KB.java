package ug.master.mstempin.pattern.decorator;

import ug.master.mstempin.pattern.adapter.model.BaseObject800KB;

public class DecoratorLevel1_800KB implements BaseDecorator{
    private BaseObject800KB field;

    public DecoratorLevel1_800KB(BaseObject800KB field) {
        this.field = field;
    }

    @Override
    public void action() {}
}
