package com.federicobenedetti.oop.Controllers;

import com.federicobenedetti.oop.Models.DataSetModel;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

/**
 * This is our dataset download controller
 * it will take the URL and try download it
 * It also check for redirect (as it seems that the server we're asking
 * the dataset in fact, do redirect you)
 */
public class DataSetDownloadController {

    private String _dataSetUrl;
    private ArrayList<DataSetModel> _dataSet;
    private String _dataSetName = "dataset.tsv";
    private boolean _isDataSetPresent = false;

    public DataSetDownloadController(String url, ArrayList<DataSetModel> dataSet) {
        this._dataSet = dataSet;
        this._dataSetUrl = url;
        this._isDataSetPresent = IsDataSetPresent();
    }

    /**
     * Simple method to check if the dataset is present or not
     *
     * @return
     */
    private boolean IsDataSetPresent() {
        File f = new File(this._dataSetName);
        if (f.exists() && !f.isDirectory()) {
            return true;
        }
        return false;
    }


    /**
     * First check if the dataset is present
     * If not, download it checking for redirects
     * Then give the File to our ParseController
     */
    public void DownloadDataSet() {
        System.out.println("Checking DataSet...");
        if (!this._isDataSetPresent) {
            System.out.println("DataSet is NOT present, downloading...");
            try {
                System.out.println("Starting download.");
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
                System.out.println("DataSet downloded.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("DataSet present.");
        }

        if (IsDataSetPresent()) {
            DataSetParserController parser = new DataSetParserController(new File(this._dataSetName), this._dataSet);
            try {
                parser.ParseDataSetAndFill();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
