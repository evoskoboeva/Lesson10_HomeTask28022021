package com.companyCat.Task3;

public class ExpertDocumentWorker extends ProDocumentWorker {
    private static String fullMessage;
    private static String message = " in new format";

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
