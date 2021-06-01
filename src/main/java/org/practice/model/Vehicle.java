package org.practice.model;

public class Vehicle {

   private String registraionNo;

   private String color;

    public Vehicle(String registraionNo, String color) {
        this.registraionNo = registraionNo;
        this.color = color;
    }

    public String getRegistraionNo() {
        return registraionNo;
    }

    public String getColor() {
        return color;
    }


}
