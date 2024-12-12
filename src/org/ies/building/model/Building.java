package org.ies.building.model;

import java.util.Arrays;
import java.util.Objects;

public class Building {
    private String direccion;
    private String municipio;
    private Apartment[] apartments;

    public Building(String direccion, String municipio, Apartment[] apartments) {
        this.direccion = direccion;
        this.municipio = municipio;
        this.apartments = apartments;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public Apartment[] getApartments() {
        return apartments;
    }

    public void setApartments(Apartment[] apartments) {
        this.apartments = apartments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return Objects.equals(direccion, building.direccion) && Objects.equals(municipio, building.municipio) && Objects.deepEquals(apartments, building.apartments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direccion, municipio, Arrays.hashCode(apartments));
    }

    @Override
    public String toString() {
        return "Building{" +
                "direccion='" + direccion + '\'' +
                ", municipio='" + municipio + '\'' +
                ", apartments=" + Arrays.toString(apartments) +
                '}';
    }
}
