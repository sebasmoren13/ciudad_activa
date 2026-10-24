package com.example.ciudadActiva.Service.Impl;

import com.example.ciudadActiva.DTO.ReporteDTO;
import com.example.ciudadActiva.Entity.CategoriaIncidencia;
import com.example.ciudadActiva.Entity.Reporte;
import com.example.ciudadActiva.Entity.Usuario;
import com.example.ciudadActiva.Repository.CategoriaIncidenciaRepository;
import com.example.ciudadActiva.Repository.ReporteRepository;
import com.example.ciudadActiva.Repository.UsuarioRepository;
import com.example.ciudadActiva.Service.ReporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReporteServiceImpl implements ReporteService {

    @Autowired
    private ReporteRepository reporteRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private CategoriaIncidenciaRepository categoriaIncidenciaRepository;

    @Override
    public Reporte registrarReporte(ReporteDTO dto) {
        Usuario ciudadano = usuarioRepository.findById(dto.getCiudadanoId())
                .orElseThrow(() -> new RuntimeException("Ciudadano no encontrado con ID: " + dto.getCiudadanoId()));

        CategoriaIncidencia categoria = categoriaIncidenciaRepository.findById(dto.getCategoriaId())
                .orElseThrow(() -> new RuntimeException("Categoría no encontrada con ID: " + dto.getCategoriaId()));

        Reporte reporte = new Reporte();
        reporte.setTitulo(dto.getTitulo());
        reporte.setDescripcion(dto.getDescripcion());
        reporte.setUbicacion(dto.getUbicacion());
        reporte.setImagen(dto.getImagen());
        reporte.setPrioridad(dto.getPrioridad() != null ? dto.getPrioridad() : "MEDIA");
        reporte.setEstado("PENDIENTE");
        reporte.setCiudadano(ciudadano);
        reporte.setCategoriaIncidencia(categoria);

        return reporteRepository.save(reporte);
    }

    @Override
    public List<Reporte> listarTodos() {
        return reporteRepository.findAll();
    }

    @Override
    public List<Reporte> obtenerPorCiudadano(Long ciudadanoId) {
        return reporteRepository.findByCiudadano_Id(ciudadanoId);
    }

    @Override
    public Reporte validarReporte(Long id, String estado, String prioridad) {
        Reporte reporte = reporteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Reporte no encontrado con ID: " + id));

        reporte.setEstado(estado);
        if (prioridad != null && !prioridad.isEmpty()) {
            reporte.setPrioridad(prioridad);
        }
        return reporteRepository.save(reporte);
    }

    @Override
    public Reporte cerrarReporte(Long id) {
        Reporte reporte = reporteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Reporte no encontrado con ID: " + id));

        reporte.setEstado("CERRADO");
        return reporteRepository.save(reporte);
    }

    @Override
    public Reporte actualizar(Long id, Reporte reporteDetalles) {
        Reporte reporteExistente = reporteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Reporte no encontrado con el ID: " + id));

        reporteExistente.setTitulo(reporteDetalles.getTitulo());
        reporteExistente.setDescripcion(reporteDetalles.getDescripcion());
        reporteExistente.setUbicacion(reporteDetalles.getUbicacion());
        reporteExistente.setImagen(reporteDetalles.getImagen());
        reporteExistente.setPrioridad(reporteDetalles.getPrioridad());

        if (reporteDetalles.getCategoriaIncidencia() != null) {
            reporteExistente.setCategoriaIncidencia(reporteDetalles.getCategoriaIncidencia());
        }
        if (reporteDetalles.getCiudadano() != null) {
            reporteExistente.setCiudadano(reporteDetalles.getCiudadano());
        }

        return reporteRepository.save(reporteExistente);
    }
}
