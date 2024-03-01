package com.cohorts.hw1.service;

import com.cohorts.hw1.enums.HouseType;
import com.cohorts.hw1.general.BaseHouse;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HouseService {

    private List<BaseHouse> houses = new ArrayList<>();

    public void addHouse(BaseHouse house) {
        houses.add(house);
    }

    public List<BaseHouse> getHousesByType(HouseType type) {
        return houses.stream().filter(house -> house.getType() == type).collect(Collectors.toList());
    }

    public double getTotalPriceByType(HouseType type) {
        return getHousesByType(type).stream().mapToDouble(BaseHouse::getPrice).sum();
    }

    public double getTotalPrice() {
        return houses.stream().mapToDouble(BaseHouse::getPrice).sum();
    }

    public double getAverageSquareMetersByType(HouseType type) {
        List<BaseHouse> filteredHouses = getHousesByType(type);
        return filteredHouses.stream().mapToDouble(BaseHouse::getSquareMeters).average().orElse(0);
    }

    public double getAverageSquareMeters() {
        return houses.stream().mapToDouble(BaseHouse::getSquareMeters).average().orElse(0);
    }

    public List<BaseHouse> filterHousesByRoomsAndSalons(int rooms, int salons) {
        return houses.stream().filter(house -> house.getRooms() == rooms && house.getSalons() == salons).collect(Collectors.toList());
    }
}
