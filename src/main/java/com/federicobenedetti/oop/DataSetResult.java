package com.federicobenedetti.oop;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;

public class DataSetResult implements IDataSet {
    private String Maintainer;
    private boolean Private;
    private String MaintainerEmail;
    private Timestamp RevisionTimestamp;
    private String Keywords;
    private Timestamp MetadataModified;
    private String TemporalGranularity;
    private String[] ConceptsEurovoc;
    private int LicenseId;
    private String Type;
    private DataSetResource[] Resources;
    private int InteroperabilityLevel;
    private String Name;
    private boolean IsOpen;
    private String AccrualPeriodicity;
    private String OwnerOrg;
    private String[] GeographicalCoverage;
    private int RevisionId;
    private String Identifier;
    private String VersionDescription;
    private String[] Extras;
    private String[] RelationshipAsObject;
    private int TagString;
    private Date TemporalCoverageTo;
    private int NumTags;
    private int ViewsTotal;
    private String Id;
    private Timestamp MetadataCreated;
    private Date ModifiedDate;
    private String Capacity;
    private int Author;
    private String AuthorEmail;
    private String[] TypeOfDataset;
    private String State;
    private String Version;
    private int CreatorUserId;
    private String Status;
    private int NumResources;
    private String Description;
    private String Title;
    private Date TemporalCoverageFrom;
    private String TrackingSummary;
    private DataSetGroup[] Groups;
    private String[] RelationshipsAsSubject;
    private String[] Language;
    private String AlternativeTitle;
    private String Url;
    private Date ReleaseDate;
    private String LicenseTitle;
    private String Rdf;
    private String LicenseUrl;
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

    public String getMaintainer() {
        return Maintainer;
    }

    public void setMaintainer(String maintainer) {
        Maintainer = maintainer;
    }

    public boolean isPrivate() {
        return Private;
    }

    public void setPrivate(boolean aPrivate) {
        Private = aPrivate;
    }

    public String getMaintainerEmail() {
        return MaintainerEmail;
    }

    public void setMaintainerEmail(String maintainerEmail) {
        MaintainerEmail = maintainerEmail;
    }

    public Timestamp getRevisionTimestamp() {
        return RevisionTimestamp;
    }

    public void setRevisionTimestamp(Timestamp revisionTimestamp) {
        RevisionTimestamp = revisionTimestamp;
    }

    public String getKeywords() {
        return Keywords;
    }

    public void setKeywords(String keywords) {
        Keywords = keywords;
    }

    public Timestamp getMetadataModified() {
        return MetadataModified;
    }

    public void setMetadataModified(Timestamp metadataModified) {
        MetadataModified = metadataModified;
    }

    public String getTemporalGranularity() {
        return TemporalGranularity;
    }

    public void setTemporalGranularity(String temporalGranularity) {
        TemporalGranularity = temporalGranularity;
    }

    public String[] getConceptsEurovoc() {
        return ConceptsEurovoc;
    }

    public void setConceptsEurovoc(String[] conceptsEurovoc) {
        ConceptsEurovoc = conceptsEurovoc;
    }

    public int getLicenseId() {
        return LicenseId;
    }

