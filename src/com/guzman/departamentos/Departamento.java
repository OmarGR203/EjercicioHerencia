package com.guzman.departamentos;

public class Departamento {
    String nombre, horario, nombrePuesto, ubicacion, email, numTelefonico;
    int numEmpleados;

    public Departamento() {
    }

    public Departamento(String nombre, String horario, String nombrePuesto, String ubicacion, int numEmpleados, String email, String numTelefonico) {
        this.nombre = nombre;
        this.horario = horario;
        this.nombrePuesto = nombrePuesto;
        this.ubicacion = ubicacion;
        this.numEmpleados = numEmpleados;
        this.email = email;
        this.numTelefonico = numTelefonico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNombrePuesto() {
        return nombrePuesto;
    }

    public void setNombrePuesto(String nombrePuesto) {
        this.nombrePuesto = nombrePuesto;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getNumEmpleados() {
        return numEmpleados;
    }

    public void setNumEmpleados(int numEmpleados) {
        this.numEmpleados = numEmpleados;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumTelefonico() {
        return numTelefonico;
    }

    public void setNumTelefonico(String numTelefonico) {
        this.numTelefonico = numTelefonico;
    }
}



