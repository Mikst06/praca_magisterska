package ug.master.mstempin.pattern.command.without.editor;

public class Editor_3W {

    private byte[] bytesEditor;

    public byte[] getBytesEditor() {
        return bytesEditor;
    }

    public void setBytesEditor(byte[] bytesEditor) {
        this.bytesEditor = bytesEditor;
    }

    public void init(byte[] bytes) {
        setBytesEditor(bytes);
    }

    public void execute_AW(){}
    public void execute_BW(){}
    public void execute_CW(){}
}
