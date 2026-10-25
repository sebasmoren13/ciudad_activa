package com.example.ciudadActiva.Controller;

import com.example.ciudadActiva.DTO.AsignacionDTO;
import com.example.ciudadActiva.DTO.ReporteDTO;
import com.example.ciudadActiva.Entity.Reporte;
import com.example.ciudadActiva.Service.ReporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reportes")

public class ReporteController {

    @Autowired
    private ReporteService reporteService;

    @PostMapping
    public ResponseEntity<Reporte> registrarReporte(@RequestBody ReporteDTO dto){
        Reporte nuevoReporte = reporteService.registrarReporte(dto);
        return new ResponseEntity<>(nuevoReporte, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Reporte>> listarReporte(){
        List<Reporte> reportes = reporteService.listarTodos();
        return ResponseEntity.ok(reportes);
    }

    @GetMapping("/ciudadano/{id}")
    public ResponseEntity<List<Reporte>> obtenerPorCiudadano(@PathVariable Long id){
        List<Reporte> reportes = reporteService.obtenerPorCiudadano(id);
        return ResponseEntity.ok(reportes);
    }

    @PatchMapping("/{id}/validar")
    public ResponseEntity<Reporte> validarReporte(
            @PathVariable Long id,
            @RequestParam String estado,
            @RequestParam(required = false)String prioridad){
        Reporte reporteActualizado = reporteService.validarReporte(id, estado, prioridad);
        return ResponseEntity.ok(reporteActualizado);
    }

    @PatchMapping("/{id}/cerrar")
    public ResponseEntity<Reporte> cerrarReporte(@PathVariable Long id) {
        Reporte reporteCerrado = reporteService.cerrarReporte(id);
        return ResponseEntity.ok(reporteCerrado);
    }

    @PostMapping("/{id}/asignaciones")
    public ResponseEntity<Reporte> asignarResponsable(
            @PathVariable Long id,
            @RequestBody AsignacionDTO asignacionDTO) {
        Reporte reporteAsignado = reporteService.asignarResponsable(id, asignacionDTO);
        return ResponseEntity.ok(reporteAsignado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Reporte> actualizarReporte(@PathVariable Long id, @RequestBody Reporte reporteDetalles) {
        Reporte reporteActualizado = reporteService.actualizar(id, reporteDetalles);
        return ResponseEntity.ok(reporteActualizado);
    }

}
