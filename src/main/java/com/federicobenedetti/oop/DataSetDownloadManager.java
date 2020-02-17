package com.federicobenedetti.oop;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class DataSetDownloadManager {

    private String _dataSetUrl;
    private DataSet _dataSet;
    private String _dataSetName = "dataset.csv";
    private boolean _isDataSetPresent = false;

    public DataSetDownloadManager(String url, DataSet dataSet) {
        this._dataSet = dataSet;

        System.out.println("DatasetDownloadManager init with URL: " + url);
        this._dataSetUrl = url;

        File f = new File(this._dataSetName);
        if(f.exists() && !f.isDirectory()) {
            this._isDataSetPresent = true;
        }
    }

    public void DownloadDataSet() {
        if (this._isDataSetPresent) {
            System.out.println("Dataset is already downloaded");
        } else {
            try {
                System.out.println("Starting download");
                URL website = new URL(this._dataSetUrl);
                ReadableByteChannel rbc = Channels.newChannel(website.openStream());
                FileOutputStream fos = new FileOutputStream(this._dataSetName);
                fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
