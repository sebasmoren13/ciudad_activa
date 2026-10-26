package com.example.ciudadActiva.Service.Impl;

import com.example.ciudadActiva.Entity.Evidencia;
import com.example.ciudadActiva.Repository.EvidenciaRepository;
import com.example.ciudadActiva.Service.EvidenciaService;
import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EvidenciaServiceImpl implements EvidenciaService {

    @Autowired
    private EvidenciaRepository evidenciaRepository;

    @Override
    public Evidencia subirEvidencia(Evidencia evidencia) {
        return evidenciaRepository.save(evidencia) ;
    }

    @Override
    public List<Evidencia> listarPorReporte(Long reporteId) {
        return evidenciaRepository.findByReporte_Id(reporteId);
    }
}
