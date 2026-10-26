package com.example.ciudadActiva.Service;

import com.example.ciudadActiva.Entity.Evidencia;

import java.util.List;

public interface EvidenciaService {
    Evidencia subirEvidencia(Evidencia evidencia);
    List<Evidencia> listarPorReporte(Long reporteId);
}
