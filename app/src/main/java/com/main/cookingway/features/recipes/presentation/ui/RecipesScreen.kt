package com.main.cookingway.features.recipes.presentation.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.main.cookingway.R
import com.main.cookingway.resources.theme.CookingWayTheme
import com.main.cookingway.resources.theme.Turquoise

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = false)
@Composable
fun RecipesScreen() {
    val vectorResId = R.drawable.icon_refresh
    val imageVector = ImageVector.Companion.vectorResource(id = vectorResId)

    CookingWayTheme {
        TopAppBar(
            title = {
                Text(
                    text = "TopAppBar",
                    modifier = Modifier.padding(start = 10.dp)
                )
            },
            navigationIcon = {
                IconButton(onClick = {  }) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = null
                    )
                }
            },
            colors = TopAppBarDefaults.smallTopAppBarColors(
                containerColor = Turquoise,
                titleContentColor = Color.Black,
            ),
            actions = {
                IconButton(onClick = { /* doSomething() */ }) {
                    Icon(imageVector, contentDescription = null)
                }
            }
        )
    }
}