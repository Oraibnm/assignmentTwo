package com.example.assignmentTwo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "product", uniqueConstraints = {@UniqueConstraint(columnNames = {"name"})})

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", nullable = false)
    private Long product_id;

    @NotNull(message = "Product name is required.")
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "slug", nullable = false)
    private String slug;
    @Column(name = "reference", nullable = false)
    private String reference;
    @Column(name = "price", nullable = false)
    private Double price ;
    @Column(name = "vat", nullable = false)
    private Double vat ;
    @Column(name = "stock_able", nullable = false)
    private boolean stock_able;

    public Product(Long id, String name, String slug, String reference, double price, double vat, boolean stock_able) {
        this.product_id = id;
        this.name = name;
        this.slug = slug;
        this.reference = reference;
        this.price = price;
        this.vat = vat;
        this.stock_able = stock_able;
    }

    public Long getId() {
        return product_id;
    }

    public void setId(Long id) {
        this.product_id = id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public boolean isStock_able() {
        return stock_able;
    }

    public void setStock_able(boolean stock_able) {
        this.stock_able = stock_able;
    }
}
