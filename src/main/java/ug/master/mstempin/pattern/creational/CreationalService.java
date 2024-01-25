package ug.master.mstempin.pattern.creational;

import ug.master.mstempin.pattern.creational.abstractF.model.AbstractObject_D;
import ug.master.mstempin.pattern.creational.abstractF.part.part1.Part1_D;
import ug.master.mstempin.pattern.creational.abstractF.part.part2.Part2_D;
import ug.master.mstempin.pattern.creational.abstractF.part.part3.Part3_D;
import ug.master.mstempin.pattern.creational.builder.BuilderObjectBuilder;
import ug.master.mstempin.pattern.creational.builder.model.BuilderObject;
import ug.master.mstempin.pattern.creational.factory.simple.model.BaseObjectD;

public class CreationalService {

    private static CreationalService instance;

    public static CreationalService getInstance() {
        if ( instance == null ) {
            instance = new CreationalService();
        }
        return instance;
    }

    public void createBaseObjectA() {
        BaseObjectD baseObjectD = new BaseObjectD(new byte[900000]);
    }

    public void createBaseObjectB() {
        BaseObjectD baseObjectD = new BaseObjectD(new byte[600000]);
    }

    public void createBaseObjectC() {
        BaseObjectD baseObjectD = new BaseObjectD(new byte[300000]);
    }

    public void createAbstractObjectA() {
        Part1_D part1D = new Part1_D(new byte[100000]);
        Part2_D part2D = new Part2_D(new byte[100000]);
        Part3_D part3D = new Part3_D(new byte[100000]);
        AbstractObject_D abstractObjectD = new AbstractObject_D(
                new byte[100000],
                part1D,
                part2D,
                part3D);
    }

    public void createAbstractObjectB() {
        Part1_D part1D = new Part1_D(new byte[200000]);
        Part2_D part2D = new Part2_D(new byte[200000]);
        Part3_D part3D = new Part3_D(new byte[200000]);
        AbstractObject_D abstractObjectD = new AbstractObject_D(
                new byte[100000],
                part1D,
                part2D,
                part3D);
    }

    public void createAbstractObjectC() {
        Part1_D part1D = new Part1_D(new byte[300000]);
        Part2_D part2D = new Part2_D(new byte[300000]);
        Part3_D part3D = new Part3_D(new byte[300000]);
        AbstractObject_D abstractObjectD = new AbstractObject_D(
                new byte[100000],
                part1D,
                part2D,
                part3D);
    }

    public void createObjectByBuilder() {
        BuilderObjectBuilder builder = new BuilderObjectBuilder();
        builder.setByte1(new byte[100000]);
        builder.setByte2(new byte[100000]);
        builder.setByte3(new byte[100000]);
        builder.setByte4(new byte[100000]);
        builder.setByte5(new byte[100000]);
        BuilderObject builderObject = builder.build();
    }

    public void createObjectWithoutBuilder() {
        BuilderObject builderObject = new BuilderObject(
                new byte[100000],
                new byte[100000],
                new byte[100000],
                new byte[100000],
                new byte[100000]
        );
    }
}
