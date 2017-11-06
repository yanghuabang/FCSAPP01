package com.sharemarking.application.wkq.entity;

import com.sharemarking.application.common.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Table(name = "attendance")
public class Attendance extends BaseEntity{


    private Integer oid;

    private String status;

    private String type;

    private Integer times;

    private String name;

    private String place;

    private Long refreshFrequency;

    private Date schemaStartTime;

    private Date schemaEndTime;

    private Date atteddanceStartTime;

    private Date attendenceStartTime;


    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Long getRefreshFrequency() {
        return refreshFrequency;
    }

    public void setRefreshFrequency(Long refreshFrequency) {
        this.refreshFrequency = refreshFrequency;
    }

    public Date getSchemaStartTime() {
        return schemaStartTime;
    }

    public void setSchemaStartTime(Date schemaStartTime) {
        this.schemaStartTime = schemaStartTime;
    }

    public Date getSchemaEndTime() {
        return schemaEndTime;
    }

    public void setSchemaEndTime(Date schemaEndTime) {
        this.schemaEndTime = schemaEndTime;
    }

    public Date getAtteddanceStartTime() {
        return atteddanceStartTime;
    }

    public void setAtteddanceStartTime(Date atteddanceStartTime) {
        this.atteddanceStartTime = atteddanceStartTime;
    }

    public Date getAttendenceStartTime() {
        return attendenceStartTime;
    }

    public void setAttendenceStartTime(Date attendenceStartTime) {
        this.attendenceStartTime = attendenceStartTime;
    }
}