package com.hikvision.rensu.moplay.component;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 产品发布版本记录
 */
@Entity(name = "PRODUCT_VERSION")
public class ProductVersion implements Serializable{

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -1L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "PID", nullable = false)
    private Long pid;

    @Column(name = "VERSION", unique = true, nullable = false)
    private String version;

    @Column(name = "RELEASE_NOTE")
    private String releaseNote;

    @Column(name = "RELEASE_TIME", nullable = false)
    private LocalDateTime releaseTime;

    @Column(name = "UPDATE_TIME", nullable = false)
    private LocalDateTime updateTime;

    public ProductVersion() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
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
