package com.example.webinars

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var example:String //Para que se inizialize mas tarde, pero si no se asigna ningun valor app da error
    lateinit var buttonAniadirTarea:Button
    lateinit var editTextTarea: EditText
    lateinit var listadoTareas: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //test()
        //testSimp()
        initUi()
    }
    private fun initUi() {
        initView()
        initListeners()
    }

    private fun initListeners() {
        buttonAniadirTarea.setOnClickListener {
            addTask()
        }
    }

    private fun addTask() {
        val tareaAniadir:String = editTextTarea.text.toString()
    }

    private fun initView() {
        buttonAniadirTarea = findViewById(R.id.buttonAniadirTarea)
        editTextTarea = findViewById(R.id.editTextTarea)
        listadoTareas = findViewById(R.id.listadoTareas)
    }
    /*
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
    */
    /*
    //Metodo simplificado
    fun testSimp(name:String = "desconocido") = "hola, $name"

    //Para los casos que pueden ser nulos añadir al Objeto ? signo
    var name:String? = null
    fun nulabilidad(){
        name = "aris"
    }
    //Aqui decimos que si name no es nulo ejecuta length
    //Condicion Elvis, este hace que si name es nulo me retornes el numero 4 Elvis--> ?:
    //Si estamos seguros de que la variable no es nula se puede poner !! para que lo acepte, pero si es nula dara error
    fun testNula():Int{
        return name?.length ?: 4
    }*/
}