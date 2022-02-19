package com.example.appclima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class Ciudades : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudades)

        val bFCP = findViewById<Button>(R.id.bFCP)
        val bChetumal = findViewById<Button>(R.id.bChetumal)
        val bTulum = findViewById<Button>(R.id.bTulum)
        val bCozumel = findViewById<Button>(R.id.bCozumel)

        bFCP.setOnClickListener(View.OnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        })
        bChetumal.setOnClickListener(View.OnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        })
        bTulum.setOnClickListener(View.OnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        })
        bCozumel.setOnClickListener(View.OnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        })
    }
}