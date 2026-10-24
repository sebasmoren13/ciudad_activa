package com.example.ciudadActiva.Controller;

import com.example.ciudadActiva.Entity.Seguimiento;
import com.example.ciudadActiva.Service.SeguimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/seguimientos")

public class SeguimientoController {
    @Autowired
    private SeguimientoService seguimientoService;

    @PostMapping
    public ResponseEntity<Seguimiento> registarSeguimiento(@RequestBody Seguimiento seguimiento){
       Seguimiento nuevoSeguimiento = seguimientoService.registarSeguimiento(seguimiento);
       return new ResponseEntity<>(nuevoSeguimiento, HttpStatus.CREATED);
    }

    @GetMapping("/reporte/{reporteId}")
    public ResponseEntity<List<Seguimiento>> listarPorReporte(@PathVariable Long reporteId){
        List<Seguimiento> seguimientos = seguimientoService.listarPorReporte(reporteId);
        return  ResponseEntity.ok(seguimientos);
    }
}
