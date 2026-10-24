package com.example.ciudadActiva.Service;

import com.example.ciudadActiva.Entity.Comentario;

import java.util.List;

public interface ComentarioService {
    Comentario agregarComentario(Comentario comentario);
    List<Comentario> listarPorReporte(Long reporteId);
}
