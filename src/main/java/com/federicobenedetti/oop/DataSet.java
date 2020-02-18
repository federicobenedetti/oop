package com.federicobenedetti.oop;

public class DataSet implements IDataSet {
    private String Help;
    private boolean success;
    private DataSetResult result;

    public DataSet() {
    }

    @Override
    public String toString() {
        return "DataSet{" +
                "Help='" + Help + '\'' +
                ", success=" + success +
                ", result=" + result.toString() +
                '}';
    }

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
