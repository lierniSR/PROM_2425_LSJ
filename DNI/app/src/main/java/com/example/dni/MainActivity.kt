package com.example.dni

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    var textoValidacion: TextView? = null
    var textInputLayoutNumero: TextInputLayout? = null
    var textInputLayoutLetra: TextInputLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        textInputLayoutLetra = findViewById(R.id.labelLetra)
        textInputLayoutNumero = findViewById(R.id.textNumeroDNI)
        textoValidacion = findViewById(R.id.textoValidacion)
    }
    fun validar(view : View){
        val valorNumero = textInputLayoutNumero?.editText?.text.toString().toInt()
        val valorLetra = textInputLayoutLetra?.editText?.text.toString()
        val letraCalculada = letraDNI(valorNumero % 23)
        if (letraCalculada == valorLetra) {
            textoValidacion?.text = "DNI OK"
        } else {
            textoValidacion?.text = "DNI NO OK"
        }

    }

    fun letraDNI(numero: Int): String {
        val arrayLetras = arrayOf("T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E")
        return arrayLetras[numero]
    }
}