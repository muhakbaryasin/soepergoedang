package com.soeper.goedang.entities;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;


@Entity
@Table(name = "products")
public class Product extends BaseEntity {
    @Column(name = "name", length = 512, nullable = false)
    private String name;

    @Column(name = "code", length = 64, nullable = false)
    private String code;

    @Column(name = "description", length = 64)
    private String description;

    @Column(name = "content_item_quantity")
    private Integer contentItemQuantity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "packet_package_type_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private PacketPackageType packetPackageType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "content_product_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Product contentProduct;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getContentItemQuantity() {
        return contentItemQuantity;
    }

    public void setContentItemQuantity(Integer contentItemQuantity) {
        this.contentItemQuantity = contentItemQuantity;
    }

    public PacketPackageType getPacketPackageType() {
        return packetPackageType;
    }

    public void setPacketPackageType(PacketPackageType packetPackageType) {
        this.packetPackageType = packetPackageType;
    }

    public Product getContentProduct() {
        return contentProduct;
    }

    public void setContentProduct(Product contentProduct) {
        this.contentProduct = contentProduct;
    }
}
