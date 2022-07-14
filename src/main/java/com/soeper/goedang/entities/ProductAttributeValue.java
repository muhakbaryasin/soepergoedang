package com.soeper.goedang.entities;

import javax.persistence.*;


@Table(name = "product_attribute_values")
@Entity
public class ProductAttributeValue extends BaseEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_attribute_name_id", nullable = false)
    private ProductAttributeName productAttributeName;

    @Column(name = "value", nullable = false)
    private String value;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ProductAttributeName getProductAttributeName() {
        return productAttributeName;
    }

    public void setProductAttributeName(ProductAttributeName productAttributeName) {
        this.productAttributeName = productAttributeName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
