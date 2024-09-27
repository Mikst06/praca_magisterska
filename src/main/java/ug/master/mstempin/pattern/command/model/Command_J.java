package ug.master.mstempin.pattern.command.model;

import ug.master.mstempin.pattern.command.editor.EditorBase;

public class Command_J extends Command {

    public Command_J(EditorBase editor) {
        super(editor);
    }

    @Override
    public void execute() {
        getBytes();
    }
}