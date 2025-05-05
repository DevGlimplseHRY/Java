package com.engineeringDigest.vehicles;

public class Car implements Vehicle{
    private DiscountService discountService;
    private String brandName;
    private Double maximumRetailPrice;
    public Car(){

    }

    public Car(DiscountService discountService, String brandName){
        this.discountService = discountService;
        this.brandName = brandName;
    }

    public DiscountService getDiscountService() {
        return discountService;
    }

    public void setDiscountService(DiscountService discountService) {
        this.discountService = discountService;
    }

    public String getBrandName(){
        return brandName;
    }

    public void setBrandName(String brandName){
        this.brandName = brandName;
    }

    public Double getMaximumRetailPrice() {
        return maximumRetailPrice;
    }

    public void setMaximumRetailPrice(Double maximumRetailPrice) {
        this.maximumRetailPrice = maximumRetailPrice;
    }

    public String getDiscountMessage(){
        return "Car: " + this.discountService.getDiscountMessage();
    }

    public String getMileage() {
        return "30 Kmpl";
    }
}
