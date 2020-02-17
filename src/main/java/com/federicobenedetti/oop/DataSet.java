package com.federicobenedetti.oop;

public class DataSet {
    private String Help;
    private boolean success;
    private DataSetResult result;

    public DataSet() { }

    public String getHelp() {
        return Help;
    }

    public void setHelp(String help) {
        Help = help;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public DataSetResult getResult() {
        return result;
    }

    public void setResult(DataSetResult result) {
        this.result = result;
    }
}
