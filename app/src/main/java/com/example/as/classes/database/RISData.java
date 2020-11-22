package com.example.as.classes.database;

import java.util.Date;

public class RISData {

    private String date;
    private String entity;
    private String delegation;
    private String id;
    private String hour;
    private String key;

    private int implicate;

    private boolean trafficAccident;
    private boolean assault;
    private boolean violence;
    private boolean shooting;
    private boolean kidnapping;
    private boolean emblem_abuse;
    private boolean arrests;
    private boolean personalAssault;
    private boolean extortion;
    private boolean threat;
    private boolean preventAccess;
    private boolean assaultOnFacilities;
    private boolean assaultOnStaff;
    private boolean aggressionToTransported;
    private boolean state;

    public RISData() {
    }

    public String getDate() {
        return date;
    }

    public String getEntity() {
        return entity;
    }

    public String getDelegation() {
        return delegation;
    }

    public String getId() {
        return id;
    }

    public int getImplicate() {
        return implicate;
    }

    public boolean isTrafficAccident() {
        return trafficAccident;
    }

    public boolean isAssault() {
        return assault;
    }

    public boolean isViolence() {
        return violence;
    }

    public boolean isShooting() {
        return shooting;
    }

    public boolean isKidnapping() {
        return kidnapping;
    }

    public boolean isEmblem_abuse() {
        return emblem_abuse;
    }

    public boolean isArrests() {
        return arrests;
    }

    public boolean isPersonalAssault() {
        return personalAssault;
    }

    public boolean isExtortion() {
        return extortion;
    }

    public boolean isThreat() {
        return threat;
    }

    public boolean isPreventAccess() {
        return preventAccess;
    }

    public boolean isAssaultOnFacilities() {
        return assaultOnFacilities;
    }

    public boolean isAssaultOnStaff() {
        return assaultOnStaff;
    }

    public boolean isAggressionToTransported() {
        return aggressionToTransported;
    }

    public boolean isState() {
        return state;
    }

    public String getHour() {
        return hour;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public RISData(String date, String entity, String delegation, String id, String hour,
                   int implicate, boolean trafficAccident, boolean assault, boolean violence,
                   boolean shooting, boolean kidnapping, boolean emblem_abuse, boolean arrests,
                   boolean personalAssault, boolean extortion, boolean threat,
                   boolean preventAccess, boolean assaultOnFacilities, boolean assaultOnStaff,
                   boolean aggressionToTransported, boolean state) {
        this.date = date;
        this.entity = entity;
        this.delegation = delegation;
        this.id = id;
        this.hour = hour;
        this.implicate = implicate;
        this.trafficAccident = trafficAccident;
        this.assault = assault;
        this.violence = violence;
        this.shooting = shooting;
        this.kidnapping = kidnapping;
        this.emblem_abuse = emblem_abuse;
        this.arrests = arrests;
        this.personalAssault = personalAssault;
        this.extortion = extortion;
        this.threat = threat;
        this.preventAccess = preventAccess;
        this.assaultOnFacilities = assaultOnFacilities;
        this.assaultOnStaff = assaultOnStaff;
        this.aggressionToTransported = aggressionToTransported;
        this.state = state;
    }
}
