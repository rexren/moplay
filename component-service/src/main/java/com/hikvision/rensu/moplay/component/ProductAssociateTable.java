package com.hikvision.rensu.moplay.component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by rensu on 2017/7/19.
 */
@Entity(name = "PRODUCT_ASSOCIATE_TABLE")
public class ProductAssociateTable implements Serializable {
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -1L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "PRODUCT_ID", nullable = false)
    private Long productId;

    @Column(name = "COMPONENT_ID", nullable = false)
    private Long componentId;

    public ProductAssociateTable(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getComponentId() {
        return componentId;
    }

    public void setComponentId(Long componentId) {
        this.componentId = componentId;
    }
}
