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
}

