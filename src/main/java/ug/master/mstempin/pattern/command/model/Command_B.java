package ug.master.mstempin.pattern.command.model;

import ug.master.mstempin.pattern.command.editor.EditorBase;

public class Command_B extends Command {

    public Command_B(EditorBase editor) {
        super(editor);
    }

    @Override
    public void execute() {
        getBytes();
    }
}
