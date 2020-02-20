package com.federicobenedetti.oop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class DataSetParser {
    private File _dataSetFile;
    private ArrayList<DataSet> _dataSet;

    public DataSetParser(File dataSetFile, ArrayList<DataSet> dataSet) {
        this._dataSetFile = dataSetFile;
        this._dataSet = dataSet;
    }

    public void ParseDataSetAndFill() throws Exception {
        System.out.println("Parsing DataSet...");
        BufferedReader csvReader = new BufferedReader(new FileReader(this._dataSetFile));
        String row;
        DataSet ds;

        String[] header = csvReader.readLine().split("\t");

        while ((row = csvReader.readLine()) != null) {
            String[] data = row.split("\t");
            ds = new DataSet();

            // Last line is dirty
            for (int i = 0; i < data.length - 1; i++) {
                String val = SanitizeValue(data[i], i);

                if (i == 0) {
                    ds.setBmiSexAgeQuantileTimeGeo(val);
                } else {
                    ds.SetHashMapKeyValuePair(header[i], val);
                }
            }
            this._dataSet.add(ds);
        }

        System.out.println("DataSet parsed, " + this._dataSet.size() + " elements inside");
        csvReader.close();
    }

    private String SanitizeValue(String val, int i) {

        // If we're checking the first column, just return the value
        // it's not a number
        if (i == 0) {
            return val.trim();
        }

        String temp = val;

        // Check for dirty characters
        temp = temp.replace(":", "");
        temp = temp.replace("c", "");
        temp = temp.replace("u", "");

        // Trim trailing whitespaces
        temp = temp.trim();

        if (temp.length() > 4) {
            temp = temp.substring(0, 4);
        }

        return temp;
    }
}
