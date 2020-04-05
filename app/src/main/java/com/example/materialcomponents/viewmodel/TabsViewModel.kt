package com.example.materialcomponents.viewmodel

import androidx.lifecycle.ViewModel
import com.example.materialcomponents.R

class TabsViewModel : ViewModel() {

    val tabsNames: List<String> by lazy {
        listOf(
            "Red",
            "Lime",
            "Amber",
            "Blue Grey",
            "Blue",
            "Light Blue",
            "Brown",
            "Cyan",
            "Deep Orange",
            "Deep purple",
            "Green",
            "Indigo",
            "Light Green",
            "Orange",
            "Pink",
            "Purple",
            "Teal",
            "Yellow"
        )
    }


}