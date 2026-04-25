package com.moviles.examenmoviles.data

val mockCoworkingSpaces = listOf(
    CoworkingSpace(
        id = 1,
        name = "Central Work Hub",
        imageDescription = "Modern coworking space with shared desks",
        description = "Open coworking space designed for students, freelancers, and remote workers who need a comfortable place to focus.",
        location = "Downtown, Building A",
        capacity = 24,
        pricePerHour = 8.50,
        isAvailable = true,
        amenities = listOf("Wi-Fi", "Coffee", "Meeting area", "Power outlets")
    ),
    CoworkingSpace(
        id = 2,
        name = "Creative Studio Room",
        imageDescription = "Private creative room with whiteboard and screen",
        description = "Private room for brainstorming sessions, design meetings, interviews, or small team planning.",
        location = "North Campus, Floor 2",
        capacity = 8,
        pricePerHour = 12.00,
        isAvailable = true,
        amenities = listOf("Whiteboard", "TV screen", "Wi-Fi", "Air conditioning")
    ),
    CoworkingSpace(
        id = 3,
        name = "Focus Desk Area",
        imageDescription = "Quiet desk area for individual work",
        description = "Quiet area with individual desks for users who need concentration and a calm work environment.",
        location = "East Wing, Room 104",
        capacity = 16,
        pricePerHour = 6.75,
        isAvailable = false,
        amenities = listOf("Silent area", "Wi-Fi", "Power outlets")
    ),
    CoworkingSpace(
        id = 4,
        name = "Team Collaboration Space",
        imageDescription = "Collaborative space for medium-size teams",
        description = "Flexible coworking area for project teams that need open collaboration, shared tables, and quick access to resources.",
        location = "Innovation Center, Floor 1",
        capacity = 14,
        pricePerHour = 10.25,
        isAvailable = true,
        amenities = listOf("Shared tables", "Wi-Fi", "Coffee", "Projector")
    )
)