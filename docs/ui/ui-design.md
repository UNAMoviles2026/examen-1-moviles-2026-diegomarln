# Diseño de UI

## 1. Estructura de la interfaz implementada

La interfaz de la aplicación se diseñó como una prueba de concepto funcional para explorar y reservar espacios de coworking. La UI está construida completamente con Jetpack Compose y utiliza datos simulados definidos directamente en el código.

La aplicación contiene dos pantallas principales:

1. **Pantalla de listado de espacios**
    - Muestra los espacios de coworking disponibles.
    - Utiliza `LazyColumn` para presentar una lista desplazable.
    - Cada espacio se representa mediante una tarjeta reutilizable.
    - Incluye una barra superior con el título de la aplicación.
    - Incluye una barra de navegación inferior visible.

2. **Pantalla de detalle del espacio**
    - Muestra información ampliada del espacio seleccionado.
    - Presenta imagen simulada, nombre, descripción, ubicación, capacidad, precio por hora, disponibilidad y amenidades.
    - Incluye un botón para simular la creación de una reservación.
    - Incluye navegación de regreso al listado.
    - Mantiene visible la barra de navegación inferior.

La navegación principal permite pasar desde el listado hacia el detalle de un espacio seleccionado. Para esto se utiliza el identificador del espacio como argumento de navegación.

## 2. Lista de composables creados

### `SpacesListScreen`

Representa la pantalla principal de listado de espacios de coworking.

Responsabilidades:

- Mostrar el título de la pantalla.
- Mostrar una descripción breve del propósito de la pantalla.
- Renderizar la lista de espacios mediante `LazyColumn`.
- Usar `SpaceCard` para representar cada elemento.
- Recibir la acción `onSpaceClick` para navegar al detalle.
- Mostrar el `BottomBar` mediante `SpacesBottomBar`.

### `SpaceDetailScreen`

Representa la pantalla de detalle de un espacio seleccionado.

Responsabilidades:

- Mostrar la información ampliada del espacio.
- Mostrar la imagen simulada del espacio.
- Mostrar ubicación, capacidad, precio, disponibilidad y amenidades.
- Permitir volver al listado mediante un botón de regreso.
- Simular una reservación mediante el botón `Reserve Space`.
- Mostrar un `Snackbar` como retroalimentación visual.
- Mantener visible la barra inferior de navegación.

### `SpacesBottomBar`

Representa la barra de navegación inferior visible en las pantallas principales.

Incluye tres opciones visuales:

- `Spaces`
- `Bookings`
- `Profile`

En esta prueba de concepto, la opción principal es `Spaces`, ya que el alcance se enfoca en explorar espacios y ver su detalle. Las demás opciones quedan como parte de la estructura visual base para una futura versión.

### `SpaceCard`

Componente reutilizable para representar un espacio de coworking dentro del listado.

Muestra:

- Imagen simulada.
- Nombre del espacio.
- Descripción.
- Ubicación.
- Capacidad.
- Precio por hora.
- Estado de disponibilidad.

Este componente recibe un objeto `CoworkingSpace` y una acción `onClick`, por lo que puede reutilizarse en cualquier listado de espacios.

### `SpaceImage`

Componente reutilizable para representar visualmente la imagen del espacio.

Como la prueba de concepto no requiere imágenes reales, se utiliza una imagen simulada con un fondo y un ícono. Esto cumple el requisito visual sin depender de recursos externos o backend.

### `SpaceInfoRow`

Componente reutilizable para mostrar una fila de información con ícono y texto.

Se utiliza para datos como:

- Ubicación.
- Capacidad.
- Precio por hora.
- Disponibilidad.
- Amenidades.

Este componente evita repetir estructuras de `Row`, `Icon` y `Text` en varias partes de la aplicación.

### `SpaceAvailabilityBadge`

Componente reutilizable para mostrar el estado de disponibilidad del espacio.

Puede mostrar:

- `Available`
- `Unavailable`

Este componente permite mantener consistencia visual en el listado y en la pantalla de detalle.

### `AppNavHost`

Componente encargado de definir la navegación principal de la aplicación.

Responsabilidades:

- Definir la pantalla inicial.
- Navegar del listado al detalle.
- Recibir el identificador del espacio seleccionado.
- Resolver el espacio seleccionado desde los datos simulados.
- Permitir regresar desde el detalle al listado.

### `AppDestinations`

Objeto utilizado para centralizar las rutas de navegación.

Esto evita escribir rutas manualmente en varios lugares y reduce el riesgo de errores al navegar entre pantallas.

## 3. Componentes reutilizables identificados

Los principales componentes reutilizables son:

- `SpaceCard`
- `SpaceImage`
- `SpaceInfoRow`
- `SpaceAvailabilityBadge`
- `SpacesBottomBar`

Estos componentes se separaron de las pantallas para evitar duplicación de código y mantener una estructura clara entre pantallas completas y elementos visuales reutilizables.

## 4. Justificación de la organización de la interfaz

La interfaz se organizó separando responsabilidades entre `screens`, `components`, `data` y `navigation`.

La carpeta `screens` contiene pantallas completas, como el listado y el detalle. Estas pantallas se encargan de componer la interfaz general y coordinar las acciones del usuario.

La carpeta `components` contiene elementos reutilizables, como tarjetas, filas de información, badges de disponibilidad e imagen simulada. Esta separación permite que los componentes puedan usarse en varias pantallas sin duplicar código.

La carpeta `data` contiene el modelo `CoworkingSpace` y los datos simulados utilizados por la prueba de concepto. Esto mantiene los datos separados de la interfaz.

La carpeta `navigation` contiene las rutas y el `NavHost`, lo que permite mantener la navegación centralizada y más fácil de mantener.

Esta organización cumple con los principios de modularidad y limpieza solicitados en la evaluación, ya que evita construir toda la interfaz en un solo composable y permite que cada archivo tenga una responsabilidad clara.

## 5. Relación con los requisitos de Jetpack Compose

La implementación utiliza los componentes requeridos por la evaluación:

- `LazyColumn` para el listado de espacios.
- `Card` para representar cada espacio.
- `Text` para mostrar información textual.
- `Image` para representar la imagen simulada del espacio.
- `Button` para simular la reservación.
- `IconButton` para la acción de regreso.
- `Scaffold` para estructurar las pantallas.
- `NavigationBar` para la barra inferior.
- `Row`, `Column` y `Box` para organizar la interfaz.
- `Modifier` para aplicar estilos, tamaño, espaciado y comportamiento.

## 6. Conclusión

El diseño de UI implementado cumple con el alcance de la prueba de concepto. 
La aplicación permite visualizar espacios de coworking, navegar a una pantalla de detalle y simular una reservación. La estructura utilizada favorece la claridad, la reutilización de componentes y el crecimiento futuro del proyecto.