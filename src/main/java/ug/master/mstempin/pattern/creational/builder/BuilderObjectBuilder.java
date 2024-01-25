package ug.master.mstempin.pattern.creational.builder;

import ug.master.mstempin.pattern.creational.builder.model.BuilderObject;

public class BuilderObjectBuilder implements Builder{
    private byte[] byte1;

    private byte[] byte2;

    private byte[] byte3;

    private byte[] byte4;

    private byte[] byte5;

    @Override
    public void setByte1(byte[] byte1) {
        this.byte1 = byte1;
    }

    @Override
    public void setByte2(byte[] byte2) {
        this.byte2 = byte2;
    }

    @Override
    public void setByte3(byte[] byte3) {
        this.byte3 = byte3;
    }

    @Override
    public void setByte4(byte[] byte4) {
        this.byte4 = byte4;
    }

    @Override
    public void setByte5(byte[] byte5) {
        this.byte5 = byte5;
    }

    public BuilderObject build() {
        return new BuilderObject(byte1, byte2, byte3, byte4, byte5);
    }
}
