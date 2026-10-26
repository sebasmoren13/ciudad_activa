package com.example.ciudadActiva.Service;

import com.example.ciudadActiva.DTO.AsignacionDTO;
import com.example.ciudadActiva.DTO.ReporteDTO;
import com.example.ciudadActiva.Entity.Reporte;
import java.util.List;

public interface ReporteService {
    Reporte registrarReporte(ReporteDTO dto);
    List<Reporte> listarTodos();
    List<Reporte> obtenerPorCiudadano(Long ciudadanoId);

    Reporte validarReporte(Long id,String estado, String prioridad);
    Reporte cerrarReporte(Long id);
    Reporte actualizar(Long id, Reporte reporteDetalles);
    Reporte asignarResponsable(Long id, AsignacionDTO asignacionDTO);
}


