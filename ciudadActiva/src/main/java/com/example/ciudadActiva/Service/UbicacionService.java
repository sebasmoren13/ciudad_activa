package com.example.ciudadActiva.Service;

import com.example.ciudadActiva.Entity.Ubicacion;

import java.util.List;

public interface UbicacionService {
    Ubicacion guardarUbicacion(Ubicacion ubicacion);
    List<Ubicacion> listarUbicaciones();
}
