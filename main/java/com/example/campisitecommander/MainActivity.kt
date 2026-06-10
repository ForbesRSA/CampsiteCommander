package com.example.campisitecommander

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {

    companion object {
        val itemNames = ArrayList<String>()
        val categories = ArrayList<String>()
        val quantities = ArrayList<String>()
        val comments = ArrayList<String>()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val edtItem = findViewById<EditText>(R.id.editTextText3)
        val edtCategory = findViewById<EditText>(R.id.editTextText3)
        val edtQuantity = findViewById<EditText>(R.id.editTextText3)
        val edtComment = findViewById<EditText>(R.id.editTextText3)

        val btnGear = findViewById<Button>(R.id.btnGear)

        //Data
        if(itemsNames.isEmpty()) {
            itemNames.add("Tent")
            categories.add("shelter")
            quantities.add("1")
            comments.add("4-person waterproof tent")

            itemNames.add("Marshmallows")
            categories.add("food")
            quantities.add("4")
            comments.add("For S'mores(Mega Size")

            itemNames.add("Flashlight")
            categories.add("Safety")
            quantities.add("4")
            comments.add("Check Batteries")

        }

    }

}