package com.example.develapps

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.item_ciudad.view.*


class CiudadAdapter(private val mContext: Context, private val listaCiudades:List<LugaresTuristicos>) : ArrayAdapter <LugaresTuristicos>(mContext,0 ,listaCiudades) {
    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layout = LayoutInflater.from(mContext).inflate(R.layout.item_ciudad,parent,false)


        val lugares = listaCiudades[position]

        layout.nom.text = lugares.nombreJ
        layout.descripcionC.text = lugares.descripcionJ
        layout.temperaturaC.text = lugares.temperaturaJ.toString()
        layout.imageC.setImageResource(lugares.imagenJ)

        return layout

    }

}