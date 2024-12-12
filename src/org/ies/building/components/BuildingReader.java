package org.ies.building.components;

import org.ies.building.model.Apartment;
import org.ies.building.model.Building;
import org.ies.building.model.Owner;

import java.util.Scanner;

public class BuildingReader {
    private final Scanner scanner;
    private final ApartmentReader apartmentReader;

    public BuildingReader(Scanner scanner, ApartmentReader apartmentReader) {
        this.scanner = scanner;
        this.apartmentReader = apartmentReader;
    }

    public Building read () {
        System.out.println("Ingrese su direccion:");
        String direccion = scanner.nextLine();
        System.out.println("Ingrese su municipio:");
        String municipio = scanner.nextLine();
        System.out.println("¿Cuantos apartamentos hay?:");
        int size = scanner.nextInt();
        scanner.nextLine();
        Apartment[] apartments = new Apartment[size];
        for (int  i = 0; i < apartments.length; i++) {
            apartments[i] = apartmentReader.read();
        }


        return new Building(
                direccion,
                municipio,
                apartments
        );
    }
}
