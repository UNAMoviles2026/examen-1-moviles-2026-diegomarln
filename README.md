# Examen 1 - Diseño y Programación de Plataformas Móviles

## Descripción del proyecto

Este proyecto corresponde al Examen I del curso Diseño y Programación de Plataformas Móviles.

La aplicación desarrollada es una prueba de concepto móvil para la gestión de espacios de coworking. Permite visualizar espacios disponibles, consultar información relevante de cada espacio, navegar hacia una pantalla de detalle y simular una reservación.

La implementación se realizó con Android nativo, Kotlin y Jetpack Compose, utilizando datos simulados definidos directamente en el código.

## Funcionalidades implementadas

- Listado de espacios de coworking disponibles.
- Visualización de información básica por espacio:
  - Nombre.
  - Imagen local del espacio de coworking.
  - Descripción.
  - Ubicación.
  - Capacidad.
  - Precio por hora.
  - Disponibilidad.
- Pantalla de detalle de un espacio seleccionado.
- Navegación básica entre listado y detalle.
- Barra inferior de navegación visible en ambas pantallas.
- Botón para simular una reservación.
- Retroalimentación visual mediante Snackbar.
- Componentes reutilizables con Jetpack Compose.

## Tecnologías utilizadas

- Android Studio.
- Kotlin.
- Jetpack Compose.
- Material 3.
- Navigation Compose.
- Gradle.

## Estructura del repositorio

```text
/app
  Proyecto Android con Jetpack Compose.

/docs
  /architecture
    Documentación de arquitectura del sistema.

  /backend
    Diseño conceptual del backend.

  /api
    Contratos de API propuestos.

  /ui
    Documentación del diseño de interfaz.

  /decisions
    Decisiones técnicas, integraciones recomendadas y mejoras de UI.

README.md
```

## Estructura principal del código

```text
app/src/main/java/com/moviles/examenmoviles
  /data
    CoworkingSpace.kt
    MockCoworkingSpaces.kt

  /navigation
    AppDestinations.kt
    AppNavHost.kt

  /ui
    /components
      SpaceAvailabilityBadge.kt
      SpaceCard.kt
      SpaceImage.kt
      SpaceInfoRow.kt

    /screens/spaces
      SpacesListScreen.kt
      SpaceDetailScreen.kt

    /theme
      Color.kt
      Theme.kt
      Type.kt

  MainActivity.kt
```

## Cómo ejecutar el proyecto

1. Clonar el repositorio.
2. Abrir el proyecto en Android Studio.
3. Esperar la sincronización de Gradle.
4. Ejecutar la aplicación en un emulador o dispositivo Android.
5. Verificar el listado de espacios.
6. Seleccionar un espacio para abrir el detalle.
7. Presionar el botón `Reservar espacio` para simular una reservación.

## Validación técnica

El proyecto fue validado ejecutando:

```powershell
.\gradlew.bat assembleDebug
```

Resultado esperado:

```text
BUILD SUCCESSFUL
```

## Alcance de la prueba de concepto

Esta prueba de concepto no incluye:

- Conexión con backend real.
- Persistencia de datos.
- Lógica de negocio real.
- Autenticación.
- Pagos.
- Reservaciones persistentes.

Estos elementos se describen como parte del diseño conceptual y las decisiones técnicas dentro de la carpeta `/docs`.

## Documentación incluida

- Arquitectura del sistema.
- Diseño backend conceptual.
- Contratos de API.
- Diseño de UI.
- Decisiones técnicas e integraciones recomendadas.

## Autor

Diego Marín López