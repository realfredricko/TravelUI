package com.example.travelui.presentation.components

import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import com.example.travelui.R


@Composable
fun CategoryTabs(){
    TabRow(selectedTabIndex = 0) {
       Tab(selected = true, selectedContentColor = Color.Blue ,onClick = { /*TODO*/ }) {
           val tabExperience = stringResource(id = R.string.experiences)
           Text(text = tabExperience)
       }
        Tab(selected = false, unselectedContentColor = Color.Gray ,onClick = { /*TODO*/ }) {
            Text(text = "Adventures")
        }
        Tab(selected = false, unselectedContentColor = Color.Gray , onClick = { /*TODO*/ }) {
            Text(text = "Activities")
        }
    }
}