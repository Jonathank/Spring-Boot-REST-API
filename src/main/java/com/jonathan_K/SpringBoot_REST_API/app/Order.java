/**
 * 
 */
package com.jonathan_K.SpringBoot_REST_API.app;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author JONATHAN
 */
public class Order {

    @JsonProperty("c-name")
    private String customerName;
    @JsonProperty("p-name")
    private String productName;
    @JsonProperty("quantity")
    private int quantity;
    
    
    
    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }



    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }



    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }



    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }



    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }


    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
	return "Order [\n customerName=" + customerName + ",\n productName=" + productName + ",\n quantity=" + quantity + "]";
    }


    
}
