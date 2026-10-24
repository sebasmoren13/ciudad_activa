package com.example.ciudadActiva.Service;

import com.example.ciudadActiva.Entity.Seguimiento;

import java.util.List;

public interface SeguimientoService {
    Seguimiento registarSeguimiento(Seguimiento seguimiento);
    List<Seguimiento> listarPorReporte(Long reporteId);
}
