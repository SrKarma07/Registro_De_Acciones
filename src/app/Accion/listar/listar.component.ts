import {Component, OnInit} from '@angular/core';
import {Router} from "@angular/router";
import {ServicioService} from "../../Servicio/servicio.service";
import {Accion} from "../../Modelo/Accion";

@Component({
  selector: 'app-listar',
  templateUrl: './listar.component.html',
  styleUrl: './listar.component.css'
})
export class ListarComponent implements OnInit {

  acciones: Accion[];

  constructor(private service: ServicioService, private router: Router) {
  }

  ngOnInit() {
    this.service.getAcciones()
      .subscribe(data => {
        this.acciones = data;
      });
  }

  Editar(accion: Accion): void {
    localStorage.setItem("id", accion.idAccion.toString());
    this.router.navigate(["editar"]);
  }

  Eliminar(accion: Accion) {
    this.service.deleteAccion(accion)
      .subscribe(data => {
        this.acciones = this.acciones.filter(a => a !== accion);
        alert("Acción eliminada...");
      })
  }
}
