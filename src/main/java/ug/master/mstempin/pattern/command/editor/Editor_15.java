package ug.master.mstempin.pattern.command.editor;

import ug.master.mstempin.pattern.command.model.Command;
import ug.master.mstempin.pattern.command.model.Command_A;
import ug.master.mstempin.pattern.command.model.Command_B;
import ug.master.mstempin.pattern.command.model.Command_C;
import ug.master.mstempin.pattern.command.model.Command_D;
import ug.master.mstempin.pattern.command.model.Command_E;
import ug.master.mstempin.pattern.command.model.Command_F;
import ug.master.mstempin.pattern.command.model.Command_G;
import ug.master.mstempin.pattern.command.model.Command_H;
import ug.master.mstempin.pattern.command.model.Command_I;
import ug.master.mstempin.pattern.command.model.Command_J;
import ug.master.mstempin.pattern.command.model.Command_K;
import ug.master.mstempin.pattern.command.model.Command_L;
import ug.master.mstempin.pattern.command.model.Command_M;
import ug.master.mstempin.pattern.command.model.Command_N;
import ug.master.mstempin.pattern.command.model.Command_O;

public class Editor_15 extends EditorBase{

    private byte[] bytesEditor;
    public void init(byte[] bytes) {
        setBytesEditor(bytes);
        executeCommand(new Command_A(this));
        executeCommand(new Command_B(this));
        executeCommand(new Command_C(this));
        executeCommand(new Command_D(this));
        executeCommand(new Command_E(this));
        executeCommand(new Command_F(this));
        executeCommand(new Command_G(this));
        executeCommand(new Command_H(this));
        executeCommand(new Command_I(this));
        executeCommand(new Command_J(this));
        executeCommand(new Command_K(this));
        executeCommand(new Command_L(this));
        executeCommand(new Command_M(this));
        executeCommand(new Command_N(this));
        executeCommand(new Command_O(this));
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
