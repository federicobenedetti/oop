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

    public void PrintDataSet() {
        for (DataSetModel element :
                this._dataSet) {
            System.out.println("Element: " + element.toString());
        }
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

    public StatsDto GetStats() {
        return new StatsDto();
    }

}
