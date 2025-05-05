package com.engineeringDigest.vehicles;

public class Bus implements Vehicle{
    private DiscountService discountService;
    private String brandName;
    private Double maximumRetailPrice;

    public Bus(){

    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Double getMaximumRetailPrice() {
        return maximumRetailPrice;
    }

    public void setMaximumRetailPrice(Double maximumRetailPrice) {
        this.maximumRetailPrice = maximumRetailPrice;
    }

    public DiscountService getDiscountService() {
        return discountService;
    }

    public void setDiscountService(DiscountService discountService) {
        this.discountService = discountService;
    }

    public Bus(DiscountService discountService){
        this.discountService = discountService;
    }
    public String getDiscountMessage() {
        return "Bus: " + this.discountService.getDiscountMessage();
    }

    public String getMileage() {
        return "20kmpl";
    }
}