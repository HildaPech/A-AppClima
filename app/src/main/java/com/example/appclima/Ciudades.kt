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
        val bShanghai = findViewById<Button>(R.id.bShanghai)

        bFCP.setOnClickListener(View.OnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(TAG, "3527639")
            startActivity(intent)
        })
        bChetumal.setOnClickListener(View.OnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(TAG, "3531023")
            startActivity(intent)
        })
        bTulum.setOnClickListener(View.OnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(TAG, "3515040")
            startActivity(intent)
        })
        bCozumel.setOnClickListener(View.OnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(TAG, "3530103")
            startActivity(intent)
        })
        bShanghai.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "1796236")
            startActivity(intent)
        })
    }
}