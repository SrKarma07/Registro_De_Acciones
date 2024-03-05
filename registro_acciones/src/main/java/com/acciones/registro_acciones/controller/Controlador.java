
package com.acciones.registro_acciones.controller;
import com.acciones.registro_acciones.AccionServicio;
import com.acciones.registro_acciones.model.Accion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/acciones"})
public class Controlador {
    
    @Autowired
    AccionServicio servicio;
    
    @GetMapping
    public List<Accion>listar(){
        return servicio.listar();
    }
    
    @PostMapping
    public Accion agregar(@RequestBody Accion p){
    Accion accionCreada = servicio.agregar(p);
        return accionCreada;
}

    @GetMapping (path = {"/{id}"})
    public Accion listarId(@PathVariable("id")int id){
        return servicio.listarId(id);
    }
    
    @PutMapping (path = {"/{id}"})
    public Accion editar(@RequestBody Accion p,@PathVariable("id")int id){
        p.setIdAccion(id);
        return servicio.editar(p);
    }
    
    @DeleteMapping (path = {"/{id}"})
    public Accion delete(@PathVariable("id")int id){
        return servicio.eliminar(id);
    }
}
