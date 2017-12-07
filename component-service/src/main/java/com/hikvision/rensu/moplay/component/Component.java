package com.hikvision.rensu.moplay.component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Calendar;

/**
 * 组件，多个组件组成一个产品
 * Created by rensu on 2017/7/19.
 */
@Entity(name = "COMPONENT")
public class Component implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -1L;

    @Id
    @GeneratedValue
    private Long id;

    /**
     * 组件名
     */
    @Column(name = "NAME", nullable = false)
    private String name;

    /**
     * 组件缩写名
     */
    @Column(name = "ABBREVIATION", nullable = true)
    private String abbreviation;

    /**
     * 申请时间
     */
    @Column(name = "CREATE_TIME", nullable = false)
    private Calendar createTime;

    /**
     * 更新时间
     */
    @Column(name = "UPDATE_TIME", nullable = false)
    private Calendar updateTime;

    public Component() {
    }

    public Component(String name, String abbreviation) {
        this.name = name;
        this.abbreviation = abbreviation;
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

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviaion) {
        this.abbreviation = abbreviation;
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
