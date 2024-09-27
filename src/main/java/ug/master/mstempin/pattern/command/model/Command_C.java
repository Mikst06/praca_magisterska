package ug.master.mstempin.pattern.command.model;

import ug.master.mstempin.pattern.command.editor.EditorBase;

public class Command_C extends Command {

    public Command_C(EditorBase editor) {
        super(editor);
    }

    @Override
    public void execute() {
        getBytes();
    }
}
