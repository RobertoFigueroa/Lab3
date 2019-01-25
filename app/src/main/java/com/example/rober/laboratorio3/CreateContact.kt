package com.example.rober.laboratorio3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_create_contact.*
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_create_contact.view.*


class CreateContact : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_contact)

        crear_cont.setOnClickListener {
            val editText = findViewById<EditText>(R.id.name)
            var message = editText.text.toString()
            val editText2 = findViewById<EditText>(R.id.phone)
            message += "-${editText2.text.toString()}"
            val editText3 = findViewById<EditText>(R.id.mail)
            message += "+${editText3.text.toString()}"
            Contact.add(message)
            val intent = Intent(this,MainActivity::class.java)
            Toast.makeText(this, "Se a creado un nuevo contacto!", Toast.LENGTH_SHORT).show()
            startActivity(intent)

        }
        back.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }


    }

