package com.example.ciudadActiva.Service.Impl;

import com.example.ciudadActiva.Entity.Comentario;
import com.example.ciudadActiva.Repository.ComentarioRepository;
import com.example.ciudadActiva.Service.ComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ComentarioServiceImpl implements ComentarioService {
    @Autowired
    private ComentarioRepository comentarioRepository;

    @Override
    public Comentario agregarComentario(Comentario comentario) {
        return comentarioRepository.save(comentario);
    }

    @Override
    public List<Comentario> listarPorReporte(Long reporteId) {
        return comentarioRepository.findByReporte_Id(reporteId);
    }
}
