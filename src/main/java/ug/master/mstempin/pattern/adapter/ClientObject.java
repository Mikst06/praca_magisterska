package ug.master.mstempin.pattern.adapter;

public class ClientObject implements ClientI{

    byte[] field1;

    public ClientObject(byte[] field1) {
        this.field1 = field1;
    }

    public ClientObject() {
    }

    @Override
    public void action() {
    }
}
