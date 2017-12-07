package com.hikvision.rensu.moplay.component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 发布的组件，一个组件会发布多个版本
 */
@Entity(name = "COMPONENT_VERSION")
public class ComponentVersion implements Serializable{
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -1L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "CID", nullable = false)
    private Long cid;

    @Column(name = "VERSION", unique = true, nullable = false)
    private String version;

    @Column(name = "RELEASE_NOTE", nullable = false)
    private String releaseNote;

    @Column(name = "RELEASE_TIME", nullable = false)
    private LocalDateTime releaseTime;

    @Column(name = "UPDATE_TIME", nullable = false)
    private LocalDateTime updateTime;

    public ComponentVersion() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getReleaseNote() {
        return releaseNote;
    }

    public void setReleaseNote(String releaseNote) {
        this.releaseNote = releaseNote;
    }

    public LocalDateTime getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(LocalDateTime releaseTime) {
        this.releaseTime = releaseTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
}
