package com.example.travelui.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.travelui.R

@Composable
fun ActivityIcons() {
ActivityIcon(iconRes = R.drawable.swimming, label = "Swimming")
    ActivityIcon(iconRes = R.drawable.kayak, label = "Kayaking")
    ActivityIcon(iconRes = R.drawable.hiking, label = "Hiking")
    ActivityIcon(iconRes =R .drawable.fishing , label = "Fishing")
}

@Composable
fun ActivityIcon(
  iconRes:Int,label:String
){
Column(
horizontalAlignment = Alignment.CenterHorizontally
) {
Box(modifier = Modifier
    .size(56.dp)
    .clip(CircleShape)
    .background(MaterialTheme.colorScheme.primary)) {
    Icon(painter = painterResource(id = iconRes),
        contentDescription = label,
        tint = Color.White,
        modifier = Modifier
            .size(24.dp)
            .align(Alignment.Center)
    )

}
    Spacer(modifier = Modifier.height(4.dp))
    Text(
        text = label,
        style = MaterialTheme.typography.labelSmall,
    )
}
}
