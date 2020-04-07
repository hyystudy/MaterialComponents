package com.example.materialcomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onNightModeChanged(mode: Int) {
        super.onNightModeChanged(mode)
        when(mode) {
            AppCompatDelegate.MODE_NIGHT_NO -> {
                Log.d(TAG, "theme is light theme")
            }
            AppCompatDelegate.MODE_NIGHT_YES -> {
                Log.d(TAG, "theme is darker theme")
            }
            AppCompatDelegate.MODE_NIGHT_AUTO_BATTERY -> {
                Log.d(TAG, "theme is auto battery theme")
            }
            AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM -> {
                Log.d(TAG, "theme is follow system")
            }
        }
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}
