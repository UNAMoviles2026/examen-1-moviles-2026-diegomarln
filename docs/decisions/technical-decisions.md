# Decisiones Técnicas

## 1. Propósito del análisis

Este documento presenta integraciones adicionales y mejoras de interfaz recomendadas para evolucionar la prueba de concepto hacia una aplicación móvil más completa para la gestión de espacios de coworking.

La prueba de concepto actual permite visualizar espacios disponibles, consultar el detalle de un espacio seleccionado y simular una reservación. A partir de esta base, se proponen mejoras funcionales y de experiencia de usuario orientadas a un escenario real de uso.

## 2. Integraciones adicionales recomendadas

### 2.1 Autenticación de usuarios

Se recomienda integrar autenticación para que cada usuario pueda gestionar sus propias reservaciones, historial y datos personales.

Esta integración aporta valor porque una aplicación de reservación necesita identificar quién está realizando cada reserva. Sin autenticación, no sería posible asociar una reservación a una persona, consultar historial ni administrar cancelaciones de forma segura.

Funcionalidades relacionadas:

- Registro de usuarios.
- Inicio de sesión.
- Perfil de usuario.
- Historial de reservaciones.
- Gestión de reservas activas.

### 2.2 Geolocalización

Se recomienda integrar geolocalización para mostrar espacios cercanos al usuario o permitir abrir la ubicación en un mapa.

Esta integración aporta valor porque la ubicación es un criterio clave al elegir un espacio de coworking. Un usuario normalmente busca espacios cercanos a su universidad, trabajo, casa o zona de reunión.

Funcionalidades relacionadas:

- Ordenar espacios por cercanía.
- Mostrar distancia aproximada.
- Abrir ubicación en Google Maps.
- Filtrar espacios por zona.

### 2.3 Notificaciones

Se recomienda integrar notificaciones para informar al usuario sobre confirmaciones, recordatorios y cambios en sus reservaciones.

Esta integración aporta valor porque las reservas dependen de fecha y hora. Las notificaciones ayudan a reducir olvidos, mejorar el seguimiento de las reservas y comunicar cambios importantes.

Funcionalidades relacionadas:

- Confirmación de reservación.
- Recordatorio antes del horario reservado.
- Notificación de cancelación.
- Aviso de cambios en disponibilidad.

### 2.4 Pagos en línea

Se recomienda integrar pagos en línea para permitir que el usuario complete la reservación desde la aplicación.

Esta integración aporta valor porque reduce la fricción del proceso. Si el usuario puede consultar, reservar y pagar desde el mismo flujo, la experiencia es más completa y confiable. Además, para la empresa permite confirmar reservas con mayor seguridad.

Funcionalidades relacionadas:

- Pago por hora.
- Confirmación automática de pago.
- Recibos digitales.
- Historial de pagos.
- Procesos de cancelación o reembolso.

### 2.5 Búsqueda y filtros

Se recomienda integrar búsqueda y filtros por ubicación, precio, capacidad, disponibilidad y amenidades.

Esta integración aporta valor porque un sistema de coworking puede tener muchos espacios disponibles. Sin filtros, el usuario debe revisar manualmente cada opción. Con filtros, puede encontrar más rápido el espacio que realmente necesita.

Funcionalidades relacionadas:

- Filtro por disponibilidad.
- Filtro por precio por hora.
- Filtro por capacidad.
- Filtro por ubicación.
- Filtro por amenidades.

## 3. Mejoras propuestas para la interfaz de usuario

### 3.1 Agregar filtros visibles en el listado

Se recomienda agregar filtros en la pantalla de listado para que el usuario pueda reducir los resultados según sus necesidades.

Esta mejora favorece la usabilidad porque evita que el usuario tenga que revisar todos los espacios manualmente. También mejora la claridad, ya que permite organizar la información por criterios importantes como disponibilidad, capacidad o precio.

### 3.2 Usar fotografías reales de los espacios

En la prueba de concepto se utiliza una imagen simulada. En una versión completa, se recomienda usar fotografías reales de cada espacio.

Esta mejora aumenta la confianza del usuario, ya que puede conocer visualmente el ambiente antes de reservar. En una aplicación de coworking, la apariencia del espacio influye directamente en la decisión de reserva.

### 3.3 Mejorar los estados de disponibilidad

Se recomienda reforzar el estado de disponibilidad mediante colores, etiquetas más claras y botones deshabilitados cuando el espacio no esté disponible.

Esta mejora reduce confusión. El usuario puede identificar rápidamente qué espacios puede reservar y cuáles no, sin tener que leer demasiado contenido.

### 3.4 Agregar selección de fecha y hora

Se recomienda agregar controles para seleccionar fecha, hora de inicio y hora de finalización antes de confirmar la reserva.

Esta mejora hace que el flujo de reservación sea más realista y útil. También permite validar disponibilidad según el horario solicitado, lo cual es esencial en una aplicación de reservas.

### 3.5 Mostrar resumen antes de confirmar

Se recomienda mostrar una pantalla o sección de resumen antes de confirmar la reservación.

El resumen debería incluir:

- Nombre del espacio.
- Fecha.
- Hora de inicio.
- Hora de finalización.
- Cantidad de personas.
- Precio estimado.

Esta mejora ayuda a prevenir errores y aumenta la confianza del usuario antes de confirmar la acción.

### 3.6 Hacer funcional la barra inferior de navegación

La prueba de concepto muestra una barra inferior con secciones base. En una versión completa, cada opción debería navegar a su pantalla correspondiente.

Esta mejora fortalece la organización de la aplicación, separando claramente la exploración de espacios, las reservas del usuario y el perfil personal.

## 4. Justificación general

Las integraciones y mejoras propuestas se relacionan directamente con el propósito del sistema: permitir que los usuarios encuentren, exploren y reserven espacios de coworking.

La autenticación permite asociar reservas a usuarios reales. La geolocalización mejora la búsqueda de espacios cercanos. Las notificaciones ayudan a dar seguimiento a las reservas. Los pagos completan el flujo comercial. La búsqueda y los filtros mejoran la exploración.

En cuanto a la UI, las mejoras propuestas buscan que el flujo sea más claro, rápido y confiable. Fotografías reales, estados de disponibilidad, filtros, selección de fecha y resumen de confirmación ayudan a que el usuario tome mejores decisiones y reduzca errores durante la reserva.

## 5. Conclusión

Las decisiones técnicas propuestas permiten evolucionar la prueba de concepto hacia una aplicación más completa y útil en un contexto real. Las integraciones agregan valor funcional al sistema, mientras que las mejoras de interfaz fortalecen la usabilidad, la claridad y la experiencia general del usuario.