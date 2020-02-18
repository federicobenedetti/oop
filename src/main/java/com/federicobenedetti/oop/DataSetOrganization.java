package com.federicobenedetti.oop;

import com.google.gson.annotations.SerializedName;

public class DataSetOrganization {
    @SerializedName("name")
    private String Name;
    @SerializedName("title")
    private String Title;

    public DataSetOrganization() {
    }

    @Override
    public String toString() {
        return "DataSetOrganization{" +
                "Name='" + Name + '\'' +
                ", Title='" + Title + '\'' +
                '}';
    }
}
