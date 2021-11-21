package com.example.develapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Llama la función
        variablesyConstantes()




    }

    private fun variablesyConstantes(){
    //Bloque de variables

        var mensajeBienvenida = "Proyecto DevelAPPS"
        println(mensajeBienvenida)
    }
}