package ug.master.mstempin.pattern.composite.withPattern;

import java.util.ArrayList;
import java.util.List;

public class CompoundObject implements BasicObjectI {

    List<BasicObjectI> objects = new ArrayList<>();

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
