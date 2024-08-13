package ug.master.mstempin.pattern.composite.withPattern;

public class BasicObject implements BasicObjectI{
    private byte[] field;

    public byte[] getField() {
        return field;
    }

    public void setField(byte[] field) {
        this.field = field;
    }

    public BasicObject(byte[] field) {
        this.field = field;
    }

    @Override
    public void action() {

    }
}
