package ug.master.mstempin.pattern.creational.abstractF.model;

import ug.master.mstempin.pattern.creational.abstractF.part.PartFactoryI;
import ug.master.mstempin.pattern.creational.abstractF.part.part1.Part1Type;
import ug.master.mstempin.pattern.creational.abstractF.part.part2.Part2Type;
import ug.master.mstempin.pattern.creational.abstractF.part.part3.Part3Type;

public class AbstractObject_C extends AbstractObject {
    public AbstractObject_C(PartFactoryI partFactory) {
        super(partFactory);
        setBaseByte(new byte[100000]);
    }

    public void prepare(){
        setPart1(getPartFactory().addPart1(Part1Type.C));
        setPart2(getPartFactory().addPart2(Part2Type.C));
        setPart3(getPartFactory().addPart3(Part3Type.C));
    }
}
