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

        System.out.println("DatasetDownloadManager init with URL: " + url);
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
        if (!this._isDataSetPresent) {
            try {
                System.out.println("Starting download");
                HttpURLConnection.setFollowRedirects(true);
                URL url = new URL(this._dataSetUrl);
                HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
                httpConn.setInstanceFollowRedirects(true);
                httpConn.setDoInput(true);
                httpConn.connect();
                if (httpConn.getResponseCode() == HttpURLConnection.HTTP_MOVED_TEMP) {
                    System.out.println("Redirect detected");
                    URL redirectUrl = new URL(httpConn.getHeaderField("Location"));
                    System.out.println("Redirect URL: " + redirectUrl);
                    httpConn = (HttpURLConnection) redirectUrl.openConnection();
                }
                InputStream is = httpConn.getInputStream();
                Files.copy(is, Paths.get(this._dataSetName), StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (IsDataSetPresent()) {
            System.out.println("DataSet downloaded, now proceeding to parse...");
            DataSetParser parser = new DataSetParser(new File(this._dataSetName), this._dataSet);
            try {
                parser.ParseDataSetAndFill();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
