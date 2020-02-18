package com.federicobenedetti.oop;

import com.google.gson.annotations.SerializedName;

public class DataSetGroup {
    @SerializedName("title")
    private String Title;

    public DataSetGroup() {
    }

    @Override
    public String toString() {
        return "DataSetGroup{" +
                "Title='" + Title + '\'' +
                '}';
    }
}
