package com.example.ciudadActiva.DTO;

public class SeguimientoDTO {
    private String nuevoEstado;
    private String observaciones;
    private String evidencia;
    public SeguimientoDTO() {}

    public SeguimientoDTO(String nuevoEstado, String observaciones, String evidencia) {
        this.nuevoEstado = nuevoEstado;
        this.observaciones = observaciones;
        this.evidencia = evidencia;
    }

    public String getNuevoEstado() {
        return nuevoEstado;
    }

    public void setNuevoEstado(String nuevoEstado) {
        this.nuevoEstado = nuevoEstado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEvidencia() {
        return evidencia;
    }

    public void setEvidencia(String urlEvidencia) {
        this.evidencia = urlEvidencia;
    }
}
