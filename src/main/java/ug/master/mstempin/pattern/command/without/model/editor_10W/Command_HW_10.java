package ug.master.mstempin.pattern.command.without.model.editor_10W;

import ug.master.mstempin.pattern.command.without.editor.Editor_10W;

public class Command_HW_10 {
    private Editor_10W editor;
    public Command_HW_10(Editor_10W editor) {
        this.editor = editor;
    }

    public void execute() {
        editor.getBytesEditor();
        editor.execute_HW();
    }
}