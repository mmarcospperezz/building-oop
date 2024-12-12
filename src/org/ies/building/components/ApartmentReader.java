package org.ies.building.components;

import org.ies.building.model.Apartment;
import org.ies.building.model.Owner;

import java.util.Scanner;

public class ApartmentReader {
    private final Scanner scanner;
    private final OwnerReader ownerReader;

    public ApartmentReader(Scanner scanner, OwnerReader ownerReader) {
        this.scanner = scanner;
        this.ownerReader = ownerReader;
    }

    public Apartment read () {
        System.out.println("Ingrese su planta:");
         int planta = scanner.nextInt();
        System.out.println("Ingrese su puerta:");
        String puerta = scanner.nextLine();
        System.out.println("Ingrese los propietarios:");
        int size = scanner.nextInt();
        scanner.nextLine();
        Owner[] owners = new Owner[size];
        for (int  i = 0; i < owners.length; i++) {
            owners[i] = ownerReader.read();
        }


        return new Apartment(
                planta,
                puerta,
                owners
        );
    }
}
