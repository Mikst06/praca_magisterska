package ug.master.mstempin.pattern.creational.abstractF.model;

import ug.master.mstempin.pattern.creational.abstractF.part.part1.Part1_D;
import ug.master.mstempin.pattern.creational.abstractF.part.part2.Part2_D;
import ug.master.mstempin.pattern.creational.abstractF.part.part3.Part3_D;

public class AbstractObject_D {

    byte[] baseByte;
    Part1_D part1;

    Part2_D part2;

    Part3_D part3;

    public byte[] getBaseByte() {
        return baseByte;
    }

    public void setBaseByte(byte[] baseByte) {
        this.baseByte = baseByte;
    }

    public Part1_D getPart1() {
        return part1;
    }

    public void setPart1(Part1_D part1) {
        this.part1 = part1;
    }

    public Part2_D getPart2() {
        return part2;
    }

    public void setPart2(Part2_D part2) {
        this.part2 = part2;
    }

    public Part3_D getPart3() {
        return part3;
    }

    public void setPart3(Part3_D part3) {
        this.part3 = part3;
    }

    public AbstractObject_D(byte[] baseByte, Part1_D part1, Part2_D part2, Part3_D part3) {
        this.baseByte = baseByte;
        this.part1 = part1;
        this.part2 = part2;
        this.part3 = part3;
    }
}
