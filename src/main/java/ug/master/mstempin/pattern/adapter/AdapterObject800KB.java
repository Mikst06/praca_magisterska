package ug.master.mstempin.pattern.adapter;

import ug.master.mstempin.pattern.adapter.model.BaseObject800KB;

public class AdapterObject800KB extends ClientObject {
    private BaseObject800KB baseObject800KB;

    public AdapterObject800KB(BaseObject800KB baseObject800KB) {
        this.baseObject800KB = baseObject800KB;
    }

    @Override
    public void action() {
    }
}
