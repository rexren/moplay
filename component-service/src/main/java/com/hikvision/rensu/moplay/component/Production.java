package com.hikvision.rensu.moplay.component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Calendar;

/**
 * Created by rensu on 2017/7/19.
 * 产品，一个产品会有多个集成版本，每个集成版本会包含多个组件
 */
@Entity(name = "PRODUCTION")
public class Production implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -1L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "DESCRIPTION", nullable = true)
    private String description;

    @Column(name = "CREATE_TIME", nullable = false)
    private Calendar createTime;

    @Column(name = "UPDATE_TIME", nullable = false)
    private Calendar updateTime;

    public Production() {
    }

    public Production(String name) {
        this.name = name;
    }

    public Production(String name, String description) {
        this.name = name;
        this.description = description;
        createTime = Calendar.getInstance();
        updateTime = Calendar.getInstance();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Calendar getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Calendar createTime) {
        this.createTime = createTime;
    }

    public Calendar getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Calendar updateTime) {
        this.updateTime = updateTime;
    }
}
