package ug.master.mstempin.pattern.adapter;

import ug.master.mstempin.pattern.adapter.model.BaseObject500KB;

public class AdapterObject500KB extends ClientObject {
    private BaseObject500KB baseObject500KB;

    public AdapterObject500KB(BaseObject500KB baseObject500KB) {
        this.baseObject500KB = baseObject500KB;
    }

    @Override
    public void action() {
    }
}
