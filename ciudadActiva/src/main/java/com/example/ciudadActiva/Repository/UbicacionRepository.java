package com.example.ciudadActiva.Repository;

import com.example.ciudadActiva.Entity.Ubicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UbicacionRepository extends JpaRepository<Ubicacion, Long> {
}
