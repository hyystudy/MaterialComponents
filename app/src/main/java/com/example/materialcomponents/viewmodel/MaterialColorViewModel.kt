package com.example.materialcomponents.viewmodel

import androidx.lifecycle.ViewModel
import com.example.materialcomponents.R

class MaterialColorViewModel : ViewModel() {

    val materialColors: Map<String, List<Int>> by lazy {
        mapOf(
            "Red" to redColors,
            "Lime" to limeColors,
            "Amber" to amberColors,
            "Blue Grey" to blueGreyColors,
            "Blue" to blueColors,
            "Light Blue" to lightBlueColors,
            "Brown" to brownColors,
            "Cyan" to cyanColors,
            "Deep Orange" to deepOrangeColors,
            "Deep purple" to deepPurpleColors,
            "Green" to greenColors,
            "Indigo" to indigoColors,
            "Light Green" to lightGreenColors,
            "Orange" to orangeColors,
            "Pink" to pinkColors,
            "Purple" to purpleColors,
            "Teal" to tealColors,
            "Yellow" to yellowColors
        )
    }

    val redColors: List<Int> by lazy {
        listOf(
            R.color.material_red_50,
            R.color.material_red_100,
            R.color.material_red_200,
            R.color.material_red_300,
            R.color.material_red_400,
            R.color.material_red_500,
            R.color.material_red_600,
            R.color.material_red_700,
            R.color.material_red_800,
            R.color.material_red_900
        )
    }

    val limeColors: List<Int> by lazy {
        listOf(
            R.color.material_Lime_50,
            R.color.material_Lime_100,
            R.color.material_Lime_200,
            R.color.material_Lime_300,
            R.color.material_Lime_400,
            R.color.material_Lime_500,
            R.color.material_Lime_600,
            R.color.material_Lime_700,
            R.color.material_Lime_800,
            R.color.material_Lime_900
        )
    }

    val amberColors: List<Int> by lazy {
        listOf(
            R.color.material_amber_50,
            R.color.material_amber_100,
            R.color.material_amber_200,
            R.color.material_amber_300,
            R.color.material_amber_400,
            R.color.material_amber_500,
            R.color.material_amber_600,
            R.color.material_amber_700,
            R.color.material_amber_800,
            R.color.material_amber_900
        )
    }


    val blueGreyColors: List<Int> by lazy {
        listOf(
            R.color.material_blueGrey_50,
            R.color.material_blueGrey_100,
            R.color.material_blueGrey_200,
            R.color.material_blueGrey_300,
            R.color.material_blueGrey_400,
            R.color.material_blueGrey_500,
            R.color.material_blueGrey_600,
            R.color.material_blueGrey_700,
            R.color.material_blueGrey_800,
            R.color.material_blueGrey_900
        )
    }

    val blueColors: List<Int> by lazy {
        listOf(
            R.color.material_blue_50,
            R.color.material_blue_100,
            R.color.material_blue_200,
            R.color.material_blue_300,
            R.color.material_blue_400,
            R.color.material_blue_500,
            R.color.material_blue_600,
            R.color.material_blue_700,
            R.color.material_blue_800,
            R.color.material_blue_900
        )
    }

    val lightBlueColors: List<Int> by lazy {
        listOf(
            R.color.material_lightBlue_50,
            R.color.material_lightBlue_100,
            R.color.material_lightBlue_200,
            R.color.material_lightBlue_300,
            R.color.material_lightBlue_400,
            R.color.material_lightBlue_500,
            R.color.material_lightBlue_600,
            R.color.material_lightBlue_700,
            R.color.material_lightBlue_800,
            R.color.material_lightBlue_900
        )
    }

    val brownColors: List<Int> by lazy {
        listOf(
            R.color.material_brown_50,
            R.color.material_brown_100,
            R.color.material_brown_200,
            R.color.material_brown_300,
            R.color.material_brown_400,
            R.color.material_brown_500,
            R.color.material_brown_600,
            R.color.material_brown_700,
            R.color.material_brown_800,
            R.color.material_brown_900
        )
    }

    val cyanColors: List<Int> by lazy {
        listOf(
            R.color.material_cyan_50,
            R.color.material_cyan_100,
            R.color.material_cyan_200,
            R.color.material_cyan_300,
            R.color.material_cyan_400,
            R.color.material_cyan_500,
            R.color.material_cyan_600,
            R.color.material_cyan_700,
            R.color.material_cyan_800,
            R.color.material_cyan_900
        )
    }

