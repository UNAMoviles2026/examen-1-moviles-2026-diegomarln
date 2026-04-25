package com.moviles.examenmoviles.navigation

object AppDestinations {
    const val SPACES_LIST = "spaces"
    const val SPACE_DETAIL = "space_detail"
    const val SPACE_ID_ARG = "spaceId"
    const val SPACE_DETAIL_ROUTE = "$SPACE_DETAIL/{$SPACE_ID_ARG}"

    fun spaceDetailRoute(spaceId: Int): String {
        return "$SPACE_DETAIL/$spaceId"
    }
}