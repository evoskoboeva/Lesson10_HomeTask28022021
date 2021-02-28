package com.companyCat.Task3;

public class ProDocumentWorker extends DocumentWorker{

    private static String fullMessage;
    private static String message = " in old format. another operations only in EXPERT";

    public  String OpenDocument(){
        fullMessage = "document is opened "+message;
        return fullMessage;
    }

    public String SaveDocument(){
        fullMessage = "Save "+message;
        return fullMessage;
    }
    public String EditDocument(){
        fullMessage = "Edit "+message;
        return fullMessage;
    }
}
