package org.ies.building.model;

import java.util.Arrays;
import java.util.Objects;

public class Apartment {
    private int planta;
    private String puerta;
    private Owner[] owners;

    public Apartment(int planta, String puerta, Owner[] owners) {
        this.planta = planta;
        this.puerta = puerta;
        this.owners = owners;
    }

    public void showInfo() {
        System.out.println("La informacion del apartamento es:" + getPlanta() + getPuerta() + getOwners());
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    public Owner[] getOwners() {
        return owners;
    }

    public void setOwners(Owner[] owners) {
        this.owners = owners;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apartment apartment = (Apartment) o;
        return planta == apartment.planta && Objects.equals(puerta, apartment.puerta) && Objects.deepEquals(owners, apartment.owners);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planta, puerta, Arrays.hashCode(owners));
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "planta=" + planta +
                ", puerta='" + puerta + '\'' +
                ", owners=" + Arrays.toString(owners) +
                '}';
    }
}
