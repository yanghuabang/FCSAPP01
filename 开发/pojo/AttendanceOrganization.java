package com.sharemarking.application.wkq.entity;

import com.sharemarking.application.common.BaseEntity;
import com.sharemarking.application.common.BaseRepository;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Table(name = "attendance_organization")
public class AttendanceOrganization extends BaseEntity{


    private Integer uid;

    private String name;


    private Integer total;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "AttendanceOrganization{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", total=" + total +
                '}';
    }
}