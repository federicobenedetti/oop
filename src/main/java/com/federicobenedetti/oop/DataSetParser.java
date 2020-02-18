package com.federicobenedetti.oop;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileReader;

public class DataSetParser {
    private File _dataSetFile;
    private DataSet _dataSet;

    public DataSetParser(File dataSetFile, DataSet dataSet) {
        this._dataSetFile = dataSetFile;
        this._dataSet = dataSet;
    }

    public void ParseDataSetAndFill() throws Exception {
        System.out.println("Parsing DataSet");

        Gson gson = new Gson();

        this._dataSet = gson.fromJson(new FileReader(this._dataSetFile), DataSet.class);
        System.out.println("DataSet: " + this._dataSet.toString());
    }
}
