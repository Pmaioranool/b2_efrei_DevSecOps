package com.example.DevSecOps;

public class Car {

    String PlateNumber;
    String Brand;
    int Price;
    boolean Rent = false;

    public Car(String PlateNumber, String Brand, int Price) {
        this.PlateNumber = PlateNumber;
        this.Brand = Brand;
        this.Price = Price;
    }

    public String getPlateNumber() {
        return PlateNumber;
    }

    public String getBrand() {
        return Brand;
    }

    public int getPrice() {
        return Price;
    }

    public boolean isRent() {
        return Rent;
    }

    public void setPlateNumber(String PlateNumber) {
        this.PlateNumber = PlateNumber;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public void setRent(boolean rent) {
        Rent = rent;
    }
}
