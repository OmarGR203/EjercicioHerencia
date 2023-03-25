package com.guzman.departamentos.subacademica;

public class IngQuimica extends SubAcademica{
    String modalidad;

    public IngQuimica() {
    }

    public IngQuimica(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }
}
