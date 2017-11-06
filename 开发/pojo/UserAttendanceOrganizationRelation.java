package com.sharemarking.application.wkq.entity;

import com.sharemarking.application.common.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "user_attendance_organization_relation")
public class UserAttendanceOrganizationRelation extends BaseEntity {

    private Integer uid;

    private Integer oid;

    private Date joinTime;



    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Date getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }
}