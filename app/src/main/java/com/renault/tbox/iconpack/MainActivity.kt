package com.example.launcher

import android.app.Activity
import android.os.Bundle
import android.widget.GridLayout
import android.widget.ImageView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val grid = GridLayout(this)
        grid.columnCount = 3
        grid.rowCount = 6

        val icons = arrayOf(
            R.drawable.apps,
            R.drawable.bluetooth,
            R.drawable.car,
            R.drawable.chrome,
            R.drawable.drive,
            R.drawable.eradio,
            R.drawable.files,
            R.drawable.gmail,
            R.drawable.maps,
            R.drawable.music,
            R.drawable.phone,
            R.drawable.playstore,
            R.drawable.settings,
            R.drawable.spotify,
            R.drawable.torque,
            R.drawable.weather,
            R.drawable.wifi,
            R.drawable.youtube
        )

        for (icon in icons) {
            val img = ImageView(this)
            img.setImageResource(icon)
            img.setPadding(20,20,20,20)
            grid.addView(img)
        }

        setContentView(grid)
    }
}
