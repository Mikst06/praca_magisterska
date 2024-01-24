package ug.master.mstempin.pattern.creational.abstractF.model;

import ug.master.mstempin.pattern.creational.abstractF.part.PartFactoryI;
import ug.master.mstempin.pattern.creational.abstractF.part.part1.Part1Type;
import ug.master.mstempin.pattern.creational.abstractF.part.part2.Part2Type;
import ug.master.mstempin.pattern.creational.abstractF.part.part3.Part3Type;

public class AbstractObject_B extends AbstractObject {
    public AbstractObject_B(PartFactoryI partFactory) {
        super(partFactory);
        setBaseByte(new byte[100000]);
    }

    public void prepare(){
        setPart1(getPartFactory().addPart1(Part1Type.B));
        setPart2(getPartFactory().addPart2(Part2Type.B));
        setPart3(getPartFactory().addPart3(Part3Type.B));
    }
}
