package com.example.ciudadActiva.Service.Impl;

import com.example.ciudadActiva.Entity.CategoriaIncidencia;
import com.example.ciudadActiva.Repository.CategoriaIncidenciaRepository;
import com.example.ciudadActiva.Service.CategoriaIncidenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoriaIncidenciaServiceImpl implements CategoriaIncidenciaService {

    @Autowired
    private CategoriaIncidenciaRepository categoriaIncidenciaRepository;

    @Override
    public CategoriaIncidencia crearcategoria(CategoriaIncidencia categoria) {
        return categoriaIncidenciaRepository.save(categoria);
    }

    @Override
    public List<CategoriaIncidencia> listarTodas() {
        return categoriaIncidenciaRepository.findAll();
    }
}
