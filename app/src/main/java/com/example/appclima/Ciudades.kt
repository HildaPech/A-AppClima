package com.example.appclima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class Ciudades : AppCompatActivity() {
    val TAG="com.example.appclima.ciudades.CIUDAD"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudades)

        val bFCP = findViewById<Button>(R.id.bFCP)
        val bChetumal = findViewById<Button>(R.id.bChetumal)
        val bTulum = findViewById<Button>(R.id.bTulum)
        val bCozumel = findViewById<Button>(R.id.bCozumel)

        bFCP.setOnClickListener(View.OnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(TAG, "Ciudad-FCP")
            startActivity(intent)
        })
        bChetumal.setOnClickListener(View.OnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(TAG, "Ciudad-Chetumal")
            startActivity(intent)
        })
        bTulum.setOnClickListener(View.OnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(TAG, "Ciudad-Tulum")
            startActivity(intent)
        })
        bCozumel.setOnClickListener(View.OnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(TAG, "Ciudad-Cozumel")
            startActivity(intent)
        })
    }
}