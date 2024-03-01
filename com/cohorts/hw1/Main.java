package com.cohorts.hw1;

import com.cohorts.hw1.enums.HouseType;
import com.cohorts.hw1.general.BaseHouse;
import com.cohorts.hw1.model.House;
import com.cohorts.hw1.model.SummerHouse;
import com.cohorts.hw1.model.Villa;
import com.cohorts.hw1.service.HouseService;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        HouseService houseService = new HouseService();

        // Evleri ekleyin
        houseService.addHouse(new House("H1", 100000, 120, 3, 1, HouseType.HOUSE));
        houseService.addHouse(new House("H2", 110000, 130, 4, 2, HouseType.HOUSE));
        houseService.addHouse(new House("H3", 90000, 110, 2, 1, HouseType.HOUSE));

        // Villaları ekleyin
        houseService.addHouse(new Villa("V1", 200000, 250, 4, 2, HouseType.VILLA));
        houseService.addHouse(new Villa("V2", 250000, 300, 5, 3, HouseType.VILLA));
        houseService.addHouse(new Villa("V3", 180000, 220, 3, 2, HouseType.VILLA));

        // Yazlıkları ekleyin
        houseService.addHouse(new SummerHouse("S1", 150000, 150, 3, 1, HouseType.SUMMERHOUSE));
        houseService.addHouse(new SummerHouse("S2", 160000, 160, 4, 2, HouseType.SUMMERHOUSE));
        houseService.addHouse(new SummerHouse("S3", 140000, 140, 3, 1, HouseType.SUMMERHOUSE));

        // Testleri gerçekleştir
        System.out.println("Total Price of Houses: " + houseService.getTotalPriceByType(HouseType.HOUSE));
        System.out.println("Total Price of Villas: " + houseService.getTotalPriceByType(HouseType.VILLA));
        System.out.println("Total Price of Summer Houses: " + houseService.getTotalPriceByType(HouseType.SUMMERHOUSE));
        System.out.println("Total Price of All Houses: " + houseService.getTotalPrice());

        System.out.println("Average Square Meters of Houses: " + houseService.getAverageSquareMetersByType(HouseType.HOUSE));
        System.out.println("Average Square Meters of Villas: " + houseService.getAverageSquareMetersByType(HouseType.VILLA));
        System.out.println("Average Square Meters of Summer Houses: " + houseService.getAverageSquareMetersByType(HouseType.SUMMERHOUSE));
        System.out.println("Average Square Meters of All Houses: " + houseService.getAverageSquareMeters());

        List<BaseHouse> filteredHouses = houseService.filterHousesByRoomsAndSalons(3, 1);
        System.out.println("Filtered Houses by 3 Rooms and 1 Salon: ");
        filteredHouses.stream().forEach(house -> System.out.println(house.toString()));
    }
}
