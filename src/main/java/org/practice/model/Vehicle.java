package org.practice.model;

public class Vehicle {

   private String registraionNo;

   private String color;

   private VehicleType vehicleType;

    public Vehicle(String registraionNo, String color, VehicleType vehicleType) {
        this.registraionNo = registraionNo;
        this.color = color;
        this.vehicleType = vehicleType;
    }

    public String getRegistraionNo() {
        return registraionNo;
    }

    public String getColor() {
        return color;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
