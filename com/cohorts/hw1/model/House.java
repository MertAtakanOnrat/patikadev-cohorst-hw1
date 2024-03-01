package com.cohorts.hw1.model;

import com.cohorts.hw1.enums.HouseType;
import com.cohorts.hw1.general.BaseHouse;

public class House extends BaseHouse {
    public House(String id, double price, double squareMeters, int rooms, int salons, HouseType type) {
        super(id, price, squareMeters, rooms, salons, type);
    }
}
