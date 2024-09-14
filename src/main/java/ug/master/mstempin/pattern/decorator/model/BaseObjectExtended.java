package ug.master.mstempin.pattern.decorator.model;

import ug.master.mstempin.pattern.adapter.model.BaseObject300KB;

public class BaseObjectExtended extends BaseObject300KB {

    public BaseObjectExtended(byte[] bytes) {
        this.setBaseByte(bytes);
    }
}
