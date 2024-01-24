package ug.master.mstempin.pattern.adapter;

import ug.master.mstempin.pattern.adapter.model.basic.Basic;

public class BasicAdaper extends ClientObject {
    private Basic basic;

    public BasicAdaper(Basic basic) {
        this.basic = basic;
    }

    @Override
    public void action() {
        Integer result;
        Integer length = basic.getF_string().length();
        if(basic.getF_boolean()) {
            result = (length * basic.getF_integer());
        } else {
            result = (length);
        }
    }
}
