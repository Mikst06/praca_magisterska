package ug.master.mstempin.pattern.command.without.model.editor_5W;

import ug.master.mstempin.pattern.command.without.editor.Editor_5W;

public class Command_CW_5 {
    private Editor_5W editor;
    public Command_CW_5(Editor_5W editor) {
        this.editor = editor;
    }

    public void execute() {
        editor.getBytesEditor();
        editor.execute_CW();
    }
}
