package com.example.basiclayoutsjetpackcompose.body

import android.view.RoundedCorner
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basiclayoutsjetpackcompose.R


@Composable
fun CreateAlignYourBodyElement() {

    LazyRow {
        items(ExerciseData.ExerciseDataList) { item ->
            (AlignYourBodyElement(item))
        }
    }
}


@Composable
fun AlignYourBodyElement(exerciseDataItem: ExerciseDataItem, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(horizontal = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = exerciseDataItem.resourceId),
            contentDescription = exerciseDataItem.name,
            modifier = Modifier
                .clip(CircleShape)
                .size(80.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = modifier.height(5.dp))
        Text(text = exerciseDataItem.name, style = MaterialTheme.typography.h3, fontSize = 18.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewAlignYourBodyElement() {
    CreateAlignYourBodyElement()
}