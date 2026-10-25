package com.example.ciudadActiva.DTO;

public class AsignacionDTO {
    private Long operadorId;
    private String observacion;

    public AsignacionDTO(){}

    public AsignacionDTO(Long operadorId, String observacion) {
        this.operadorId = operadorId;
        this.observacion = observacion;
    }

    public Long getOperadorId() {
        return operadorId;
    }

    public void setOperadorId(Long operadorId) {
        this.operadorId = operadorId;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}
