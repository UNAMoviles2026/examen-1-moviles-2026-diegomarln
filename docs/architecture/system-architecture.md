# Arquitectura del Sistema

## 1. Tipo de aplicación

La solución propuesta es una aplicación móvil nativa para Android, desarrollada con Kotlin y Jetpack Compose.

Se selecciona una aplicación nativa porque el sistema está orientado a usuarios que necesitan consultar, explorar y reservar espacios de coworking desde un dispositivo móvil. Este tipo de aplicación permite una experiencia más fluida en Android, mejor integración con componentes propios del sistema y una base adecuada para futuras funcionalidades como geolocalización, notificaciones, autenticación y pagos.

Para esta prueba de concepto, la aplicación utiliza datos simulados y no implementa conexión con backend, persistencia de datos ni lógica de negocio real.

## 2. Patrón de arquitectura seleccionado

El patrón de arquitectura seleccionado es MVVM, compuesto por Model, View y ViewModel.

Este patrón se selecciona porque permite separar la representación de datos, la interfaz de usuario y el manejo del estado de la aplicación. Aunque en esta prueba de concepto no se implementa una capa ViewModel completa, la estructura propuesta permite que el proyecto pueda evolucionar de forma ordenada si en el futuro se agregan datos reales, backend y lógica de reservaciones.

En el contexto de esta aplicación:

- Model representa los datos de los espacios de coworking.
- View corresponde a las pantallas y componentes creados con Jetpack Compose.
- ViewModel sería responsable de administrar el estado de las pantallas y coordinar las acciones del usuario en una versión completa del sistema.

## 3. Justificación técnica basada en el problema

El problema plantea una aplicación para gestionar espacios de coworking, donde el usuario debe poder visualizar espacios disponibles, consultar información relevante, navegar a una vista de detalle y realizar reservaciones.

MVVM es adecuado para este caso porque permite mantener separada la interfaz de la lógica del sistema. Esto evita que las pantallas de Jetpack Compose acumulen responsabilidades que no les corresponden, como validaciones, manejo de estado complejo o comunicación con servicios externos.

Además, este patrón facilita el mantenimiento y crecimiento del sistema. Si en el futuro se agrega conexión con backend, autenticación, pagos o consulta real de disponibilidad, la aplicación podrá integrar esas funcionalidades sin desorganizar las pantallas existentes.

Jetpack Compose también es adecuado para la prueba de concepto porque permite construir una interfaz modular mediante componentes reutilizables, como tarjetas de espacios, filas de información, botones y barras de navegación.

## 4. Diagrama de arquitectura del sistema

```mermaid
flowchart TD
    Usuario[Usuario] --> App[Aplicación Android Nativa]

    App --> UI[Capa de UI - Jetpack Compose]
    UI --> PantallaListado[Pantalla de listado de espacios]
    UI --> PantallaDetalle[Pantalla de detalle del espacio]
    UI --> Componentes[Componentes reutilizables]

    PantallaListado --> DatosSimulados[Datos simulados]
    PantallaDetalle --> DatosSimulados

    UI -. evolución futura .-> ViewModel[Capa ViewModel]
    ViewModel -. evolución futura .-> Repository[Capa Repository]
    Repository -. evolución futura .-> Backend[Backend conceptual]
    Backend -. evolución futura .-> BaseDatos[Base de datos conceptual]
````

## 5. Explicación del flujo general del sistema

El flujo general de la aplicación inicia cuando el usuario abre la app y visualiza un listado de espacios de coworking disponibles. Cada espacio muestra información básica como nombre, imagen, descripción corta, ubicación, capacidad, precio por hora y disponibilidad.

Cuando el usuario selecciona un espacio, la aplicación navega hacia una pantalla de detalle. En esta vista se muestra información ampliada del espacio seleccionado y se presenta una acción para realizar una reservación.

En la prueba de concepto, la información se obtiene desde datos simulados definidos directamente en el código. La acción de reservar también es simulada, ya que el alcance del examen no requiere backend, persistencia ni lógica de negocio real.

En una versión completa, el flujo sería el siguiente:

1. El usuario interactúa con la interfaz móvil.
2. La pantalla envía la acción al ViewModel.
3. El ViewModel coordina la operación con un Repository.
4. El Repository consulta o envía datos al backend.
5. El backend procesa la solicitud y consulta la base de datos.
6. La respuesta regresa a la aplicación.
7. La interfaz se actualiza según el resultado obtenido.