package com.example.assignmentTwo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "stock", uniqueConstraints = {@UniqueConstraint(columnNames = {"id"})})

public class stock {
    @Id
    @Column(name = "stockId", nullable = false)
    private Long stockId;

    @JoinColumn(name = "product_id")
    private Integer productId ;
    @Column(name = "quantity", nullable = false)
    private Integer quantity ;
    @Column(name = "updateAt", nullable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Integer updateAt ;

    public stock(Long stockId, Integer productId, Integer quantity, Integer updateAt) {
        this.stockId = stockId;
        this.productId = productId;
        this.quantity = quantity;
        this.updateAt = updateAt;
    }

    public Long getStockId() {
        return stockId;
    }

    public void setStockId(Long stockId) {
        this.stockId = stockId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Integer updateAt) {
        this.updateAt = updateAt;
    }
}
