package ug.master.mstempin.pattern.creational.abstractF.model;

import ug.master.mstempin.pattern.creational.abstractF.part.PartFactoryI;
import ug.master.mstempin.pattern.creational.abstractF.part.part1.Part1Type;
import ug.master.mstempin.pattern.creational.abstractF.part.part2.Part2Type;
import ug.master.mstempin.pattern.creational.abstractF.part.part3.Part3Type;

public class AbstractObject_A extends AbstractObject {

    public AbstractObject_A(PartFactoryI partFactory) {
        super(partFactory);
        setBaseByte(new byte[100000]);
    }

    public void prepare(){
        setPart1(getPartFactory().addPart1(Part1Type.A));
        setPart2(getPartFactory().addPart2(Part2Type.A));
        setPart3(getPartFactory().addPart3(Part3Type.A));
    }
}
