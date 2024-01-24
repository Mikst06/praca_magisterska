package ug.master.mstempin.pattern.creational.abstractF.part;

import ug.master.mstempin.pattern.creational.abstractF.part.part1.Part1;
import ug.master.mstempin.pattern.creational.abstractF.part.part1.Part1Type;
import ug.master.mstempin.pattern.creational.abstractF.part.part2.Part2;
import ug.master.mstempin.pattern.creational.abstractF.part.part2.Part2Type;
import ug.master.mstempin.pattern.creational.abstractF.part.part3.Part3;
import ug.master.mstempin.pattern.creational.abstractF.part.part3.Part3Type;

public interface PartFactoryI {

    Part1 addPart1(Part1Type type);
    Part2 addPart2(Part2Type type);
    Part3 addPart3(Part3Type type);
}
