package com.example.as.classes.database;

import java.util.Date;

public class RISData {

    private String date;
    private String entity;
    private String delegation;
    private String id;

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

    private Date hour;

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

    public Date getHour() {
        return hour;
    }

}
