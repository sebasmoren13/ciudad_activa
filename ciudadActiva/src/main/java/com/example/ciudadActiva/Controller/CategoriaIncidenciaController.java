package com.example.ciudadActiva.Controller;

import com.example.ciudadActiva.Entity.CategoriaIncidencia;
import com.example.ciudadActiva.Repository.CategoriaIncidenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
@CrossOrigin(origins = "*")
public class CategoriaIncidenciaController {

    @Autowired
    private CategoriaIncidenciaRepository categoriaRepository;

    @PostMapping
    public ResponseEntity<CategoriaIncidencia> crearCategoria(@RequestBody CategoriaIncidencia categoria) {
        CategoriaIncidencia nuevaCategoria = categoriaRepository.save(categoria);
        return new ResponseEntity<>(nuevaCategoria, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<CategoriaIncidencia>> listarCategorias() {
        return ResponseEntity.ok(categoriaRepository.findAll());
    }
}
