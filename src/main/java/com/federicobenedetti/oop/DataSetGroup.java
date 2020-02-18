package com.federicobenedetti.oop;

public class DataSetGroup implements IDataSet {
    private String Title;

    public DataSetGroup() {
    }

    @Override
    public String toString() {
        return "DataSetGroup{" +
                "Title='" + Title + '\'' +
                '}';
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
