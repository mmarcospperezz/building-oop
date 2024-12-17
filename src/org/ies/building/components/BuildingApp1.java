package org.ies.building.components;

import org.ies.building.model.Building;

import java.util.Scanner;

public class BuildingApp1 {
    private final Scanner scanner;
    private final BuildingReader buildingReader;

    public BuildingApp1(Scanner scanner, BuildingReader buildingReader) {
        this.scanner = scanner;
        this.buildingReader = buildingReader;
    }

    public void run() {

        Building building = buildingReader.read();

        System.out.println("Introduce una planta");
        int floor = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduce una puerta");
        String door = scanner.nextLine();

        var apartment = building.findApartment(floor, door);

        if (apartment == null) {
            System.out.println("No se encuentra el apartamento");
        } else {
            apartment.showInfo();
        }
        building.showFloorApartments(2);
    }
}