package com.example.ciudadActiva.Service;

import com.example.ciudadActiva.Entity.CategoriaIncidencia;

import java.util.List;

public interface CategoriaIncidenciaService {
    CategoriaIncidencia crearcategoria(CategoriaIncidencia categoriaIncidencia);
    List<CategoriaIncidencia> listarTodas();
}
