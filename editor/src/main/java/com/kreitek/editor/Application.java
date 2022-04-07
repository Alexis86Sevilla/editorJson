package com.kreitek.editor;

public class Application {

    public static void main(String[] args) {
        EditorFactory editorFactory = new EditorFactory();

        if (args[0].equalsIgnoreCase("text")){
            Editor editorText = editorFactory.getEditor("text");
            editorText.run();
        }else if(args[0].equalsIgnoreCase("json")){
            Editor editorText = editorFactory.getEditor("json");
            editorText.run();
        }else{
            System.out.println("ERROR");
        }


    }

}
