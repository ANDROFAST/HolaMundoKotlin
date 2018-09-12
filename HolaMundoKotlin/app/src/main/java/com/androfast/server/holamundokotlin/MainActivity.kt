package com.androfast.server.holamundokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nombre : TextView
        nombre = findViewById(R.id.txtSaludo);
        nombre.setText("Hola Mundo - Kotlin");

    }
}
