package ug.master.mstempin.pattern.creational.abstractF.model;

import ug.master.mstempin.pattern.creational.abstractF.part.PartFactoryI;
import ug.master.mstempin.pattern.creational.abstractF.part.part1.Part1;
import ug.master.mstempin.pattern.creational.abstractF.part.part2.Part2;
import ug.master.mstempin.pattern.creational.abstractF.part.part3.Part3;

public abstract class AbstractObject {

    PartFactoryI partFactory;
    byte[] baseByte;
    Part1 part1;

    Part2 part2;

    Part3 part3;

    public abstract void prepare();

    public byte[] getBaseByte() {
        return baseByte;
    }

    public void setBaseByte(byte[] baseByte) {
        this.baseByte = baseByte;
    }

    public Part1 getPart1() {
        return part1;
    }

    public void setPart1(Part1 part1) {
        this.part1 = part1;
    }

    public Part2 getPart2() {
        return part2;
    }

    public void setPart2(Part2 part2) {
        this.part2 = part2;
    }

    public Part3 getPart3() {
        return part3;
    }

    public void setPart3(Part3 part3) {
        this.part3 = part3;
    }

    public AbstractObject(PartFactoryI partFactory) {
        this.partFactory = partFactory;
    }

    public PartFactoryI getPartFactory() {
        return partFactory;
    }

    public void setPartFactory(PartFactoryI partFactory) {
        this.partFactory = partFactory;
    }
}
