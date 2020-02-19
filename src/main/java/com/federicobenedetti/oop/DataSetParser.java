package com.federicobenedetti.oop;

import org.supercsv.cellprocessor.Optional;
import org.supercsv.cellprocessor.ParseBool;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.io.ICsvBeanReader;
import org.supercsv.prefs.CsvPreference;

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
        ICsvBeanReader beanReader = null;
        try {
            String[] header = {"bmi,sex,age,quantile,time\\geo", "BE", "BG", "CZ", "DE", "EE", "EL", "ES", "FR", "CY", "LV", "HU", "MT", "AT", "PL", "RO", "SI", "SK", "TR"};

            beanReader = new CsvBeanReader(new FileReader(this._dataSetFile), CsvPreference.TAB_PREFERENCE);

            System.out.println("Reading: " + beanReader.read(DataSet.class, header));

        } finally {
            if (beanReader != null) {
                beanReader.close();
            }
        }

    }

    private CellProcessor[] GetProcessor() {
        return new CellProcessor[]{
                new NotNull(),
                new Optional(new ParseBool()),
                new Optional(new ParseBool()),
                new Optional(new ParseBool()),
                new Optional(new ParseBool()),
                new Optional(new ParseBool()),
                new Optional(new ParseBool()),
                new Optional(new ParseBool()),
                new Optional(new ParseBool()),
                new Optional(new ParseBool()),
                new Optional(new ParseBool()),
                new Optional(new ParseBool()),
                new Optional(new ParseBool()),
                new Optional(new ParseBool()),
                new Optional(new ParseBool()),
                new Optional(new ParseBool()),
                new Optional(new ParseBool()),
                new Optional(new ParseBool()),
                new Optional(new ParseBool()),
                new Optional(new ParseBool()),
                new Optional(new ParseBool()),
                new Optional(new ParseBool()),
                new Optional(new ParseBool()),
                new Optional(new ParseBool()),
                new Optional(new ParseBool()),
                new Optional(new ParseBool())
        };
    }
}
