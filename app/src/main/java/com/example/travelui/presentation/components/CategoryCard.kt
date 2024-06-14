package com.example.travelui.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.travelui.R

@Composable
fun CategoryCard(imageRes: Int, title: String, location: String) {
    Column(
        modifier = Modifier
            .width(200.dp)
            .height(200.dp)
    ) {
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = "null",
            modifier = Modifier
                .height(120.dp)
                .fillMaxWidth()
                .clip(MaterialTheme.shapes.medium),
            contentScale = ContentScale.Crop,
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = title, style = MaterialTheme.typography.titleMedium)
        Row {
            Icon(imageVector = Icons.Outlined.LocationOn,
                contentDescription = "Location Icon",
                tint = Color.Gray)
            Spacer(modifier = Modifier.width(2.dp))
            Text(text = location, style = MaterialTheme.typography.bodySmall, color = Color.Gray)
        }
    }
}

@Composable
fun CategoryList() {
    Row(modifier = Modifier
        .fillMaxWidth()
        /*horizontalScroll(rememberScrollState())
    */) {
        CategoryCard(
            title = stringResource(id = R.string.extreme_surf),
            location = "Santa Cruz",
            imageRes = R.drawable.surfing
        )
        Spacer(modifier = Modifier.width(16.dp))
        CategoryCard(
            title = stringResource(id = R.string.kayaking),
            location = "Santa Cruz",
            imageRes = R.drawable.kayaking
        )

    }
}
