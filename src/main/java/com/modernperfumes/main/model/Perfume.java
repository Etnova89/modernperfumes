package com.modernperfumes.main.model;

public class Perfume  {
    int id;
    String description;
    String sku;
    String price;
    Integer quantity;
    Integer vendorId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public int getVendorId() {
        return vendorId;
    }

    public void setVendorId(int vendorId) {
        this.vendorId = vendorId;
    }

    public void setProperty(String property, String value) {
        switch(property) {
            case "price":
//                setPrice(Double.valueOf(value));
                setPrice(value);
                break;
            case "sku":
                setSku(value);
                break;
            case "description":
                setDescription(value);
                break;
            case "quantity":
                setQuantity(Integer.valueOf(value));
                break;
            default:
                break;
                // code block
        }
    }
}
