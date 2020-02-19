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
        while ((row = csvReader.readLine()) != null) {
            String[] data = row.split("\t");

            for (int i = 0; i < data.length; i++) {
                DataSet ds = new DataSet();
                switch (i) {
                    case 0:
                        ds.setBmiSexAgeQuantileTimeGeo(data[i]);
                        break;
                    case 1:
                        ds.setBE(data[i]);
                        break;
                    case 2:
                        ds.setBG(data[i]);
                        break;
                    case 3:
                        ds.setDE(data[i]);
                        break;
                    case 4:
                        ds.setEE(data[i]);
                        break;
                    case 5:
                        ds.setEL(data[i]);
                        break;
                    case 6:
                        ds.setES(data[i]);
                        break;
                    case 7:
                        ds.setFR(data[i]);
                        break;
                    case 8:
                        ds.setCY(data[i]);
                        break;
                    case 9:
                        ds.setLV(data[i]);
                        break;
                    case 10:
                        ds.setHU(data[i]);
                        break;
                    case 11:
                        ds.setMT(data[i]);
                        break;
                    case 12:
                        ds.setAT(data[i]);
                        break;
                    case 13:
                        ds.setPL(data[i]);
                        break;
                    case 14:
                        ds.setPL(data[i]);
                        break;
                    case 15:
                        ds.setRO(data[i]);
                        break;
                    case 16:
                        ds.setSI(data[i]);
                        break;
                    case 17:
                        ds.setSK(data[i]);
                        break;
                    case 18:
                        ds.setTR(data[i]);
                        break;
                    default:
                        break;
                }

                this._dataSet.add(ds);
            }
        }
        csvReader.close();
    }
}
