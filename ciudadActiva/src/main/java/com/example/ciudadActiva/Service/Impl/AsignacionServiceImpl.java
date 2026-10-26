package com.example.ciudadActiva.Service.Impl;

import com.example.ciudadActiva.Entity.Asignacion;
import com.example.ciudadActiva.Repository.AsignacionRepository;
import com.example.ciudadActiva.Service.AsignacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AsignacionServiceImpl implements AsignacionService {

    @Autowired
    private AsignacionRepository asignacionRepository;

    @Override
    public Asignacion crearAsignacion(Asignacion asignacion) {
        return asignacionRepository.save(asignacion);
    }

    @Override
    public List<Asignacion> listarPorReporte(Long reporteId) {
        return asignacionRepository.findByReporte_Id(reporteId);
    }

    @Override
    public List<Asignacion> listarPorOperador(Long operadorId) {
        return asignacionRepository.findByOperadorId(operadorId);
    }
}
