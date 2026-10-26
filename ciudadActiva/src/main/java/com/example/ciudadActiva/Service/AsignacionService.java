package com.example.ciudadActiva.Service;

import com.example.ciudadActiva.Entity.Asignacion;

import java.util.List;

public interface AsignacionService {
    Asignacion crearAsignacion(Asignacion asignacion);
        List<Asignacion> listarPorReporte(Long reporteId);
        List<Asignacion> listarPorOperador(Long operadorId);
}
