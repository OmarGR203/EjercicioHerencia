package com.guzman.departamentos;

public class Direccion extends Departamento{
    String tipo;

    public Direccion() {
    }

    public Direccion(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
