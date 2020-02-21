package com.federicobenedetti.oop.Model;

import java.util.HashMap;

public class DataSetModel {
    private String BmiSexAgeQuantileTimeGeo;
    private HashMap<String, Double> DataSetValues = new HashMap<>();

    public DataSetModel() {
    }

    @Override
    public String toString() {
        return "DataSet{" +
                "BmiSexAgeQuantileTimeGeo='" + BmiSexAgeQuantileTimeGeo + '\'' +
                ", DataSetValues=" + DataSetValues +
                '}';
    }

    public void SetHashMapKeyValuePair(String key, String value) {
        double tempValue;
        if (value.isEmpty()) {
            tempValue = 0;
        } else {
            tempValue = Double.parseDouble(value);
        }

        DataSetValues.put(key, tempValue);
        return;
    }

    public String getBmiSexAgeQuantileTimeGeo() {
        return BmiSexAgeQuantileTimeGeo;
    }

    public void setBmiSexAgeQuantileTimeGeo(String bmiSexAgeQuantileTimeGeo) {
        BmiSexAgeQuantileTimeGeo = bmiSexAgeQuantileTimeGeo;
    }
}
