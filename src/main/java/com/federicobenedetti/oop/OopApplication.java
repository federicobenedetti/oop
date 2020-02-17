package com.federicobenedetti.oop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OopApplication {

	private static String DATASET = "https://data.europa.eu/euodp/data/api/3/action/package_show?id=1KNEJIFSG7jHcPFDk61Vcg";
	private static DataSet _dataset = new DataSet();
	private static DatasetDownloadManager _ddm = new DatasetDownloadManager(DATASET);

	public static void main(String[] args) {
		// First let's start Spring
		SpringApplication.run(OopApplication.class, args);

		// Now let's download
		_ddm.DownloadDataset();
	}

}
