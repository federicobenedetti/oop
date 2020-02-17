package com.federicobenedetti.oop;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class DatasetDownloadManager {

    private String _datasetUrl = "";

    public DatasetDownloadManager(String url) {
        System.out.println("DatasetDownloadManager init with URL: " + url);
        this._datasetUrl = url;
    }

    public void DownloadDataset() {
        try {
            System.out.println("Starting download");
            URL website = new URL(this._datasetUrl);
            ReadableByteChannel rbc = Channels.newChannel(website.openStream());
            FileOutputStream fos = new FileOutputStream("dataset.csv");
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
