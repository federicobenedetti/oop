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
        System.out.println("Parsing DataSet");
        BufferedReader csvReader = new BufferedReader(new FileReader(this._dataSetFile));
        String row;
        DataSet ds;

        csvReader.readLine();   // Skipping header
        while ((row = csvReader.readLine()) != null) {
            String[] data = row.split("\t");

            ds = new DataSet();

            // Last line is dirty
            for (int i = 0; i < data.length - 1; i++) {
                String val = SanitizeValue(data[i], i);

                switch (i) {
                    case 0:
                        ds.setBmiSexAgeQuantileTimeGeo(val);
                        break;
                    case 1:
                        ds.setBE(val);
                        break;
                    case 2:
                        ds.setBG(val);
                        break;
                    case 3:
                        ds.setCZ(val);
                        break;
                    case 4:
                        ds.setDE(val);
                        break;
                    case 5:
                        ds.setEE(val);
                        break;
                    case 6:
                        ds.setEL(val);
                        break;
                    case 7:
                        ds.setES(val);
                        break;
                    case 8:
                        ds.setFR(val);
                        break;
                    case 9:
                        ds.setCY(val);
                        break;
                    case 10:
                        ds.setLV(val);
                        break;
                    case 11:
                        ds.setHU(val);
                        break;
                    case 12:
                        ds.setMT(val);
                        break;
                    case 13:
                        ds.setAT(val);
                        break;
                    case 14:
                        ds.setPL(val);
                        break;
                    case 15:
                        ds.setRO(val);
                        break;
                    case 16:
                        ds.setSI(val);
                        break;
                    case 17:
                        ds.setSK(val);
                        break;
                    case 18:
                        ds.setTR(val);
                        break;
                    default:
                        break;
                }
            }
            System.out.println("DataSet: " + ds.toString());
            this._dataSet.add(ds);
        }
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
