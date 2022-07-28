package com.soeper.goedang.entities;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "inventories")
public class Inventory extends BaseNameEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "inventory_type_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private InventoryType inventoryType;

    public InventoryType getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(InventoryType inventoryType) {
        this.inventoryType = inventoryType;
    }
}
