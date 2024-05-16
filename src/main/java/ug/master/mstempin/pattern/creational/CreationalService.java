package ug.master.mstempin.pattern.creational;

import ug.master.mstempin.pattern.creational.abstractF.model.AbstractObject_D;
import ug.master.mstempin.pattern.creational.abstractF.part.part1.Part1_D;
import ug.master.mstempin.pattern.creational.abstractF.part.part2.Part2_D;
import ug.master.mstempin.pattern.creational.abstractF.part.part3.Part3_D;
import ug.master.mstempin.pattern.creational.builder.BuilderObjectBuilder;
import ug.master.mstempin.pattern.creational.builder.BuilderObjectBuilder_50Field;
import ug.master.mstempin.pattern.creational.builder.BuilderObjectBuilder_100field;
import ug.master.mstempin.pattern.creational.builder.model.BuilderObject;
import ug.master.mstempin.pattern.creational.builder.model.BuilderObject_50field;
import ug.master.mstempin.pattern.creational.builder.model.BuilderObject_100field;
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

    public void createObjectByBuilder_1() { //300 KB
        BuilderObjectBuilder builder = new BuilderObjectBuilder();
        builder.setByte1(new byte[60000]);
        builder.setByte2(new byte[60000]);
        builder.setByte3(new byte[60000]);
        builder.setByte4(new byte[60000]);
        builder.setByte5(new byte[60000]);
        BuilderObject builderObject = builder.build();
    }

    public void createObjectWithoutBuilder_1() {
        BuilderObject builderObject = new BuilderObject(
                new byte[60000],
                new byte[60000],
                new byte[60000],
                new byte[60000],
                new byte[60000]
        );
    }

    public void createObjectByBuilder_2() { //500 KB
        BuilderObjectBuilder builder = new BuilderObjectBuilder();
        builder.setByte1(new byte[100000]);
        builder.setByte2(new byte[100000]);
        builder.setByte3(new byte[100000]);
        builder.setByte4(new byte[100000]);
        builder.setByte5(new byte[100000]);
        BuilderObject builderObject = builder.build();
    }

    public void createObjectWithoutBuilder_2() {
        BuilderObject builderObject = new BuilderObject(
                new byte[100000],
                new byte[100000],
                new byte[100000],
                new byte[100000],
                new byte[100000]
        );
    }

    public void createObjectByBuilder_3() { //800 KB
        BuilderObjectBuilder builder = new BuilderObjectBuilder();
        builder.setByte1(new byte[160000]);
        builder.setByte2(new byte[160000]);
        builder.setByte3(new byte[160000]);
        builder.setByte4(new byte[160000]);
        builder.setByte5(new byte[160000]);
        BuilderObject builderObject = builder.build();
    }

    public void createObjectWithoutBuilder_3() {
        BuilderObject builderObject = new BuilderObject(
                new byte[160000],
                new byte[160000],
                new byte[160000],
                new byte[160000],
                new byte[160000]
        );
    }

    public void createObjectByBuilder_3_50field() { //800 KB
        BuilderObjectBuilder_50Field builder = new BuilderObjectBuilder_50Field();
        builder.setByte1(new byte[16000]);
        builder.setByte2(new byte[16000]);
        builder.setByte3(new byte[16000]);
        builder.setByte4(new byte[16000]);
        builder.setByte5(new byte[16000]);
        builder.setByte6(new byte[16000]);
        builder.setByte7(new byte[16000]);
        builder.setByte8(new byte[16000]);
        builder.setByte9(new byte[16000]);
        builder.setByte10(new byte[16000]);
        builder.setByte11(new byte[16000]);
        builder.setByte12(new byte[16000]);
        builder.setByte13(new byte[16000]);
        builder.setByte14(new byte[16000]);
        builder.setByte15(new byte[16000]);
        builder.setByte16(new byte[16000]);
        builder.setByte17(new byte[16000]);
        builder.setByte18(new byte[16000]);
        builder.setByte19(new byte[16000]);
        builder.setByte20(new byte[16000]);
        builder.setByte21(new byte[16000]);
        builder.setByte22(new byte[16000]);
        builder.setByte23(new byte[16000]);
        builder.setByte24(new byte[16000]);
        builder.setByte25(new byte[16000]);
        builder.setByte26(new byte[16000]);
        builder.setByte27(new byte[16000]);
        builder.setByte28(new byte[16000]);
        builder.setByte29(new byte[16000]);
        builder.setByte30(new byte[16000]);
        builder.setByte31(new byte[16000]);
        builder.setByte32(new byte[16000]);
        builder.setByte33(new byte[16000]);
        builder.setByte34(new byte[16000]);
        builder.setByte35(new byte[16000]);
        builder.setByte36(new byte[16000]);
        builder.setByte37(new byte[16000]);
        builder.setByte38(new byte[16000]);
        builder.setByte39(new byte[16000]);
        builder.setByte40(new byte[16000]);
        builder.setByte41(new byte[16000]);
        builder.setByte42(new byte[16000]);
        builder.setByte43(new byte[16000]);
        builder.setByte44(new byte[16000]);
        builder.setByte45(new byte[16000]);
        builder.setByte46(new byte[16000]);
        builder.setByte47(new byte[16000]);
        builder.setByte48(new byte[16000]);
        builder.setByte49(new byte[16000]);
        builder.setByte50(new byte[16000]);
        BuilderObject_50field builderObject = builder.build();
    }

    public void createObjectWithoutBuilder_3_50field() {
        BuilderObject_50field builderObject = new BuilderObject_50field(
                new byte[16000], new byte[16000], new byte[16000], new byte[16000], new byte[16000],
                new byte[16000], new byte[16000], new byte[16000], new byte[16000], new byte[16000],
                new byte[16000], new byte[16000], new byte[16000], new byte[16000], new byte[16000],
                new byte[16000], new byte[16000], new byte[16000], new byte[16000], new byte[16000],
                new byte[16000], new byte[16000], new byte[16000], new byte[16000], new byte[16000],
                new byte[16000], new byte[16000], new byte[16000], new byte[16000], new byte[16000],
                new byte[16000], new byte[16000], new byte[16000], new byte[16000], new byte[16000],
                new byte[16000], new byte[16000], new byte[16000], new byte[16000], new byte[16000],
                new byte[16000], new byte[16000], new byte[16000], new byte[16000], new byte[16000],
                new byte[16000], new byte[16000], new byte[16000], new byte[16000], new byte[16000]
        );
    }

    public void createObjectByBuilder_3_100field() { // 800 KB
        BuilderObjectBuilder_100field builder = new BuilderObjectBuilder_100field();
        builder.setByte1(new byte[8000]);
        builder.setByte2(new byte[8000]);
        builder.setByte3(new byte[8000]);
        builder.setByte4(new byte[8000]);
        builder.setByte5(new byte[8000]);
        builder.setByte6(new byte[8000]);
        builder.setByte7(new byte[8000]);
        builder.setByte8(new byte[8000]);
        builder.setByte9(new byte[8000]);
        builder.setByte10(new byte[8000]);
        builder.setByte11(new byte[8000]);
        builder.setByte12(new byte[8000]);
        builder.setByte13(new byte[8000]);
        builder.setByte14(new byte[8000]);
        builder.setByte15(new byte[8000]);
        builder.setByte16(new byte[8000]);
        builder.setByte17(new byte[8000]);
        builder.setByte18(new byte[8000]);
        builder.setByte19(new byte[8000]);
        builder.setByte20(new byte[8000]);
        builder.setByte21(new byte[8000]);
        builder.setByte22(new byte[8000]);
        builder.setByte23(new byte[8000]);
        builder.setByte24(new byte[8000]);
        builder.setByte25(new byte[8000]);
        builder.setByte26(new byte[8000]);
        builder.setByte27(new byte[8000]);
        builder.setByte28(new byte[8000]);
        builder.setByte29(new byte[8000]);
        builder.setByte30(new byte[8000]);
        builder.setByte31(new byte[8000]);
        builder.setByte32(new byte[8000]);
        builder.setByte33(new byte[8000]);
        builder.setByte34(new byte[8000]);
        builder.setByte35(new byte[8000]);
        builder.setByte36(new byte[8000]);
        builder.setByte37(new byte[8000]);
        builder.setByte38(new byte[8000]);
        builder.setByte39(new byte[8000]);
        builder.setByte40(new byte[8000]);
        builder.setByte41(new byte[8000]);
        builder.setByte42(new byte[8000]);
        builder.setByte43(new byte[8000]);
        builder.setByte44(new byte[8000]);
        builder.setByte45(new byte[8000]);
        builder.setByte46(new byte[8000]);
        builder.setByte47(new byte[8000]);
        builder.setByte48(new byte[8000]);
        builder.setByte49(new byte[8000]);
        builder.setByte50(new byte[8000]);
        builder.setByte51(new byte[8000]);
        builder.setByte52(new byte[8000]);
        builder.setByte53(new byte[8000]);
        builder.setByte54(new byte[8000]);
        builder.setByte55(new byte[8000]);
        builder.setByte56(new byte[8000]);
        builder.setByte57(new byte[8000]);
        builder.setByte58(new byte[8000]);
        builder.setByte59(new byte[8000]);
        builder.setByte60(new byte[8000]);
        builder.setByte61(new byte[8000]);
        builder.setByte62(new byte[8000]);
        builder.setByte63(new byte[8000]);
        builder.setByte64(new byte[8000]);
        builder.setByte65(new byte[8000]);
        builder.setByte66(new byte[8000]);
        builder.setByte67(new byte[8000]);
        builder.setByte68(new byte[8000]);
        builder.setByte69(new byte[8000]);
        builder.setByte70(new byte[8000]);
        builder.setByte71(new byte[8000]);
        builder.setByte72(new byte[8000]);
        builder.setByte73(new byte[8000]);
        builder.setByte74(new byte[8000]);
        builder.setByte75(new byte[8000]);
        builder.setByte76(new byte[8000]);
        builder.setByte77(new byte[8000]);
        builder.setByte78(new byte[8000]);
        builder.setByte79(new byte[8000]);
        builder.setByte80(new byte[8000]);
        builder.setByte81(new byte[8000]);
        builder.setByte82(new byte[8000]);
        builder.setByte83(new byte[8000]);
        builder.setByte84(new byte[8000]);
        builder.setByte85(new byte[8000]);
        builder.setByte86(new byte[8000]);
        builder.setByte87(new byte[8000]);
        builder.setByte88(new byte[8000]);
        builder.setByte89(new byte[8000]);
        builder.setByte90(new byte[8000]);
        builder.setByte91(new byte[8000]);
        builder.setByte92(new byte[8000]);
        builder.setByte93(new byte[8000]);
        builder.setByte94(new byte[8000]);
        builder.setByte95(new byte[8000]);
        builder.setByte96(new byte[8000]);
        builder.setByte97(new byte[8000]);
        builder.setByte98(new byte[8000]);
        builder.setByte99(new byte[8000]);
        builder.setByte100(new byte[8000]);

        BuilderObject_100field builderObject = builder.build();
    }

    public void createObjectWithoutBuilder_3_100field() {
        BuilderObject_100field builderObject = new BuilderObject_100field(
                new byte[8000], new byte[8000], new byte[8000], new byte[8000], new byte[8000],
                new byte[8000], new byte[8000], new byte[8000], new byte[8000], new byte[8000],
                new byte[8000], new byte[8000], new byte[8000], new byte[8000], new byte[8000],
                new byte[8000], new byte[8000], new byte[8000], new byte[8000], new byte[8000],
                new byte[8000], new byte[8000], new byte[8000], new byte[8000], new byte[8000],
                new byte[8000], new byte[8000], new byte[8000], new byte[8000], new byte[8000],
                new byte[8000], new byte[8000], new byte[8000], new byte[8000], new byte[8000],
                new byte[8000], new byte[8000], new byte[8000], new byte[8000], new byte[8000],
                new byte[8000], new byte[8000], new byte[8000], new byte[8000], new byte[8000],
                new byte[8000], new byte[8000], new byte[8000], new byte[8000], new byte[8000],
                new byte[8000], new byte[8000], new byte[8000], new byte[8000], new byte[8000],
                new byte[8000], new byte[8000], new byte[8000], new byte[8000], new byte[8000],
                new byte[8000], new byte[8000], new byte[8000], new byte[8000], new byte[8000],
                new byte[8000], new byte[8000], new byte[8000], new byte[8000], new byte[8000],
                new byte[8000], new byte[8000], new byte[8000], new byte[8000], new byte[8000],
                new byte[8000], new byte[8000], new byte[8000], new byte[8000], new byte[8000],
                new byte[8000], new byte[8000], new byte[8000], new byte[8000], new byte[8000],
                new byte[8000], new byte[8000], new byte[8000], new byte[8000], new byte[8000],
                new byte[8000], new byte[8000], new byte[8000], new byte[8000], new byte[8000],
                new byte[8000], new byte[8000], new byte[8000], new byte[8000], new byte[8000]
        );
    }

}
