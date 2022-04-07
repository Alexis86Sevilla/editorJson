package com.kreitek.editor;

public class EditorFactory {
    public Editor getEditor(String editorType) {

        if (editorType == null) {
            return null;
        }
        if (editorType.equalsIgnoreCase("text")) {
            return new ConsoleEditor();
        } else if (editorType.equalsIgnoreCase("json")) {
            return new ConsoleJSON();
        }
        return null;
    }
}
