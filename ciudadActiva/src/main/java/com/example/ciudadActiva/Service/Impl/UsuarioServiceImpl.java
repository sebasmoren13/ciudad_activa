package com.example.ciudadActiva.Service.Impl;

import com.example.ciudadActiva.Entity.Rol;
import com.example.ciudadActiva.Entity.Usuario;
import com.example.ciudadActiva.Repository.RolRepository;
import com.example.ciudadActiva.Repository.UsuarioRepository;
import com.example.ciudadActiva.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private  RolRepository rolRepository;

    @Override
    public Usuario registrarUsuario(Usuario usuario, Long rolId) {
        Rol rol = rolRepository.findById(rolId)
                .orElseThrow(() -> new RuntimeException("Rol no encontrado con ID: " + rolId));
        usuario.setRol(rol);
        return usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> listarTodos() {
        return usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> buscarPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public Optional<Usuario> buscarPorCorreo(String correo) {
        return usuarioRepository.findByCorreo(correo);
    }
}

