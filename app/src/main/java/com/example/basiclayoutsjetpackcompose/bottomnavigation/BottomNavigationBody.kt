package com.example.basiclayoutsjetpackcompose.bottomnavigation

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.basiclayoutsjetpackcompose.body.CreateFavoriteCollection

@Composable
fun CreateBottomNavBar(modifier: Modifier = Modifier) {
    BottomNavigation(backgroundColor = MaterialTheme.colors.background, modifier = modifier) {
        BottomNavigationItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.Settings,
                    contentDescription = null
                )
            },
            label = {
                Text("Setting")
            },
            selected = true,
            onClick = {}
        )
        BottomNavigationItem(selected = false, onClick = { }, icon = {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = null
            )

        }, label = { Text(text = "Search") }, alwaysShowLabel = true

        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCreateBottomNavBar() {
    CreateFavoriteCollection()
}