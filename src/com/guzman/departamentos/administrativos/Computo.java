package com.guzman.departamentos.administrativos;

public class Computo extends SubAdministrativa{
    int numAulas, numEquipos;

    public Computo() {
    }

    public Computo(int numAulas, int numEquipos) {
        this.numAulas = numAulas;
        this.numEquipos = numEquipos;
    }

    public int getNumAulas() {
        return numAulas;
    }

    public void setNumAulas(int numAulas) {
        this.numAulas = numAulas;
    }

    public int getNumEquipos() {
        return numEquipos;
    }

    public void setNumEquipos(int numEquipos) {
        this.numEquipos = numEquipos;
    }
}

