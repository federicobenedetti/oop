package com.federicobenedetti.oop;

import com.google.gson.annotations.SerializedName;

public class DataSet {
    @SerializedName("help")
    private String Help;
    @SerializedName("success")
    private boolean Success;
    @SerializedName("result")
    private DataSetResult Result;

    public DataSet() {
    }

    @Override
    public String toString() {
        return "DataSet{" +
                "Help='" + Help + '\'' +
                ", success=" + Success +
                ", result=" + Result.toString() +
                '}';
    }
}
