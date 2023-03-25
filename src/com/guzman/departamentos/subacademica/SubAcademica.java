package com.guzman.departamentos.subacademica;

import com.guzman.departamentos.Subdireccion;

public class SubAcademica extends Subdireccion{
    String nombreCarrera;
    int numSemestres;

    public SubAcademica() {
    }

    public SubAcademica(String nombreCarrera, int numSemestres) {
        this.nombreCarrera = nombreCarrera;
        this.numSemestres = numSemestres;
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
}

