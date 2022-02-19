package com.example.appclima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var tvCiudad:TextView? = null
    var tvGrados:TextView? = null
    var tvEstatus:TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvCiudad = findViewById(R.id.tvCiudad)
        tvGrados = findViewById(R.id.tvGrados)
        tvEstatus = findViewById(R.id.tvEstatus)


        val ciudad = intent.getStringExtra("com.example.appclima.ciudades.CIUDAD")


        val ciudadfcp = Ciudad("Ciudad de Felipe Carrillo Puerto", 27, "Soleado")
        val ciudadchetumal = Ciudad("Ciudad de Chetumal", 29, "Parcialmente nublado")
        val ciudadtulum = Ciudad("Ciudad de Tulum", 23, "Soleado")
        val ciudadcozumel = Ciudad("Ciudad de Cozumel", 28, "Nublado")

        if(ciudad == "Ciudad-FCP"){
            //mostrar información ciudadfcp
            tvCiudad?.text = ciudadfcp.nombre
            tvGrados?.text = ciudadfcp.grados.toString()+"°"
            tvEstatus?.text = ciudadfcp.estatus

        }else if(ciudad == "Ciudad-Chetumal"){
            //mostrar información ciudadchetumal
            tvCiudad?.text = ciudadchetumal.nombre
            tvGrados?.text = ciudadchetumal.grados.toString()+"°"
            tvEstatus?.text = ciudadchetumal.estatus

        }else if(ciudad == "Ciudad-Tulum"){
            //mostrar información ciudadtulum
            tvCiudad?.text = ciudadtulum.nombre
            tvGrados?.text = ciudadtulum.grados.toString()+"°"
            tvEstatus?.text = ciudadtulum.estatus

        }else if(ciudad == "Ciudad-Cozumel"){
            //mostrar información ciudadcozumel
            tvCiudad?.text = ciudadcozumel.nombre
            tvGrados?.text = ciudadcozumel.grados.toString()+"°"
            tvEstatus?.text = ciudadcozumel.estatus

        }else{
            Toast.makeText(this, "No se encuentra la información",  Toast.LENGTH_SHORT).show()
        }
    }
}