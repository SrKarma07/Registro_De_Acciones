import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Accion} from "../Modelo/Accion";

@Injectable({
  providedIn: 'root'
})
export class ServicioService {

  constructor(private http: HttpClient) {
  }

  Url = 'http://localhost:8082/registro_acciones/acciones'

  getAcciones() {
    return this.http.get<Accion[]>(this.Url);
  }

  createAccion(accion: Accion) {
    return this.http.post<Accion>(this.Url, accion);
  }

  getAccionId(id: number) {
    return this.http.get<Accion>(`${this.Url}/${id}`);
  }

  updateAccion(accion: Accion) {
    return this.http.put<Accion>(this.Url + "/" + accion.idAccion, accion);
  }

  deleteAccion(accion: Accion) {
    return this.http.delete<Accion>(this.Url + "/" + accion.idAccion);
  }


}
