package com.example.ciudadActiva.Service.Impl;

import com.example.ciudadActiva.Entity.Seguimiento;
import com.example.ciudadActiva.Repository.SeguimientoRepository;
import com.example.ciudadActiva.Service.SeguimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeguimientoServiceImpl implements SeguimientoService {

    @Autowired
    private SeguimientoRepository seguimientoRepository;

    @Override
    public Seguimiento registarSeguimiento(Seguimiento seguimiento) {
        return seguimientoRepository.save(seguimiento);
    }
    @Override
    public List<Seguimiento> listarPorReporte(Long reporteId) {
        return seguimientoRepository.findByReporte_Id(reporteId);
    }
}
