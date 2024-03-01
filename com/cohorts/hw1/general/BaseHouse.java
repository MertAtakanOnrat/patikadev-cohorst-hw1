package com.cohorts.hw1.general;

import com.cohorts.hw1.enums.HouseType;

public abstract class BaseHouse {
    private String id;
    private double price;
    private double squareMeters;
    private int rooms;
    private int salons;
    private HouseType type;

    protected BaseHouse() {
    }

    protected BaseHouse(String id, double price, double squareMeters, int rooms, int salons, HouseType type) {
        this.id = id;
        this.price = price;
        this.squareMeters = squareMeters;
        this.rooms = rooms;
        this.salons = salons;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(double squareMeters) {
        this.squareMeters = squareMeters;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getSalons() {
        return salons;
    }

    public void setSalons(int salons) {
        this.salons = salons;
    }

    public HouseType getType() {
        return type;
    }

    public void setType(HouseType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Type: " + type +
                ", ID: " + id +
                ", Price: " + price +
                ", Square Meters: " + squareMeters +
                ", Rooms: " + rooms +
                ", Salons: " + salons;
    }

}
