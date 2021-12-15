package com.example.develapps

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val lugares = LugaresTuristicos(nombreJ = "Bogotá", descripcionJ = "Ciudad Capital", temperaturaJ = 20.0,R.drawable.bogota)
        val lugares2 = LugaresTuristicos(nombreJ = "Bucaramanga", descripcionJ = "Ciudad Bonita", temperaturaJ = 2.8,R.drawable.bogota)

        val listaCiudades = listOf(lugares,lugares2)

        val adapter=CiudadAdapter(mContext = this, listaCiudades)

        val lista = findViewById<ListView>(R.id.lista)

        lista.adapter=adapter

        //Llama la función
        //variablesyConstantes()





    }

}