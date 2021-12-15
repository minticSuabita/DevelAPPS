package com.example.develapps

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val Bogota = LugaresTuristicos(nombreJ = "Bogotá", descripcionJ = "Ciudad Capital de Colombia - Elevation: 2,640m  Temperatura 13°C ", temperaturaJ = 20.0,R.drawable.bogota)
        val Bucaramanga = LugaresTuristicos(nombreJ = "Bucaramanga", descripcionJ = "Ciudad Bonita - Elevation: 959m  Temperatura 22°C", temperaturaJ = 2.8,R.drawable.bucaramanga)
        val Cartagena = LugaresTuristicos(nombreJ = "Cartagena", descripcionJ = "Ciudad Bonita - Elevation: 2m Temperatura 27°C", temperaturaJ = 2.8,R.drawable.cartagena)
        val Medellin = LugaresTuristicos(nombreJ = "Medellin", descripcionJ = "Ciudad de la eterna primavera - Elevation: 1,495m Temperatura 27°C", temperaturaJ = 2.8,R.drawable.medellin)




        val listaCiudades = listOf(Bogota,Bucaramanga,Cartagena,Medellin)

        val adapter=CiudadAdapter(mContext = this, listaCiudades)

        val lista = findViewById<ListView>(R.id.lista)

        lista.adapter=adapter

        //Llama la función
        //variablesyConstantes()





    }

}