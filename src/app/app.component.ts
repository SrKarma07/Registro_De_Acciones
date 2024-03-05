import {Component} from '@angular/core';
import {Router} from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Acciones1';

  constructor(private router: Router) {
  }

  Listar() {
    this.router.navigate(["listar"]);
  }

  Agregar() {
    this.router.navigate(["agregar"]);
  }
}
