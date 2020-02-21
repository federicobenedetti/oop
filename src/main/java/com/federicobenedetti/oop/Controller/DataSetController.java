package com.federicobenedetti.oop.Controller;

import com.federicobenedetti.oop.Model.DataSetModel;
import com.federicobenedetti.oop.Model.MetaDataDto;
import com.federicobenedetti.oop.Model.StatsDto;

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
        int i = 0;
        double min = 0;
        double max = 0;
        double avg = 0;
        double sum = 0;
        ArrayList<Double> std = new ArrayList<>();
        double devStd = 0;
        double val = 0;

        for (DataSetModel e :
                this._dataSet) {
            val = e.getDataSetValues().get(fieldName);

            // Inserisco nell'array tutti i valori del dato fieldName
            std.add(val);

            // Calcolo somma
            sum += val;

            // Calcolo minimo e massimo
            if (i == 0) {
                min = val;
                max = val;
            }
            if (val < min) {
                min = val;
            }
            if (val > max) {
                max = val;
            }

            i = i + 1;
        }

        // Calcolo media
        avg = sum / i;

        // Calcolo varianza
        for (int j = 0; j < std.size(); j++) {
            std.set(j, (std.get(j) / avg));
            std.set(j, Math.pow(std.get(j), 2));

            devStd += std.get(j);
        }

        devStd = devStd / (i - 1);

        // Creo la statistica e la ritorno
        return new StatsDto(fieldName, avg, min, max, devStd, sum);
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
}
