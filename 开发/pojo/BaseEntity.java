package com.sharemarking.application.common;

import com.sharemarking.application.common.dto.UserDetailImpl;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(length = 255)
    private String remarks;
    @NotNull
    private Integer createBy;

    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    private Date createDate;
    @NotNull
    private Integer updateBy;

    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    private Date updateDate;
    @NotNull
    private Boolean delFlag;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Boolean getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }

    @PrePersist
    public void prePersist() {
        Authentication om = SecurityContextHolder.getContext().getAuthentication();
        if (om != null) {
            UserDetailImpl udi = (UserDetailImpl) om.getPrincipal();
            setCreateBy(udi.getId());
            setUpdateBy(udi.getId());
        } else {
            setCreateBy(0);
            setUpdateBy(0);
        }
        setCreateDate(new Date());
        setUpdateDate(new Date());
        setDelFlag(false);
    }

	/*@PostPersist
	public void postPersist(){
		Logger logger=LoggerFactory.getLogger("persist");
		SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
		logger.info("{},{},{},{}",sdf.format(this.getCreate_date()),this.getClass().getAnnotation(Table.class).name(),this.getCreate_by(),getId());
	}*/

    @PreUpdate
    public void preUpdate() {
        Authentication om = SecurityContextHolder.getContext().getAuthentication();
        if (om != null) {
            UserDetailImpl udi = (UserDetailImpl) om.getPrincipal();
            setUpdateBy(udi.getId());
        } else {
            setUpdateBy(0);
        }
        setUpdateDate(new Date());
    }
    
    /*@PostUpdate
	public void postUpdate(){
		Logger logger=LoggerFactory.getLogger("update");
		SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
		logger.info("{},{},{},{}",sdf.format(this.getCreate_date()),this.getClass().getAnnotation(Table.class).name(),this.getUpdate_by(),getId());
	}*/

    @Override
    public boolean equals(Object obj) {
        return obj.getClass().equals(this.getClass()) && ((BaseEntity) obj).getId().equals(this.getId());
    }
}
