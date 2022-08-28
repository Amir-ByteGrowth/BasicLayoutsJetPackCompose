package com.example.basiclayoutsjetpackcompose.body

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basiclayoutsjetpackcompose.R


@Composable
fun CreateFavoriteCollection() {

    LazyRow(modifier = Modifier.padding(horizontal = 15.dp), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
        items(ExerciseData.FavCollectionDataList) {
            FavoriteCollectionItem(it)
        }
    }

}

@Composable
fun FavoriteCollectionItem(
    favCollectionDataItem: FavCollectionDataItem,
    modifier: Modifier = Modifier
) {
    Surface(color = Color.LightGray, modifier = modifier.width(190.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = favCollectionDataItem.resourceId),
                contentDescription = null,
                modifier = modifier
                    .size(60.dp)
                    .clip(RectangleShape),
                contentScale = ContentScale.Crop
            )
            Text(
                text = favCollectionDataItem.name,
                style = MaterialTheme.typography.h5.copy(fontSize = 16.sp, lineHeight = 18.sp),
                modifier = modifier.padding(horizontal = 20.dp)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewFavoriteCollection() {
    CreateFavoriteCollection()
}