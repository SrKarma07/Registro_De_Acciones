import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';

import {ListarComponent} from "./Accion/listar/listar.component";
import {AgregarComponent} from "./Accion/agregar/agregar.component";
import {EditarComponent} from "./Accion/editar/editar.component";

const routes: Routes = [

  {path: '', redirectTo: 'listar', pathMatch: 'full'},

  {path: 'listar', component: ListarComponent},
  {path: 'agregar', component: AgregarComponent},
  {path: 'editar', component: EditarComponent},

  {path: '**', redirectTo: 'listar', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
