package com.federicobenedetti.oop;

import com.google.gson.annotations.SerializedName;

import java.sql.Timestamp;

public class DataSetResource {
    @SerializedName("mimetype")
    private String Mimetype;
    @SerializedName("mimetype_inner")
    private String MimetypeInner;
    @SerializedName("hash")
    private String Hash;
    @SerializedName("description")
    private String Description;
    @SerializedName("format")
    private String Format;
    @SerializedName("url")
    private String Url;
    @SerializedName("created")
    private Timestamp Created;
    @SerializedName("tracking_summary")
    private String TrackingSummary;
    @SerializedName("name")
    private String Name;
    @SerializedName("state")
    private String State;
    @SerializedName("last_modified")
    private Timestamp LastModified;
    @SerializedName("download_total_resources")
    private int DownloadTotalResources;
    @SerializedName("url_type")
    private String UrlType;
    @SerializedName("position")
    private String Position;
    @SerializedName("iframe_code")
    private String IframeCode;
    @SerializedName("datastore_active")
    private boolean DatastoreActive;
    @SerializedName("id")
    private String Id;
    @SerializedName("resource_type")
    private String ResourceType;
    @SerializedName("size")
    private String Size;

    public DataSetResource() {
    }

    @Override
    public String toString() {
        return "DataSetResource{" +
                "Mimetype='" + Mimetype + '\'' +
                ", MimetypeInner='" + MimetypeInner + '\'' +
                ", Hash='" + Hash + '\'' +
                ", Description='" + Description + '\'' +
                ", Format='" + Format + '\'' +
                ", Url='" + Url + '\'' +
                ", Created=" + Created +
                ", TrackingSummary='" + TrackingSummary + '\'' +
                ", Name='" + Name + '\'' +
                ", State='" + State + '\'' +
                ", LastModified=" + LastModified +
                ", DownloadTotalResources=" + DownloadTotalResources +
                ", UrlType='" + UrlType + '\'' +
                ", Position='" + Position + '\'' +
                ", IframeCode='" + IframeCode + '\'' +
                ", DatastoreActive=" + DatastoreActive +
                ", Id='" + Id + '\'' +
                ", ResourceType='" + ResourceType + '\'' +
                ", Size='" + Size + '\'' +
                '}';
    }
}
