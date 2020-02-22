package com.federicobenedetti.oop.Models;

import java.util.HashMap;

/**
 * This Model it's not serializable as we dont need
 * to send it back and forth
 * We're using DTOs for that purpose
 */
public class DataSetModel {
    private String BmiSexAgeQuantileTimeGeo;

    /**
     * HashMap because it is way easier to handle
     * as we have 'dynamic' number of keys (TSV is not well formed)
     */
    private HashMap<String, Double> DataSetValues = new HashMap<>();
    private int Id;

    public DataSetModel(int id) {
        Id = id;
    }

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

    public HashMap<String, Double> getDataSetValues() {
        return DataSetValues;
    }

    public void setDataSetValues(HashMap<String, Double> dataSetValues) {
        DataSetValues = dataSetValues;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
