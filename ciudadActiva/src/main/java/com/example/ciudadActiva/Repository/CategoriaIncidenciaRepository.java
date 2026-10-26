package com.example.ciudadActiva.Repository;

import com.example.ciudadActiva.Entity.CategoriaIncidencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaIncidenciaRepository extends JpaRepository<CategoriaIncidencia, Long> {
}
