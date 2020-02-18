package com.federicobenedetti.oop;

public class DataSetOrganization implements IDataSet {
    private String Name;
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

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
