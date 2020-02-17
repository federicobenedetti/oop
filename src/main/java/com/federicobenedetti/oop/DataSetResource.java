package com.federicobenedetti.oop;

import java.sql.Timestamp;

public class DataSetResource {
    private String Mimetype;
    private String MimetypeInner;
    private String Hash;
    private String Description;
    private String Format;
    private String Url;
    private Timestamp Created;
    private String TrackingSummary;
    private String Name;
    private String State;
    private Timestamp LastModified;
    private int DownloadTotalResources;
    private String UrlType;
    private String Position;
    private String IframeCode;
    private boolean DatastoreActive;
    private String Id;
    private String ResourceType;
    private String Size;

    public DataSetResource() { }

    public String getMimetype() {
        return Mimetype;
    }

    public void setMimetype(String mimetype) {
        Mimetype = mimetype;
    }

    public String getMimetypeInner() {
        return MimetypeInner;
    }

    public void setMimetypeInner(String mimetypeInner) {
        MimetypeInner = mimetypeInner;
    }

    public String getHash() {
        return Hash;
    }

    public void setHash(String hash) {
        Hash = hash;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getFormat() {
        return Format;
    }

    public void setFormat(String format) {
        Format = format;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public Timestamp getCreated() {
        return Created;
    }

    public void setCreated(Timestamp created) {
        Created = created;
    }

    public String getTrackingSummary() {
        return TrackingSummary;
    }

    public void setTrackingSummary(String trackingSummary) {
        TrackingSummary = trackingSummary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public Timestamp getLastModified() {
        return LastModified;
    }

    public void setLastModified(Timestamp lastModified) {
        LastModified = lastModified;
    }

    public int getDownloadTotalResources() {
        return DownloadTotalResources;
    }

    public void setDownloadTotalResources(int downloadTotalResources) {
        DownloadTotalResources = downloadTotalResources;
    }

    public String getUrlType() {
        return UrlType;
    }

    public void setUrlType(String urlType) {
        UrlType = urlType;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getIframeCode() {
        return IframeCode;
    }

    public void setIframeCode(String iframeCode) {
        IframeCode = iframeCode;
    }

    public boolean isDatastoreActive() {
        return DatastoreActive;
    }

    public void setDatastoreActive(boolean datastoreActive) {
        DatastoreActive = datastoreActive;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getResourceType() {
        return ResourceType;
    }

    public void setResourceType(String resourceType) {
        ResourceType = resourceType;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }
}
