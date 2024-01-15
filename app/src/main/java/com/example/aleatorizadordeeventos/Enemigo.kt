package com.example.aleatorizadordeeventos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import java.util.Random

class Enemigo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enemigo)
        val huir: Button = findViewById(R.id.button)
        val luchar: Button = findViewById(R.id.button2)
        huir.setOnClickListener{
            var intent = Intent(this@Enemigo, MainActivity::class.java)
            startActivity(intent)
        }
        luchar.setOnClickListener{
            var intent = Intent(this@Enemigo, Proximamente::class.java)
            startActivity(intent)
        }
    }
}