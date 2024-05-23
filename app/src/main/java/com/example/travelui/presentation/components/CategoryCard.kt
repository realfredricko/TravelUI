package com.example.travelui.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType.Companion.Text
import androidx.compose.ui.unit.dp
import com.example.travelui.R

@Composable
fun CategoryCard(title:String, location:String,imageRes:Int){
    Column(
        modifier = Modifier
            .width(200.dp)
            .height(8.dp)
    ){
        Image(
            painter = painterResource(id = R.drawable.messi),
            contentDescription =
            "null",
            modifier = Modifier
                .height(120.dp)
                .fillMaxWidth()
                .clip(MaterialTheme.shapes.medium),
            contentScale = ContentScale.Crop,
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = title, style = MaterialTheme.typography.titleMedium)
        Text(text = location, style = MaterialTheme.typography.displaySmall, color = Color.Gray)
        }
    }

@Composable
fun CategoryList() {
Row(modifier = Modifier
    .fillMaxWidth()
    .horizontalScroll(rememberScrollState())) {
CategoryCard(title = R.string.extreme_surf.toString(), location = "Santa Cruz",
    imageRes =R.drawable.messi )
    Spacer(modifier = Modifier.height(16.dp))
    CategoryCard(title = R.string.extreme_surf.toString(), location = "Santa Cruz",
        imageRes =R.drawable.messi )
}
}


