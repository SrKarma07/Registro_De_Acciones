
package com.acciones.registro_acciones;

import com.acciones.registro_acciones.model.Accion;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccionRepositorio extends JpaRepository<Accion, Integer>{
    List<Accion> findAll();
    Optional<Accion> findById(Integer idAccion);
    Accion save(Accion p);
    void delete(Accion p);
}
