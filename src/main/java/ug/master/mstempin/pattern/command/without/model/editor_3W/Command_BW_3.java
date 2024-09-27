package ug.master.mstempin.pattern.command.without.model.editor_3W;

import ug.master.mstempin.pattern.command.without.editor.Editor_3W;

public class Command_BW_3 {
    private Editor_3W editor;
    public Command_BW_3(Editor_3W editor) {
        this.editor = editor;
    }

    public void execute() {
        editor.getBytesEditor();
        editor.execute_BW();
    }
}
