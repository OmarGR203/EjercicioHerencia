package com.guzman.departamentos.planeacion;

public class Extraescolares extends SubPlaneacionVinculacion{
    String nombreExtraescolar, rolExtraescolar;

    public Extraescolares() {
    }

    public Extraescolares(String nombreExtraescolar, String rolExtraescolar) {
        this.nombreExtraescolar = nombreExtraescolar;
        this.rolExtraescolar = rolExtraescolar;
    }


    public String getNombreExtraescolar() {
        return nombreExtraescolar;
    }

    public void setNombreExtraescolar(String nombreExtraescolar) {
        this.nombreExtraescolar = nombreExtraescolar;
    }

    public String getRolExtraescolar() {
        return rolExtraescolar;
    }

    public void setRolExtraescolar(String rolExtraescolar) {
        this.rolExtraescolar = rolExtraescolar;
    }
}
