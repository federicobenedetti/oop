package com.federicobenedetti.oop;

import org.supercsv.io.ICsvListReader;

import java.io.File;

public class DataSetParser {
    private File _dataSetFile;
    private DataSet _dataSet;

    public DataSetParser(File dataSetFile, DataSet dataSet) {
        this._dataSetFile = dataSetFile;
        this._dataSet = dataSet;
    }

    public void ParseDataSetAndFill() throws Exception {
        ICsvListReader listReader = null;
        try {

        } finally {
            if (listReader != null) {
                listReader.close();
            }
        }
    }
}
