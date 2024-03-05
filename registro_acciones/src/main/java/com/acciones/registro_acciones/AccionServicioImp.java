
package com.acciones.registro_acciones;

import com.acciones.registro_acciones.model.Accion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccionServicioImp implements AccionServicio{
    @Autowired
    private AccionRepositorio repositorio;

    @Override
    public List<Accion> listar() {
        return (List<Accion>) repositorio.findAll();
    }

    @Override
    public Accion listarId(int idAccion) {
        return repositorio.findById(idAccion).orElseThrow(() -> new RuntimeException("Accion no encontrada"));
    }

    @Override
    public Accion agregar(Accion p) {
        return repositorio.save(p);
    }

    @Override
    public Accion editar(Accion p) {
        return repositorio.save(p);
    }

    @Override
    public Accion eliminar(int id) {
        return repositorio.findById(id).map(p -> {
            repositorio.delete(p);
        return p;
    }).orElseThrow(() -> new RuntimeException("Accion no encontrada con id: " + id));
}
    
}
