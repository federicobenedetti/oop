package com.federicobenedetti.oop;

import com.federicobenedetti.oop.Controller.DataSetDownloadController;
import com.federicobenedetti.oop.Model.DataSetModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class OopApplication {

	private static String DATASET = "http://ec.europa.eu/eurostat/estat-navtree-portlet-prod/BulkDownloadListing?file=data/hlth_ehis_de2.tsv.gz&unzip=true";
	private static ArrayList<DataSetModel> _dataSet = new ArrayList<DataSetModel>();
	private static DataSetDownloadController _ddm = new DataSetDownloadController(DATASET, _dataSet);

	public static void main(String[] args) {
		// First let's start Spring
		SpringApplication.run(OopApplication.class, args);

		// Now let's download
		_ddm.DownloadDataSet();
	}
}

