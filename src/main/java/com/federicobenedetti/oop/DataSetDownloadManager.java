package com.federicobenedetti.oop;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

public class DataSetDownloadManager {

    private String _dataSetUrl;
    private ArrayList<DataSet> _dataSet;
    private String _dataSetName = "dataset.tsv";
    private boolean _isDataSetPresent = false;

    public DataSetDownloadManager(String url, ArrayList<DataSet> dataSet) {
        this._dataSet = dataSet;
        this._dataSetUrl = url;
        this._isDataSetPresent = IsDataSetPresent();
    }

    private boolean IsDataSetPresent() {
        File f = new File(this._dataSetName);
        if (f.exists() && !f.isDirectory()) {
            return true;
        }
        return false;
    }


    public void DownloadDataSet() {
        System.out.println("Checking DataSet...");
        if (!this._isDataSetPresent) {
            System.out.println("DataSet is NOT present, downloading...");
            try {
                HttpURLConnection.setFollowRedirects(true);
                URL url = new URL(this._dataSetUrl);
                HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
                httpConn.setInstanceFollowRedirects(true);
                httpConn.setDoInput(true);
                httpConn.connect();
                if (httpConn.getResponseCode() == HttpURLConnection.HTTP_MOVED_TEMP) {
                    URL redirectUrl = new URL(httpConn.getHeaderField("Location"));
                    httpConn = (HttpURLConnection) redirectUrl.openConnection();
                }
                InputStream is = httpConn.getInputStream();
                Files.copy(is, Paths.get(this._dataSetName), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("DataSet downloded.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("DataSet present.");
        }

        if (IsDataSetPresent()) {
            DataSetParser parser = new DataSetParser(new File(this._dataSetName), this._dataSet);
            try {
                parser.ParseDataSetAndFill();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
