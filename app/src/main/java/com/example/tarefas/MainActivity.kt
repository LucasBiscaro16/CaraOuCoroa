package com.example.tarefas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lista.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


           image_jogar.setOnClickListener {
               val intent = Intent(this.applicationContext,lista_view::class.java)

               startActivity(intent)
           }
        }
    }



