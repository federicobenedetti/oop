package com.federicobenedetti.oop.Controllers;

import com.federicobenedetti.oop.Models.DTOs.DataDto;
import com.federicobenedetti.oop.Models.DTOs.MetaDataDto;
import com.federicobenedetti.oop.Models.DTOs.StatsDto;
import com.federicobenedetti.oop.Models.DataSetModel;

import java.util.ArrayList;
import java.util.Set;

public class DataSetController {
    private String DATASET = "http://ec.europa.eu/eurostat/estat-navtree-portlet-prod/BulkDownloadListing?file=data/hlth_ehis_de2.tsv.gz&unzip=true";
    private ArrayList<DataSetModel> _dataSet = new ArrayList<>();

    private DataSetDownloadController _dsdc;

    public DataSetController() {
        _dsdc = new DataSetDownloadController(DATASET, _dataSet);
        _dsdc.DownloadDataSet();
    }

    public ArrayList<MetaDataDto> GetMetaData() {
        ArrayList list = new ArrayList<MetaDataDto>();
        list.add(new MetaDataDto("Bmi, Sex, Age, Quantile, Time, Geo", "BmiSexAgeQuantileTimeGeo", "String"));

        Set<String> keys = this._dataSet.get(0).getDataSetValues().keySet();
        for (String e :
                keys) {
            list.add(new MetaDataDto(e, e, "Double"));
        }

        return list;
    }

    public boolean IsFieldPresent(String fieldName) {
        for (DataSetModel e :
                this._dataSet) {
            if (e.getDataSetValues().containsKey(fieldName)) {
                return true;
            }
        }
        return false;
    }

    public StatsDto GetStats(String fieldName) {
        ArrayList<Double> std = new ArrayList<>();

        int count = 0;
        double min = 0;
        double max = 0;
        double avg = 0;
        double sum = 0;
        double devStd = 0;
        double val = 0;

        // Parto da 1, l'header lo salto (lo controllo su IsFieldPresent)
        for (int i = 1; i < this._dataSet.size(); i++) {

            if (this._dataSet.get(i).getDataSetValues().containsKey(fieldName)) {
                val = this._dataSet.get(i).getDataSetValues().get(fieldName);


                // Inserisco nell'array tutti i valori del dato fieldName
                std.add(val);

                // Calcolo somma
                sum += val;

                // Calcolo minimo e massimo
                if (count == 0) {
                    min = val;
                    max = val;
                }

                // Escludo gli 0 in quanto, analizzando i valori, non sono presenti di base nel dataset
                // Vengono aggiunti in fase di sanitizzazione dei valori stessi
                if (val != 0 && val < min) {
                    min = val;
                }
                if (val > max) {
                    max = val;
                }
                count += 1;

            }
        }

        // Calcolo media
        avg = sum / count;

        // Calcolo varianza
        for (int j = 0; j < std.size(); j++) {
            std.set(j, (std.get(j) / avg));
            std.set(j, Math.pow(std.get(j), 2));

            devStd += std.get(j);
        }

        devStd = devStd / (count - 1);

        // Creo la statistica e la ritorno
        return new StatsDto(fieldName, avg, min, max, devStd, sum, count);
    }

    public boolean DeleteElementWithId(int id) {
        int index = -1;
        for (int i = 0; i < this._dataSet.size(); i++) {
            if (this._dataSet.get(i).getId() == id) {
                index = i;
            }
        }

        if (index != -1) {
            this._dataSet.remove(index);
            return true;
        }
        return false;
    }

    public int GetDataSize() {
        return this._dataSet.size();
    }

    public ArrayList<DataDto> GetData() {
        ArrayList<DataDto> list = new ArrayList<>();

        for (int i = 0; i < this._dataSet.size(); i++) {
            list.add(new DataDto(i, this._dataSet.get(i).getBmiSexAgeQuantileTimeGeo(), this._dataSet.get(i).getDataSetValues(), this._dataSet.get(i).getId()));
        }
        return list;
    }
}
