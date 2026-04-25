package com.moviles.examenmoviles.ui.screens.spaces

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material.icons.outlined.Groups
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Payments
import androidx.compose.material.icons.outlined.Wifi
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.moviles.examenmoviles.data.CoworkingSpace
import com.moviles.examenmoviles.ui.components.SpaceAvailabilityBadge
import com.moviles.examenmoviles.ui.components.SpaceImage
import com.moviles.examenmoviles.ui.components.SpaceInfoRow
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SpaceDetailScreen(
    space: CoworkingSpace,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val snackbarHostState = remember { SnackbarHostState() }
    val coroutineScope = rememberCoroutineScope()

    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = "Space Details",
                        style = MaterialTheme.typography.titleLarge
                    )
                },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Outlined.ArrowBack,
                            contentDescription = "Back"
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.background
                )
            )
        },
        bottomBar = {
            SpacesBottomBar()
        },
        snackbarHost = {
            SnackbarHost(hostState = snackbarHostState)
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentPadding = PaddingValues(
                start = 18.dp,
                end = 18.dp,
                top = 16.dp,
                bottom = 28.dp
            ),
            verticalArrangement = Arrangement.spacedBy(18.dp)
        ) {
            item {
                SpaceImage(
                    contentDescription = space.imageDescription,
                    modifier = Modifier.fillMaxWidth()
                )
            }

            item {
                Column(
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = space.name,
                            style = MaterialTheme.typography.headlineSmall,
                            color = MaterialTheme.colorScheme.onBackground,
                            modifier = Modifier.weight(1f)
                        )

                        SpaceAvailabilityBadge(isAvailable = space.isAvailable)
                    }

                    Text(
                        text = space.description,
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }

            item {
                Column(
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    SpaceInfoRow(
                        icon = Icons.Outlined.LocationOn,
                        text = space.location
                    )

                    SpaceInfoRow(
                        icon = Icons.Outlined.Groups,
                        text = "Capacity: ${space.capacity} people"
                    )

                    SpaceInfoRow(
                        icon = Icons.Outlined.Payments,
                        text = "$${space.pricePerHour} per hour"
                    )

                    SpaceInfoRow(
                        icon = Icons.Outlined.CheckCircle,
                        text = if (space.isAvailable) "Available for booking" else "Currently unavailable"
                    )
                }
            }

            item {
                Column(
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Text(
                        text = "Amenities",
                        style = MaterialTheme.typography.titleMedium,
                        color = MaterialTheme.colorScheme.onBackground
                    )

                    space.amenities.forEach { amenity ->
                        SpaceInfoRow(
                            icon = Icons.Outlined.Wifi,
                            text = amenity
                        )
                    }
                }
            }

            item {
                Button(
                    onClick = {
                        coroutineScope.launch {
                            snackbarHostState.showSnackbar(
                                message = "Reservation request created"
                            )
                        }
                    },
                    enabled = space.isAvailable,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Reserve Space")
                }
            }
        }
    }
}