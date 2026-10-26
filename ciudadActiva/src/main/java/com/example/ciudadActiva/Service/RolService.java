package com.example.ciudadActiva.Service;

import com.example.ciudadActiva.Entity.Rol;

import java.util.List;
import java.util.Optional;

public interface RolService {
    Rol crearRol(Rol Rol);
    List<Rol>listarRoles();
    Optional<Rol>buscarPorNombre(String nombre);
}
