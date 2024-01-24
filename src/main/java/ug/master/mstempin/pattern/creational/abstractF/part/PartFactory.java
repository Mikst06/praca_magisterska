package ug.master.mstempin.pattern.creational.abstractF.part;

import ug.master.mstempin.pattern.creational.abstractF.part.part1.Part1;
import ug.master.mstempin.pattern.creational.abstractF.part.part1.Part1Type;
import ug.master.mstempin.pattern.creational.abstractF.part.part1.Part1_A;
import ug.master.mstempin.pattern.creational.abstractF.part.part1.Part1_B;
import ug.master.mstempin.pattern.creational.abstractF.part.part1.Part1_C;
import ug.master.mstempin.pattern.creational.abstractF.part.part2.Part2;
import ug.master.mstempin.pattern.creational.abstractF.part.part2.Part2Type;
import ug.master.mstempin.pattern.creational.abstractF.part.part2.Part2_A;
import ug.master.mstempin.pattern.creational.abstractF.part.part2.Part2_B;
import ug.master.mstempin.pattern.creational.abstractF.part.part2.Part2_C;
import ug.master.mstempin.pattern.creational.abstractF.part.part3.Part3;
import ug.master.mstempin.pattern.creational.abstractF.part.part3.Part3Type;
import ug.master.mstempin.pattern.creational.abstractF.part.part3.Part3_A;
import ug.master.mstempin.pattern.creational.abstractF.part.part3.Part3_B;
import ug.master.mstempin.pattern.creational.abstractF.part.part3.Part3_C;

public class PartFactory implements PartFactoryI {

    private static PartFactory instance;

    public static PartFactory getInstance() {
        if ( instance == null ) {
            instance = new PartFactory();
        }
        return instance;
    }

    @Override
    public Part1 addPart1(Part1Type type) {
        switch (type) {
            case A:
                return new Part1_A();
            case B:
                return new Part1_B();
            case C:
                return new Part1_C();
            default:
                return null;
        }
    }

    @Override
    public Part2 addPart2(Part2Type type) {
        switch (type) {
            case A:
                return new Part2_A();
            case B:
                return new Part2_B();
            case C:
                return new Part2_C();
            default:
                return null;
        }
    }

    @Override
    public Part3 addPart3(Part3Type type) {
        switch (type) {
            case A:
                return new Part3_A();
            case B:
                return new Part3_B();
            case C:
                return new Part3_C();
            default:
                return null;
        }
    }
}
