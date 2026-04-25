package com.moviles.examenmoviles.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun SpaceImage(
    @DrawableRes imageRes: Int,
    contentDescription: String,
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(id = imageRes),
        contentDescription = contentDescription,
        modifier = modifier
            .fillMaxWidth()
            .height(170.dp)
            .clip(RoundedCornerShape(18.dp)),
        contentScale = ContentScale.Crop
    )
}
