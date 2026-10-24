package com.example.ciudadActiva.Repository;

import com.example.ciudadActiva.Entity.Evidencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EvidenciaRepository extends JpaRepository<Evidencia, Long> {
    List<Evidencia> findByReporte_Id(Long reporteId);
}
