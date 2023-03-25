package com.guzman.departamentos.subacademica;

import com.guzman.departamentos.Subdireccion;

public class Division extends Subdireccion{
    String nombreCarrera;
    int numSemestres;
    char    modalidad;

    public Division() {
    }

    public Division(String nombreCarrera, int numSemestres, char modalidad) {
        this.nombreCarrera = nombreCarrera;
        this.numSemestres = numSemestres;
        this.modalidad = modalidad;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public int getNumSemestres() {
        return numSemestres;
    }

    public void setNumSemestres(int numSemestres) {
        this.numSemestres = numSemestres;
    }

    public char getModalidad() { return modalidad;    }

    public void setModalidad(char modalidad) {this.modalidad = modalidad;}
}

