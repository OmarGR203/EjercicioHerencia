package com.guzman.departamentos.planeacion;

public class Extraescolares extends SubPlaneacionVinculacion{
    String nombreExtraescolar;
    char rolExtraescolar;

    public Extraescolares() {
    }

    public Extraescolares(String nombreExtraescolar, char rolExtraescolar) {
        this.nombreExtraescolar = nombreExtraescolar;
        this.rolExtraescolar = rolExtraescolar;
    }


    public String getNombreExtraescolar() {
        return nombreExtraescolar;
    }

    public void setNombreExtraescolar(String nombreExtraescolar) {
        this.nombreExtraescolar = nombreExtraescolar;
    }

    public char getRolExtraescolar() {
        return rolExtraescolar;
    }

    public void setRolExtraescolar(char rolExtraescolar) {
        this.rolExtraescolar = rolExtraescolar;
    }
}
