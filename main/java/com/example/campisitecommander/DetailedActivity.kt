package com.example.campisitecommander

import android.os.Bundle
import android.util.Log.i
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView

class DetailedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed)
            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.ViewDetails)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets

                val btnBack =
                    findViewById<Button>(R.id.button3)()

                var displayText = ""

                for (i in MainActivity.itemNames.indices)

                    displayText += MainActivity.itemNames[i] + "\n" + MainActivity.categories[i] + "\n" + MainActivity.quantities[i] + "\n" + MainActivity.comments[i] + "\n\n"


                btnBack.setOnClickListener {
                    finish()
                }

            }
    }
}