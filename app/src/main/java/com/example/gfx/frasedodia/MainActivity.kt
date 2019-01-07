package com.example.gfx.frasedodia

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    private  lateinit var btnGerarFrase : Button
    private lateinit var txtFrase: TextView
    private val frases = arrayOf("Teste de Kotlin", "Teste de Kotlin 2", "Teste de Kotlin 3", "Teste de Kotlin 5")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGerarFrase = findViewById(R.id.btnGerarFrase)
        txtFrase = findViewById(R.id.txtFrase)

        btnGerarFrase.setOnClickListener(View.OnClickListener {
            val totalItensArray = frases.size
            val rand = Random().nextInt(totalItensArray);

            txtFrase.setText(frases[rand])
        })
    }
}
