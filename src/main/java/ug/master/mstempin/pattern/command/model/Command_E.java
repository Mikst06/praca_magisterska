package ug.master.mstempin.pattern.command.model;

import ug.master.mstempin.pattern.command.editor.EditorBase;

public class Command_E extends Command {

    public Command_E(EditorBase editor) {
        super(editor);
    }

    @Override
    public void execute() {
        getBytes();
    }
}
