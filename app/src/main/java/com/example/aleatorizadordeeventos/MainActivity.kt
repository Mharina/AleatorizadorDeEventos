package com.example.aleatorizadordeeventos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dado: ImageButton = findViewById(R.id.imageButton)

        dado.setOnClickListener{
            var ale = Random()
            var num = ale.nextInt(4)
            when(num){
                0 -> {
                    var intent = Intent(this@MainActivity, Ciudad::class.java)
                    startActivity(intent)
                }
                1 -> {
                    var intent = Intent(this@MainActivity, Enemigo::class.java)
                    startActivity(intent)
                }
                2 -> {
                    var intent = Intent(this@MainActivity, Mercader::class.java)
                    startActivity(intent)
                }
                3 -> {
                    var intent = Intent(this@MainActivity, Objeto::class.java)
                    startActivity(intent)
                }
            }
            //startActivity(intent)
        }
    }
}