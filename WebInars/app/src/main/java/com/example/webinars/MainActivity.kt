package com.example.webinars

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var example:String //Para que se inizialize mas tarde, pero si no se asigna ningun valor app da error
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test()
        testSimp()
    }
    //Metodos:
    //Se puede asignar valor a la variable que se recoge en el metodo
    //Fuera de los parentesis que objeto devuelve
    fun test(saludo:String = "hola"){
        //Mejor poner de que tipo es la val: no se puede cambiar valor
        //Var se puede cambiar valor
        //Listas;
        //Asi no te va a dejar añadir mas elementos
        val list = listOf<String>("val1", saludo)
        //Con lista mutable si puedes añadir mas elementos
        //Se pone en val porque no se crea otra lista, los cambios se hacen en mutableListOf no en listMutable, esta val va a apuntar siempre al mismo mutableListOf
        val listMutable = mutableListOf<String>("val1", saludo)
        listMutable.add("Pureba")
        //Asignar al var example
        example = "HolaLateInit"
    }

    //Metodo simplificado
    fun testSimp(name:String = "desconocido") = "hola, $name"
}