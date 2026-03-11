package com.renault.tbox.iconpack.goldv2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView = TextView(this).apply {
            text = "Renault Tbox Icon Pack\n\nInstalled successfully.\n\nOpen your launcher and select:\nIcon Pack -> Renault Tbox Icon Pack"
            textSize = 18f
            setPadding(48, 96, 48, 48)
        }

        setContentView(textView)
    }
}
