package com.federicobenedetti.oop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OopApplication {

	private static String DATASET = "http://ec.europa.eu/eurostat/estat-navtree-portlet-prod/BulkDownloadListing?file=data/hlth_ehis_de2.tsv.gz&unzip=true";
	private static DataSet _dataSet = new DataSet();
	private static DataSetDownloadManager _ddm = new DataSetDownloadManager(DATASET, _dataSet);

	public static void main(String[] args) {
		// First let's start Spring
		SpringApplication.run(OopApplication.class, args);

		// Now let's download
		_ddm.DownloadDataSet();

		// TODO: Check for dataset once _ddm send it to DatasetParser
	}

}
