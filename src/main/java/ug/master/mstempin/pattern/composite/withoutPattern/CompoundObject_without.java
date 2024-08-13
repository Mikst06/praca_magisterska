package ug.master.mstempin.pattern.composite.withoutPattern;

import java.util.List;

public class CompoundObject_without {

    List<Object> objects;

    public void action() {
        for (Object object : objects) {
            if (object instanceof BasicObject_without) {
                ((BasicObject_without) object).action();
            } else if (object instanceof CompoundObject_without) {
                ((CompoundObject_without) object).action();
            }
        }
    }

    public void addObject(Object object) {
        objects.add(object);
    }
}
