package org.ies.building.model;

import java.util.Objects;

public class Owner {
    private String nif;
    private String nombre;
    private String apellidos;

    public Owner(String nif, String nombre, String apellidos) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public void showInfo() {
        System.out.println("La informacion del propietario es:" + getNif() + getNombre() + getApellidos());
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owner owner = (Owner) o;
        return Objects.equals(nif, owner.nif) && Objects.equals(nombre, owner.nombre) && Objects.equals(apellidos, owner.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, nombre, apellidos);
    }

    @Override
    public String toString() {
        return "Owner{" +
                "nif='" + nif + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }
}
