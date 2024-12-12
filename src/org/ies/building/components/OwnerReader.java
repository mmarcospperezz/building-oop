package org.ies.building.components;

import org.ies.building.model.Owner;

import java.util.Scanner;

public class OwnerReader {
    private final Scanner scanner;

    public OwnerReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Owner read() {
        System.out.println("Ingrese su NIF:");
        String nif = scanner.nextLine();
        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su apellidos:");
        String apellidos = scanner.nextLine();

        return new Owner(
                nif,
                nombre,
                apellidos
        );
    }
}
