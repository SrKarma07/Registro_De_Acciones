### Diagrama de Flujo

El diagrama de flujo se centra en el proceso CRUD (Crear, Leer, Actualizar, Eliminar) para el registro de acciones.

```mermaid
graph TD;
    A[Inicio] --> B[Ver Lista de Acciones];
    B --> C[Seleccionar Acción];
    C -->|Crear| D[Formulario de Nueva Acción];
    D --> E[Guardar Acción];
    E --> B;
    C -->|Ver| F[Detalle de Acción];
    F --> B;
    C -->|Editar| G[Formulario de Edición];
    G --> E;
    C -->|Eliminar| H[Confirmar Eliminación];
    H -->|Sí| I[Eliminar Acción];
    I --> B;
    H -->|No| B;
```

Este diagrama representa las opciones de navegación y las acciones que un usuario puede realizar en la aplicación web para manejar el registro de acciones.
