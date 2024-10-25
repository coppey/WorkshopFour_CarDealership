package com.ps;

public class Vehicle
{
    private int vin;
    private int year;
    private String make;
    private String model;
    private String vehicleType;
    private String color;
    private int odometer;
    private double price;

    public Vehicle(String color,
                   String make,
                   String model,
                   int odometer,
                   double price,
                   String vehicleType,
                   int vin,
                   int year)
    {
        this.color = color;
        this.make = make;
        this.model = model;
        this.odometer = odometer;
        this.price = price;
        this.vehicleType = vehicleType;
        this.vin = vin;
        this.year = year;
    }




}
