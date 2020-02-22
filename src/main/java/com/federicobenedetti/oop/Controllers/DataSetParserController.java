package com.federicobenedetti.oop.Controllers;

import com.federicobenedetti.oop.Models.DataSetModel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * This is the controller that will parse the dataset
 * removing any weird character or number, making it easier
 * to handle them later.
 */
public class DataSetParserController {
    private File _dataSetFile;
    private ArrayList<DataSetModel> _dataSet;

    public DataSetParserController(File dataSetFile, ArrayList<DataSetModel> dataSet) {
        this._dataSetFile = dataSetFile;
        this._dataSet = dataSet;
    }

    /**
     * We read each line of the TSV
     * Split it by \t as it is a 'tab-separated values'
     * then sanitize each value we are reading
     * and composing the object we need
     *
     * @throws Exception
     */
    public void ParseDataSetAndFill() throws Exception {
        System.out.println("Parsing DataSet...");
        BufferedReader csvReader = new BufferedReader(new FileReader(this._dataSetFile));
        String row;
        DataSetModel ds;
        int index = 0;

        String[] header = csvReader.readLine().split("\t");

        while ((row = csvReader.readLine()) != null) {
            String[] data = row.split("\t");
            ds = new DataSetModel(index);

            for (int i = 0; i < data.length; i++) {
                String val = SanitizeValue(data[i], i);

                if (i == 0) {
                    ds.setBmiSexAgeQuantileTimeGeo(val);
                } else {
                    ds.SetHashMapKeyValuePair(header[i].trim(), val);
                }
            }
            this._dataSet.add(ds);
            index = index + 1;
        }

        System.out.println("DataSet parsed, " + this._dataSet.size() + " elements inside");
        csvReader.close();
    }

    /**
     * We're sanitizing the value we're reading as the data is filled up
     * by many errors
     *
     * @param val
     * @param i
     * @return
     */
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
