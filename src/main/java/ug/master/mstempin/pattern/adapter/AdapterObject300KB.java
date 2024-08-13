package ug.master.mstempin.pattern.adapter;

import ug.master.mstempin.pattern.adapter.model.BaseObject300KB;

public class AdapterObject300KB extends ClientObject {
    private BaseObject300KB baseObject300KB;

    public AdapterObject300KB(BaseObject300KB baseObject300KB) {
        this.baseObject300KB = baseObject300KB;
    }

    @Override
    public void action() {
    }
}
