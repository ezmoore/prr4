package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var imageButton: ImageButton = findViewById(R.id.imageButton6)
        imageButton.scaleType=ImageView.ScaleType.CENTER_INSIDE
        imageButton.adjustViewBounds=true
        var editText: EditText = findViewById(R.id.editTextText2)
        imageButton.setOnClickListener {
            val nastr = editText.text.toString()
            if(nastr == "good")
            {
                imageButton.setImageResource(R.drawable.horosh)
            }
            else if (nastr == "bad") {
                imageButton.setImageResource(R.drawable.ploh)
            }
            else if (nastr == "neutral")
            {
                imageButton.setImageResource(R.drawable.neit)
            }
            else{
                Toast.makeText(this,"Invalid mood", Toast.LENGTH_SHORT).show()
            }
        }
    }
}