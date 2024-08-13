package ug.master.mstempin.pattern.decorator;

import ug.master.mstempin.pattern.adapter.model.BaseObject500KB;

public class DecoratorLevel1_500KB implements BaseDecorator{
    private BaseObject500KB field;

    public DecoratorLevel1_500KB(BaseObject500KB field) {
        this.field = field;
    }

    @Override
    public void action() {}
}
