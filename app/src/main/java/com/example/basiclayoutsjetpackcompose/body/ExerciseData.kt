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
    }
}

data class ExerciseDataItem(val name: String, val resourceId: Int)