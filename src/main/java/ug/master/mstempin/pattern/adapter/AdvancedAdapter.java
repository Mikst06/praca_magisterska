package ug.master.mstempin.pattern.adapter;

import ug.master.mstempin.pattern.adapter.model.advanced.Advanced;

public class AdvancedAdapter extends ClientObject {

    private Advanced advanced;

    public AdvancedAdapter(Advanced advanced){
        this.advanced = advanced;
    }

    @Override
    public void action() {
        Integer result;
        Integer length = advanced.getA().getF_string().length()
                + advanced.getB().getF_string().length()
                + advanced.getC().getF_string().length();
        if( advanced.getA().getF_boolean() && advanced.getB().getF_boolean() && advanced.getC().getF_boolean()) {
            result = (length * (advanced.getA().getF_integer() + advanced.getB().getF_integer() + advanced.getC().getF_integer()));
        } else {
            result = (length);
        }
    }
}
