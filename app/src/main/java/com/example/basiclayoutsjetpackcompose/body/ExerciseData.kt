package com.example.basiclayoutsjetpackcompose.body

import com.example.basiclayoutsjetpackcompose.R

class ExerciseData {
    companion object {
        var ExerciseDataList = listOf(
            ExerciseDataItem("Fitness", R.drawable.fitness),
            ExerciseDataItem("Breathing", R.drawable.breathing),
            ExerciseDataItem("Holding", R.drawable.holding),
            ExerciseDataItem("Standing", R.drawable.standing),
            ExerciseDataItem("Stretching", R.drawable.stretching),
            ExerciseDataItem("Yoga", R.drawable.yoga)
        )

        var FavCollectionDataList = listOf(
            FavCollectionDataItem("Nature Meditations", R.drawable.nature2),
            FavCollectionDataItem("Nature2" + " Meditations", R.drawable.nature2),
            FavCollectionDataItem(
                "Nature3" + " Meditations", R.drawable.nature3
            ),
            FavCollectionDataItem(
                "Nature4" + " Meditations", R.drawable.nature4
            ),
            FavCollectionDataItem(
                "Nature5" + " Meditations", R.drawable.nature5
            ),
            FavCollectionDataItem(
                "Nature6" + " Meditations", R.drawable.nature6
            )
        )
    }
}

data class ExerciseDataItem(val name: String, val resourceId: Int)

data class FavCollectionDataItem(val name: String, val resourceId: Int)

