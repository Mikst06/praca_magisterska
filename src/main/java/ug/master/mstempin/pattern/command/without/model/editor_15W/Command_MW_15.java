package ug.master.mstempin.pattern.command.without.model.editor_15W;

import ug.master.mstempin.pattern.command.without.editor.Editor_15W;

public class Command_MW_15 {
    private Editor_15W editor;
    public Command_MW_15(Editor_15W editor) {
        this.editor = editor;
    }

    public void execute() {
        editor.getBytesEditor();
        editor.execute_MW();
    }
}