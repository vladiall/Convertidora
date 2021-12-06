package com.example.nuevaconvertidoradosactivitykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.nuevaconvertidoradosactivitykotlin.R
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun convertCurrency(view: View?) {
        val cantidad_pesos = findViewById<EditText>(R.id.cantidad_pesos)
        val cambio = "0.00116"
        val mostrar = findViewById<TextView>(R.id.mostrar)
        if (cantidad_pesos.text.toString() != "") {
            val euroValue = cantidad_pesos.text.toString().toFloat() * cambio.toFloat()
            mostrar.text = euroValue.toString() + ""
        } else {
            mostrar.setText(R.string.Sin_Valor)
        }
    }
}