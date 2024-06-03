package com.example.travelui.presentation

import HomeBottomAppBar
import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.travelui.R
import com.example.travelui.presentation.components.ActivityIcons
import com.example.travelui.presentation.components.CategoryList
import com.example.travelui.presentation.components.CategoryTabs

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(){
    Scaffold (
        topBar = {
            Column{
                TopAppBar(title = { /*TODO*/ },
                    modifier = Modifier
                        .height(56.dp)
                        .padding(paddingValues = PaddingValues(horizontal = 16.dp)),
                )
                Row (
                    modifier = Modifier
                   .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically)
                {
                 IconButton(onClick = { /*TODO*/ }) {
                     Icon(imageVector = Icons.Filled.Menu, contentDescription = "Menu" )
                     Image(painter = painterResource(id = R.drawable.profile)
                       , contentDescription ="Profile",
                        contentScale =  ContentScale.Crop,
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                        )
                     Spacer(modifier = Modifier.height(16.dp))
                     Text(text = "Find Your Experience")
                 }
                }
            }

        },
        bottomBar = {
                HomeBottomAppBar(
                    onHomeClicked = {
                    },
                   onFavouriteClicked = {
                    },
                   onMessageClicked = {

                    },
                    onSearchClicked = {

                   }

                )
           },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                CategoryTabs()
                Spacer(modifier = Modifier.height(16.dp))
                CategoryList()
                Spacer(modifier = Modifier.height(16.dp))
                @Composable
                fun HeaderRow(){
                    Row (modifier = Modifier
                        .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically){
                        Text(
                            text = stringResource(id = R.string.what_would_you_like) ,
                            style = MaterialTheme.typography.bodySmall,
                        )

                        TextButton(onClick = { /*TODO*/ }) {
                            Text(text = stringResource(id = R.string.view_all),
                                color = MaterialTheme.colorScheme.primary)
                        }
                    }
                }
                HeaderRow()
                Spacer(modifier = Modifier.height(16.dp))
                ActivityIcons()
            }
        }
    )}