package ug.master.mstempin.pattern.decorator;

import ug.master.mstempin.pattern.adapter.model.BaseObject300KB;

public class DecoratorLevel1_300KB implements BaseDecorator{
    private BaseObject300KB field;

    public DecoratorLevel1_300KB(BaseObject300KB field) {
        this.field = field;
    }

    @Override
    public void action() {}
}
