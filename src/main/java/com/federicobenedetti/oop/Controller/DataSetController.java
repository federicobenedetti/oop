package com.federicobenedetti.oop.Controller;

import com.federicobenedetti.oop.Model.DataSetModel;

import java.util.ArrayList;

public class DataSetController {
    private String DATASET = "http://ec.europa.eu/eurostat/estat-navtree-portlet-prod/BulkDownloadListing?file=data/hlth_ehis_de2.tsv.gz&unzip=true";
    private ArrayList<DataSetModel> _dataSet = new ArrayList<>();

    private DataSetDownloadController _dsdc;

    public DataSetController() {
        _dsdc = new DataSetDownloadController(DATASET, _dataSet);
        _dsdc.DownloadDataSet();
    }

}
