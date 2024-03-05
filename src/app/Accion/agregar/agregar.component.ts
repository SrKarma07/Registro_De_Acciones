import {Component, OnInit} from '@angular/core';
import {Router} from "@angular/router";
import {ServicioService} from "../../Servicio/servicio.service";
import {Accion} from "../../Modelo/Accion";

@Component({
  selector: 'app-agregar',
  templateUrl: './agregar.component.html',
  styleUrl: './agregar.component.css'
})
export class AgregarComponent implements OnInit {

  constructor(private router: Router, private servicio: ServicioService) {
  }

  ngOnInit() {
  }

  accion: Accion = new Accion();

  Guardar() {
    this.servicio.createAccion(this.accion).subscribe(data => {
      alert("Se agrego con exito...!");
      this.router.navigate(["listar"]);
    })
  }

}
