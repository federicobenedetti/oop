package com.federicobenedetti.oop.Models.DTOs;

import com.federicobenedetti.oop.Models.Interfaces.ISerializableBean;

public class MetaDataDto implements ISerializableBean {
    private String Alias;
    private String SourceField;
    private String Type;

    public MetaDataDto() {
    }

    public MetaDataDto(String alias, String sourceField, String type) {
        this.Alias = alias;
        this.SourceField = sourceField;
        this.Type = type;
    }

    public String getAlias() {
        return Alias;
    }

    public void setAlias(String alias) {
        Alias = alias;
    }

    public String getSourceField() {
        return SourceField;
    }

    public void setSourceField(String sourceField) {
        SourceField = sourceField;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
}
