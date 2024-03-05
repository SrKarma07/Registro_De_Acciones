
package com.acciones.registro_acciones;

import com.acciones.registro_acciones.model.Accion;
import java.util.List;

public interface AccionServicio {
    List<Accion>listar();
    Accion listarId(int idAccion);
    Accion agregar(Accion p);
    Accion editar(Accion p);
    Accion eliminar(int idAccion);
}
