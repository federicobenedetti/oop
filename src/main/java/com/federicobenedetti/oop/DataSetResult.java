package com.federicobenedetti.oop;

import com.google.gson.annotations.SerializedName;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;

public class DataSetResult {
    @SerializedName("maintainer")
    private String Maintainer;
    @SerializedName("private")
    private boolean Private;
    @SerializedName("maintainer_email")
    private String MaintainerEmail;
    @SerializedName("revision_timestamp")
    private Timestamp RevisionTimestamp;
    @SerializedName("keywords")
    private String Keywords;
    @SerializedName("metadata_modified")
    private Timestamp MetadataModified;
    @SerializedName("temporal_granularity")
    private String TemporalGranularity;
    @SerializedName("concepts_eurovoc")
    private String[] ConceptsEurovoc;
    @SerializedName("license_id")
    private int LicenseId;
    @SerializedName("type")
    private String Type;
    @SerializedName("resources")
    private DataSetResource[] Resources;
    @SerializedName("interoperability_level")
    private int InteroperabilityLevel;
    @SerializedName("name")
    private String Name;
    @SerializedName("is_open")
    private boolean IsOpen;
    @SerializedName("accrual_periodicity")
    private String AccrualPeriodicity;
    @SerializedName("owner_org")
    private String OwnerOrg;
    @SerializedName("geographical_coverage")
    private String[] GeographicalCoverage;
    @SerializedName("revision_id")
    private int RevisionId;
    @SerializedName("identifier")
    private String Identifier;
    @SerializedName("version_description")
    private String VersionDescription;
    @SerializedName("extras")
    private String[] Extras;
    @SerializedName("relationship_as_object")
    private String[] RelationshipAsObject;
    @SerializedName("tag_string")
    private int TagString;
    @SerializedName("temporal_coverage_to")
    private Date TemporalCoverageTo;
    @SerializedName("num_tags")
    private int NumTags;
    @SerializedName("views_total")
    private int ViewsTotal;
    @SerializedName("id")
    private String Id;
    @SerializedName("metadata_created")
    private Timestamp MetadataCreated;
    @SerializedName("modified_date")
    private Date ModifiedDate;
    @SerializedName("capacity")
    private String Capacity;
    @SerializedName("author")
    private int Author;
    @SerializedName("author_email")
    private String AuthorEmail;
    @SerializedName("type_of_dataset")
    private String[] TypeOfDataset;
    @SerializedName("state")
    private String State;
    @SerializedName("version")
    private String Version;
    @SerializedName("creator_user_id")
    private int CreatorUserId;
    @SerializedName("status")
    private String Status;
    @SerializedName("num_resources")
    private int NumResources;
    @SerializedName("description")
    private String Description;
    @SerializedName("title")
    private String Title;
    @SerializedName("temporal_coverage_from")
    private Date TemporalCoverageFrom;
    @SerializedName("tracking_summary")
    private String TrackingSummary;
    @SerializedName("groups")
    private DataSetGroup[] Groups;
    @SerializedName("relationship_as_subject")
    private String[] RelationshipsAsSubject;
    @SerializedName("language")
    private String[] Language;
    @SerializedName("alternative_title")
    private String AlternativeTitle;
    @SerializedName("url")
    private String Url;
    @SerializedName("release_date")
    private Date ReleaseDate;
    @SerializedName("license_title")
    private String LicenseTitle;
    @SerializedName("rdf")
    private String Rdf;
    @SerializedName("license_url")
    private String LicenseUrl;
    @SerializedName("organization")
    private DataSetOrganization Organization;

    public DataSetResult() {
    }

    @Override
    public String toString() {
        return "DataSetResult{" +
                "Maintainer='" + Maintainer + '\'' +
                ", Private=" + Private +
                ", MaintainerEmail='" + MaintainerEmail + '\'' +
                ", RevisionTimestamp=" + RevisionTimestamp +
                ", Keywords='" + Keywords + '\'' +
                ", MetadataModified=" + MetadataModified +
                ", TemporalGranularity='" + TemporalGranularity + '\'' +
                ", ConceptsEurovoc=" + Arrays.toString(ConceptsEurovoc) +
                ", LicenseId=" + LicenseId +
                ", Type='" + Type + '\'' +
                ", Resources=" + Arrays.toString(Resources) +
                ", InteroperabilityLevel=" + InteroperabilityLevel +
                ", Name='" + Name + '\'' +
                ", IsOpen=" + IsOpen +
                ", AccrualPeriodicity='" + AccrualPeriodicity + '\'' +
                ", OwnerOrg='" + OwnerOrg + '\'' +
                ", GeographicalCoverage=" + Arrays.toString(GeographicalCoverage) +
                ", RevisionId=" + RevisionId +
                ", Identifier='" + Identifier + '\'' +
                ", VersionDescription='" + VersionDescription + '\'' +
                ", Extras=" + Arrays.toString(Extras) +
                ", RelationshipAsObject=" + Arrays.toString(RelationshipAsObject) +
                ", TagString=" + TagString +
                ", TemporalCoverageTo=" + TemporalCoverageTo +
                ", NumTags=" + NumTags +
                ", ViewsTotal=" + ViewsTotal +
                ", Id='" + Id + '\'' +
                ", MetadataCreated=" + MetadataCreated +
                ", ModifiedDate=" + ModifiedDate +
                ", Capacity='" + Capacity + '\'' +
                ", Author=" + Author +
                ", AuthorEmail='" + AuthorEmail + '\'' +
                ", TypeOfDataset=" + Arrays.toString(TypeOfDataset) +
                ", State='" + State + '\'' +
                ", Version='" + Version + '\'' +
                ", CreatorUserId=" + CreatorUserId +
                ", Status='" + Status + '\'' +
                ", NumResources=" + NumResources +
                ", Description='" + Description + '\'' +
                ", Title='" + Title + '\'' +
                ", TemporalCoverageFrom=" + TemporalCoverageFrom +
                ", TrackingSummary='" + TrackingSummary + '\'' +
                ", Groups=" + Arrays.toString(Groups) +
                ", RelationshipsAsSubject=" + Arrays.toString(RelationshipsAsSubject) +
                ", Language=" + Arrays.toString(Language) +
                ", AlternativeTitle='" + AlternativeTitle + '\'' +
                ", Url='" + Url + '\'' +
                ", ReleaseDate=" + ReleaseDate +
                ", LicenseTitle='" + LicenseTitle + '\'' +
                ", Rdf='" + Rdf + '\'' +
                ", LicenseUrl='" + LicenseUrl + '\'' +
                ", Organization=" + Organization +
                '}';
    }
}
