package com.moviles.examenmoviles.data

val mockCoworkingSpaces = listOf(
    CoworkingSpace(
        id = 1,
        name = "Centro de Trabajo Central",
        imageDescription = "Espacio de coworking moderno con escritorios compartidos",
        description = "Espacio de coworking abierto diseñado para estudiantes, freelancers y trabajadores remotos que necesitan un lugar cómodo para concentrarse.",
        location = "Centro, Edificio A",
        capacity = 24,
        pricePerHour = 8.50,
        isAvailable = true,
        amenities = listOf("Wi-Fi", "Café", "Sala de reuniones", "Enchufes")
    ),
    CoworkingSpace(
        id = 2,
        name = "Sala Estudio Creativo",
        imageDescription = "Sala creativa privada con pizarrón y pantalla",
        description = "Sala privada para sesiones de lluvia de ideas, reuniones de diseño, entrevistas o planificación de equipos pequeños.",
        location = "Campus Norte, Piso 2",
        capacity = 8,
        pricePerHour = 12.00,
        isAvailable = true,
        amenities = listOf("Pizarrón", "Pantalla TV", "Wi-Fi", "Aire acondicionado")
    ),
    CoworkingSpace(
        id = 3,
        name = "Área de Escritorios Enfocados",
        imageDescription = "Área silenciosa de escritorios para trabajo individual",
        description = "Área silenciosa con escritorios individuales para usuarios que necesitan concentración y un ambiente de trabajo tranquilo.",
        location = "Ala Este, Sala 104",
        capacity = 16,
        pricePerHour = 6.75,
        isAvailable = false,
        amenities = listOf("Zona silenciosa", "Wi-Fi", "Enchufes")
    ),
    CoworkingSpace(
        id = 4,
        name = "Espacio de Colaboración en Equipo",
        imageDescription = "Espacio colaborativo para equipos medianos",
        description = "Área de coworking flexible para equipos de proyecto que necesitan colaboración abierta, mesas compartidas y acceso rápido a recursos.",
        location = "Centro de Innovación, Piso 1",
        capacity = 14,
        pricePerHour = 10.25,
        isAvailable = true,
        amenities = listOf("Mesas compartidas", "Wi-Fi", "Café", "Proyector")
    )
)