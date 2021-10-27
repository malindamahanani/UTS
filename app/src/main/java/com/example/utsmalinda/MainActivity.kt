package com.example.utsmalinda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun submit_btn(view: View) {
        val namaEditText = findViewById<EditText>(R.id.kalimat)
        val namaEditText2 = findViewById<EditText>(R.id.kata)
        val kata = namaEditText2.text.toString()
        val kalimat = namaEditText.text.toString()
        val kalimat1 = "ini kalimat 1 : ".toString()
        val kalimat2 = "ini kalimat 2 : ".toString()

        val  toast = Toast.makeText(applicationContext, kalimat1 + kalimat , Toast.LENGTH_SHORT)
        val toast2 = Toast.makeText(applicationContext, kalimat2 + kata , Toast.LENGTH_SHORT)
        toast.show()
        toast2.show()
    }
}