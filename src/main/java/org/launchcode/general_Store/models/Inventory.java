package org.launchcode.general_Store.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Inventory {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=150)
    private String name;

    private String description;

    private int sku;

    private String vendor;

    @NotNull
    private double purchaseCost;

    @NotNull
    private double salePrice;

    ///
    public Inventory(String name, String description, int sku, double purchaseCost, double salePrice, String vendor) {
        this.name = name;
        this.description = description;
        this.sku = sku;
        this.purchaseCost = purchaseCost;
        this.salePrice = salePrice;
        this.vendor = vendor;
    }

    public Inventory() { }




//getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public double getPurchaseCost() {
        return purchaseCost;
    }

    public void setPurchaseCost(double purchaseCost) {
        this.purchaseCost = purchaseCost;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

}