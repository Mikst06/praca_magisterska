package ug.master.mstempin.pattern.creational.builder.model;

public class BuilderObject {

    private byte[] byte1;

    private byte[] byte2;

    private byte[] byte3;

    private byte[] byte4;

    private byte[] byte5;

    public byte[] getByte1() {
        return byte1;
    }

    public void setByte1(byte[] byte1) {
        this.byte1 = byte1;
    }

    public byte[] getByte2() {
        return byte2;
    }

    public void setByte2(byte[] byte2) {
        this.byte2 = byte2;
    }

    public byte[] getByte3() {
        return byte3;
    }

    public void setByte3(byte[] byte3) {
        this.byte3 = byte3;
    }

    public byte[] getByte4() {
        return byte4;
    }

    public void setByte4(byte[] byte4) {
        this.byte4 = byte4;
    }

    public byte[] getByte5() {
        return byte5;
    }

    public void setByte5(byte[] byte5) {
        this.byte5 = byte5;
    }

    public BuilderObject(byte[] byte1, byte[] byte2, byte[] byte3, byte[] byte4, byte[] byte5) {
        this.byte1 = byte1;
        this.byte2 = byte2;
        this.byte3 = byte3;
        this.byte4 = byte4;
        this.byte5 = byte5;
    }
}
