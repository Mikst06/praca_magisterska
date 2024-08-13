package ug.master.mstempin.pattern.composite.withPattern;

import java.util.List;

public class CompoundObject implements BasicObjectI {

    List<BasicObjectI> objects;

    @Override
    public void action() {
        for (BasicObjectI object : objects) {
            object.action();
        }
    }

    public void addObject(BasicObjectI object) {
        objects.add(object);
    }
}
