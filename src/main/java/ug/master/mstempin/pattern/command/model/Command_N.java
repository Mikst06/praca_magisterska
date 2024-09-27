package ug.master.mstempin.pattern.command.model;

import ug.master.mstempin.pattern.command.editor.EditorBase;

public class Command_N extends Command {

    public Command_N(EditorBase editor) {
        super(editor);
    }

    @Override
    public void execute() {
        getBytes();
    }
}
