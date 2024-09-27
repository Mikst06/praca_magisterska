package ug.master.mstempin.pattern.command.editor;

import ug.master.mstempin.pattern.command.model.Command;
import ug.master.mstempin.pattern.command.model.Command_A;
import ug.master.mstempin.pattern.command.model.Command_B;
import ug.master.mstempin.pattern.command.model.Command_C;

public class Editor_3 extends EditorBase{

    private byte[] bytesEditor;
    public void init(byte[] bytes) {
        setBytesEditor(bytes);
        executeCommand(new Command_A(this));
        executeCommand(new Command_B(this));
        executeCommand(new Command_C(this));
    }

    private void executeCommand(Command command) {
        command.execute();
    }

    @Override
    public byte[] getBytesEditor() {
        return bytesEditor;
    }

    public void setBytesEditor(byte[] bytesEditor) {
        this.bytesEditor = bytesEditor;
    }
}
