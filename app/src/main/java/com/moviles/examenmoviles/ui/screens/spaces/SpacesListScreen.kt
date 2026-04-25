package com.moviles.examenmoviles.ui.screens.spaces

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Work
import androidx.compose.material.icons.outlined.CalendarMonth
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.moviles.examenmoviles.data.CoworkingSpace
import com.moviles.examenmoviles.data.mockCoworkingSpaces
import com.moviles.examenmoviles.ui.components.SpaceCard

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SpacesListScreen(
    spaces: List<CoworkingSpace> = mockCoworkingSpaces,
    onSpaceClick: (CoworkingSpace) -> Unit,
    modifier: Modifier = Modifier
) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = "Coworking Spaces",
                        style = MaterialTheme.typography.titleLarge
                    )
                },
                navigationIcon = {
                    Icon(
                        imageVector = Icons.Filled.Work,
                        contentDescription = null,
                        modifier = Modifier.padding(start = 16.dp),
                        tint = MaterialTheme.colorScheme.primary
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.background
                )
            )
        },
        bottomBar = {
            SpacesBottomBar()
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            Text(
                text = "Find available spaces to work, meet, or collaborate.",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 18.dp, vertical = 12.dp),
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )

            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(
                    start = 16.dp,
                    end = 16.dp,
                    top = 8.dp,
                    bottom = 24.dp
                ),
                verticalArrangement = Arrangement.spacedBy(14.dp)
            ) {
                items(spaces) { space ->
                    SpaceCard(
                        space = space,
                        onClick = { onSpaceClick(space) }
                    )
                }
            }
        }
    }
}

@Composable
fun SpacesBottomBar(
    modifier: Modifier = Modifier
) {
    NavigationBar(
        modifier = modifier,
        containerColor = MaterialTheme.colorScheme.surface
    ) {
        NavigationBarItem(
            selected = true,
            onClick = { },
            icon = {
                Icon(
                    imageVector = Icons.Outlined.Home,
                    contentDescription = "Spaces"
                )
            },
            label = { Text(text = "Spaces") }
        )

        NavigationBarItem(
            selected = false,
            onClick = { },
            icon = {
                Icon(
                    imageVector = Icons.Outlined.CalendarMonth,
                    contentDescription = "Reservations"
                )
            },
            label = { Text(text = "Bookings") }
        )

        NavigationBarItem(
            selected = false,
            onClick = { },
            icon = {
                Icon(
                    imageVector = Icons.Outlined.Person,
                    contentDescription = "Profile"
                )
            },
            label = { Text(text = "Profile") }
        )
    }
}