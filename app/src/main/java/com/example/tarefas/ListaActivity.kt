package com.example.tarefas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_lista.*
import kotlin.random.Random

class ListaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)

        fun rand(): Int {
            val numero = Random.nextInt(2)
            return numero
        }

        fun SortearMoeda(view: View) {
            iv0.visibility = View.VISIBLE
            iv1.visibility = View.VISIBLE
            iv2.visibility = View.VISIBLE
            val sort1 = rand()
            val sort2 = rand()
            val sort3 = rand()
            if (sort1 == 0) {
                iv0.setImageResource(R.drawable.moeda_cara)
                jogada_um.setText("Deu Cara")
            } else {
                iv0.setImageResource(R.drawable.moeda_coroa)
                jogada_um.setText("Deu Coroa")
            }
            if (sort2 == 0) {
                iv1.setImageResource(R.drawable.moeda_cara)
                jogada_dois.setText("Deu Cara")
            } else {
                iv1.setImageResource(R.drawable.moeda_coroa)
                jogada_dois.setText("Deu Coroa")
            }
            if (sort3 == 0) {
                iv2.setImageResource(R.drawable.moeda_cara)
                jogada_tres.setText("Deu Cara")
            } else {
                iv2.setImageResource(R.drawable.moeda_coroa)
                jogada_tres.setText("Deu Coroa")
            }
        }




            button_voltar.setOnClickListener {
                finish()
            }

        }
    }

