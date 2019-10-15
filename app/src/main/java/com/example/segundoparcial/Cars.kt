package com.example.segundoparcial

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_cars.*

class Cars : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cars)
        val sharedPreferences = getSharedPreferences("MINIBD", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        var cars = sharedPreferences.getString("cars", "")
        editCars.setText(cars);
        btnSaveCars.setOnClickListener{
            editor.putString("cars", editCars.text.toString())
            editor.commit()
            Toast.makeText(this,"Your cars have been saved!", Toast.LENGTH_LONG).show()
        }
    }
}
