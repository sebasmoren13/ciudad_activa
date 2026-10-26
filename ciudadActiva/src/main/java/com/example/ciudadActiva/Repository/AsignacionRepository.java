package com.example.ciudadActiva.Repository;

import com.example.ciudadActiva.Entity.Asignacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AsignacionRepository extends JpaRepository<Asignacion, Long> {
    List<Asignacion> findByReporte_Id(Long reproteId);
    List<Asignacion> findByOperadorId(Long operadorId);
}
