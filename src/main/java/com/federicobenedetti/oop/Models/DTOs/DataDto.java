package com.federicobenedetti.oop.Models.DTOs;

import com.federicobenedetti.oop.Models.DataSetModel;
import com.federicobenedetti.oop.Models.Interfaces.ISerializableBean;

import java.util.HashMap;

public class DataDto extends DataSetModel implements ISerializableBean {
    private int RowNumber;

    public DataDto(int rowNumber, String bmi, HashMap<String, Double> values, int id) {
        setBmiSexAgeQuantileTimeGeo(bmi);
        setDataSetValues(values);
        setId(id);

        RowNumber = rowNumber;
    }

    public DataDto() {
    }

    public int getRowNumber() {
        return RowNumber;
    }

    public void setRowNumber(int rowNumber) {
        RowNumber = rowNumber;
    }
}
