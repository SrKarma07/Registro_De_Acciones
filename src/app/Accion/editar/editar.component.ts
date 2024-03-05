import {Component, OnInit} from '@angular/core';
import {ServicioService} from "../../Servicio/servicio.service";
import {Router} from "@angular/router";
import {Accion} from "../../Modelo/Accion";

@Component({
  selector: 'app-editar',
  templateUrl: './editar.component.html',
  styleUrl: './editar.component.css'
})
export class EditarComponent implements OnInit {

  accion: Accion = new Accion();

  constructor(private router: Router, private service: ServicioService) {
  }

  ngOnInit() {
    this.Editar();
  }

  Editar() {
    let id = localStorage.getItem("id");
    console.log("ID from localStorage:", id);

    if (id) {
      this.service.getAccionId(+id)
        .subscribe(data => {
          this.accion = data;
        });
    } else {
      console.error("No ID found in localStorage");
    }


    this.service.getAccionId(+"id")
      .subscribe(data => {
        this.accion = data;
      })

  }

  Actualizar() {
    this.service.updateAccion(this.accion)
      .subscribe(data => {
        this.accion = data;
        alert("Se actualizó con éxito");
        this.router.navigate(["listar"]);
      })
  }
}
