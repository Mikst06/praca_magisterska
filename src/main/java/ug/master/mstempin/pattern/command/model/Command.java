package ug.master.mstempin.pattern.command.model;

import ug.master.mstempin.pattern.command.editor.EditorBase;

public abstract class Command {
    public EditorBase editor;

    Command(EditorBase editor) {
        this.editor = editor;
    }

    public abstract void execute();

    public void getBytes() {
        editor.getBytesEditor();
    }
}