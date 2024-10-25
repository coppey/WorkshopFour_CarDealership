package com.ps;


import java.util.ArrayList;
import java.util.List;

public class Dealership
{
    private String name;
    private String address;
    private String phone;

    ArrayList<Vehicle> inventory;

    public Dealership(String address,
                      String name,
                      String phone)
    {
        this.address = address;
        this.name = name;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }

    public List<Vehicle> getVehiclesByPrice(double min, double max){
        return null;
    }

    public List<Vehicle> getVehiclesByMakeModel(String make, String model){
        return null;
    }

    public List<Vehicle> getVehiclesByYear(int year){
        return null;
    }

    public List<Vehicle> getVehiclesByColor(String color){
        return null;
    }

    public List<Vehicle> getVehiclesByMileage(int odometer){
        return null;
    }

    public List<Vehicle> getVehiclesByType(String vehicleType){
        return null;
    }

    public List<Vehicle> getAllVehicles(){
        return this.inventory;
    }

    public void addVehicles(Vehicle vehicle){
        this.inventory.add(vehicle);
    }

    public void removeVehicles(Vehicle vehicle){
        this.inventory.remove(vehicle);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }




}