    public void setLicenseId(int licenseId) {
        LicenseId = licenseId;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public DataSetResource[] getResources() {
        return Resources;
    }

    public void setResources(DataSetResource[] resources) {
        Resources = resources;
    }

    public int getInteroperabilityLevel() {
        return InteroperabilityLevel;
    }

    public void setInteroperabilityLevel(int interoperabilityLevel) {
        InteroperabilityLevel = interoperabilityLevel;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public boolean isOpen() {
        return IsOpen;
    }

    public void setOpen(boolean open) {
        IsOpen = open;
    }

    public String getAccrualPeriodicity() {
        return AccrualPeriodicity;
    }

    public void setAccrualPeriodicity(String accrualPeriodicity) {
        AccrualPeriodicity = accrualPeriodicity;
    }

    public String getOwnerOrg() {
        return OwnerOrg;
    }

    public void setOwnerOrg(String ownerOrg) {
        OwnerOrg = ownerOrg;
    }

    public String[] getGeographicalCoverage() {
        return GeographicalCoverage;
    }

    public void setGeographicalCoverage(String[] geographicalCoverage) {
        GeographicalCoverage = geographicalCoverage;
    }

    public int getRevisionId() {
        return RevisionId;
    }

    public void setRevisionId(int revisionId) {
        RevisionId = revisionId;
    }

    public String getIdentifier() {
        return Identifier;
    }

    public void setIdentifier(String identifier) {
        Identifier = identifier;
    }

    public String getVersionDescription() {
        return VersionDescription;
    }

    public void setVersionDescription(String versionDescription) {
        VersionDescription = versionDescription;
    }

    public String[] getExtras() {
        return Extras;
    }

    public void setExtras(String[] extras) {
        Extras = extras;
    }

    public String[] getRelationshipAsObject() {
        return RelationshipAsObject;
    }

    public void setRelationshipAsObject(String[] relationshipAsObject) {
        RelationshipAsObject = relationshipAsObject;
    }

    public int getTagString() {
        return TagString;
    }

    public void setTagString(int tagString) {
        TagString = tagString;
    }

    public Date getTemporalCoverageTo() {
        return TemporalCoverageTo;
    }

    public void setTemporalCoverageTo(Date temporalCoverageTo) {
        TemporalCoverageTo = temporalCoverageTo;
    }

    public int getNumTags() {
        return NumTags;
    }

    public void setNumTags(int numTags) {
        NumTags = numTags;
    }

    public int getViewsTotal() {
        return ViewsTotal;
    }

    public void setViewsTotal(int viewsTotal) {
        ViewsTotal = viewsTotal;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public Timestamp getMetadataCreated() {
        return MetadataCreated;
    }

    public void setMetadataCreated(Timestamp metadataCreated) {
        MetadataCreated = metadataCreated;
    }

    public Date getModifiedDate() {
        return ModifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        ModifiedDate = modifiedDate;
    }

    public String getCapacity() {
        return Capacity;
    }

    public void setCapacity(String capacity) {
        Capacity = capacity;
    }

    public int getAuthor() {
        return Author;
    }

    public void setAuthor(int author) {
        Author = author;
    }

    public String getAuthorEmail() {
        return AuthorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        AuthorEmail = authorEmail;
    }

    public String[] getTypeOfDataset() {
        return TypeOfDataset;
    }

    public void setTypeOfDataset(String[] typeOfDataset) {
        TypeOfDataset = typeOfDataset;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }

    public int getCreatorUserId() {
        return CreatorUserId;
    }

    public void setCreatorUserId(int creatorUserId) {
        CreatorUserId = creatorUserId;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public int getNumResources() {
        return NumResources;
    }

    public void setNumResources(int numResources) {
        NumResources = numResources;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Date getTemporalCoverageFrom() {
        return TemporalCoverageFrom;
    }

    public void setTemporalCoverageFrom(Date temporalCoverageFrom) {
        TemporalCoverageFrom = temporalCoverageFrom;
    }

    public String getTrackingSummary() {
        return TrackingSummary;
    }

    public void setTrackingSummary(String trackingSummary) {
        TrackingSummary = trackingSummary;
    }

    public DataSetGroup[] getGroups() {
        return Groups;
    }

    public void setGroups(DataSetGroup[] groups) {
        Groups = groups;
    }

    public String[] getRelationshipsAsSubject() {
        return RelationshipsAsSubject;
    }

    public void setRelationshipsAsSubject(String[] relationshipsAsSubject) {
        RelationshipsAsSubject = relationshipsAsSubject;
    }

    public String[] getLanguage() {
        return Language;
    }

    public void setLanguage(String[] language) {
        Language = language;
    }

    public String getAlternativeTitle() {
        return AlternativeTitle;
    }

    public void setAlternativeTitle(String alternativeTitle) {
        AlternativeTitle = alternativeTitle;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public Date getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        ReleaseDate = releaseDate;
    }

    public String getLicenseTitle() {
        return LicenseTitle;
    }

    public void setLicenseTitle(String licenseTitle) {
        LicenseTitle = licenseTitle;
    }

    public String getRdf() {
        return Rdf;
    }

    public void setRdf(String rdf) {
        Rdf = rdf;
    }

    public String getLicenseUrl() {
        return LicenseUrl;
    }

    public void setLicenseUrl(String licenseUrl) {
        LicenseUrl = licenseUrl;
    }

    public DataSetOrganization getOrganization() {
        return Organization;
    }

    public void setOrganization(DataSetOrganization organization) {
        Organization = organization;
    }
}
