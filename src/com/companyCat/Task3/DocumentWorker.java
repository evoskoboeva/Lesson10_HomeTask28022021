package com.companyCat.Task3;

import java.util.Objects;

public class DocumentWorker {

    private static String message = "only in PRO version";
    private static String fullMessage;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFullMessage() {
        return fullMessage;
    }

    public void setFullMessage(String fullMessage) {
        this.fullMessage = fullMessage;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DocumentWorker)) return false;
        DocumentWorker that = (DocumentWorker) o;
        return Objects.equals(getMessage(), that.getMessage()) && Objects.equals(getFullMessage(), that.getFullMessage());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMessage(), getFullMessage());
    }

    public  String OpenDocument(){
        fullMessage = "document is opened. another operations"+message;
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
