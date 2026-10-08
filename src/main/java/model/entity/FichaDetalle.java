package model.entity;

import jakarta.persistence.OneToOne;

public class FichaDetalle {
    private int fichaID;
    private String descripcion;
    private String raza;
    private String alineamiento;
    private String deidad;

    @OneToOne
    private Personaje personaje;

    public int getFichaID() {
        return fichaID;
    }

    public void setFichaID(int fichaID) {
        this.fichaID = fichaID;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getAlineamiento() {
        return alineamiento;
    }

    public void setAlineamiento(String alineamiento) {
        this.alineamiento = alineamiento;
    }

    public String getDeidad() {
        return deidad;
    }

    public void setDeidad(String deidad) {
        this.deidad = deidad;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }
}