    val deepOrangeColors: List<Int> by lazy {
        listOf(
            R.color.material_deepOrange_50,
            R.color.material_deepOrange_100,
            R.color.material_deepOrange_200,
            R.color.material_deepOrange_300,
            R.color.material_deepOrange_400,
            R.color.material_deepOrange_500,
            R.color.material_deepOrange_600,
            R.color.material_deepOrange_700,
            R.color.material_deepOrange_800,
            R.color.material_deepOrange_900
        )
    }

    val deepPurpleColors: List<Int> by lazy {
        listOf(
            R.color.material_deepPurple_50,
            R.color.material_deepPurple_100,
            R.color.material_deepPurple_200,
            R.color.material_deepPurple_300,
            R.color.material_deepPurple_400,
            R.color.material_deepPurple_500,
            R.color.material_deepPurple_600,
            R.color.material_deepPurple_700,
            R.color.material_deepPurple_800,
            R.color.material_deepPurple_900
        )
    }
    val greenColors: List<Int> by lazy {
        listOf(
            R.color.material_green_50,
            R.color.material_green_100,
            R.color.material_green_200,
            R.color.material_green_300,
            R.color.material_green_400,
            R.color.material_green_500,
            R.color.material_green_600,
            R.color.material_green_700,
            R.color.material_green_800,
            R.color.material_green_900
        )
    }

    val indigoColors: List<Int> by lazy {
        listOf(
            R.color.material_indigo_50,
            R.color.material_indigo_100,
            R.color.material_indigo_200,
            R.color.material_indigo_300,
            R.color.material_indigo_400,
            R.color.material_indigo_500,
            R.color.material_indigo_600,
            R.color.material_indigo_700,
            R.color.material_indigo_800,
            R.color.material_indigo_900
        )
    }

    val lightGreenColors: List<Int> by lazy {
        listOf(
            R.color.material_lightGreen_50,
            R.color.material_lightGreen_100,
            R.color.material_lightGreen_200,
            R.color.material_lightGreen_300,
            R.color.material_lightGreen_400,
            R.color.material_lightGreen_500,
            R.color.material_lightGreen_600,
            R.color.material_lightGreen_700,
            R.color.material_lightGreen_800,
            R.color.material_lightGreen_900
        )
    }

    val orangeColors: List<Int> by lazy {
        listOf(
            R.color.material_orange_50,
            R.color.material_orange_100,
            R.color.material_orange_200,
            R.color.material_orange_300,
            R.color.material_orange_400,
            R.color.material_orange_500,
            R.color.material_orange_600,
            R.color.material_orange_700,
            R.color.material_orange_800,
            R.color.material_orange_900
        )
    }

    val pinkColors: List<Int> by lazy {
        listOf(
            R.color.material_pink_50,
            R.color.material_pink_100,
            R.color.material_pink_200,
            R.color.material_pink_300,
            R.color.material_pink_400,
            R.color.material_pink_500,
            R.color.material_pink_600,
            R.color.material_pink_700,
            R.color.material_pink_800,
            R.color.material_pink_900
        )
    }

    val purpleColors: List<Int> by lazy {
        listOf(
            R.color.material_purple_50,
            R.color.material_purple_100,
            R.color.material_purple_200,
            R.color.material_purple_300,
            R.color.material_purple_400,
            R.color.material_purple_500,
            R.color.material_purple_600,
            R.color.material_purple_700,
            R.color.material_purple_800,
            R.color.material_purple_900
        )
    }

    val tealColors: List<Int> by lazy {
        listOf(
            R.color.material_teal_50,
            R.color.material_teal_100,
            R.color.material_teal_200,
            R.color.material_teal_300,
            R.color.material_teal_400,
            R.color.material_teal_500,
            R.color.material_teal_600,
            R.color.material_teal_700,
            R.color.material_teal_800,
            R.color.material_teal_900
        )
    }

    val yellowColors: List<Int> by lazy {
        listOf(
            R.color.material_yellow_50,
            R.color.material_yellow_100,
            R.color.material_yellow_200,
            R.color.material_yellow_300,
            R.color.material_yellow_400,
            R.color.material_yellow_500,
            R.color.material_yellow_600,
            R.color.material_yellow_700,
            R.color.material_yellow_800,
            R.color.material_yellow_900
        )
    }
}