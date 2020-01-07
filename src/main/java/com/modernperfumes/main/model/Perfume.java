package com.modernperfumes.main.model;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "perfume")
public class Perfume  {
    @Id
    String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }
//    int id;
//    String description;
//    String sku;
//    Double price;
//    Integer quantity;
//    Integer vendorId;
//    String brand;
//    static String[] priceAliases = new String[] {"price", "special price", "price us$"};
//    static String[] descriptionAliases = new String[] {"description", "long description"};
//    static String[] skuAliases = new String[] {"sku", "upc"};
//    static String[] quantityAliases = new String[] {"quantity", "qty"};
//    static String[] brandAliases = new String[] {"brand"};
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public String getSku() {
//        return sku;
//    }
//
//    public void setSku(String sku) {
//        this.sku = sku;
//    }
//
//    public Double getPrice() {
//        return price;
//    }
//
//    public void setPrice(Double price) {
//        this.price = price;
//    }
//
//    public void setVendorId(Integer vendorId) {
//        this.vendorId = vendorId;
//    }
//
//    public Integer getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(Integer quantity) {
//        this.quantity = quantity;
//    }
//
//    public Integer getVendorId() {
//        return vendorId;
//    }
//
//    public String getBrand() {
//        return brand;
//    }
//
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//
//    public void setProperty(String property, Object value) {
//        switch(property) {
//            case "price":
////                setPrice(Double.valueOf(value));
//                setPrice((Double) value);
//                break;
//            case "sku":
//                setSku((String) value);
//                break;
//            case "description":
//                setDescription((String) value);
//                break;
//            case "quantity":
//                setQuantity(Integer.valueOf((Integer) value));
//                break;
//            case "brand":
//                setBrand((String) value);
//                break;
//            default:
//                break;
//                // code block
//        }
//    }
//
//    public static boolean isPriceAlias(String priceHeaderName) {
//        for (String alias: priceAliases) {
//            if(priceHeaderName.toLowerCase().contains(alias)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public static boolean isDescriptionAlias(String descriptionHeaderName) {
//        for (String alias: descriptionAliases) {
//            if(descriptionHeaderName.toLowerCase().contains(alias)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public static boolean isSkuAlias(String skuHeaderName) {
//        for (String alias: skuAliases) {
//            if(skuHeaderName.toLowerCase().contains(alias)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public static boolean isQuantityAlias(String quantityHeaderName) {
//        for (String alias: quantityAliases) {
//            if(quantityHeaderName.toLowerCase().contains(alias)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public static boolean isBrandAlias(String brandHeaderName) {
//        for (String alias: brandAliases) {
//            if(brandHeaderName.toLowerCase().contains(alias)) {
//                return true;
//            }
//        }
//        return false;
//    }

}
