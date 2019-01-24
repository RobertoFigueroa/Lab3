package com.example.rober.laboratorio3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_create_contact.*
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_create_contact.view.*


class CreateContact : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_contact)

        crear_cont.setOnClickListener {
            val editText = findViewById(R.id.name) as EditText
            var message = editText.name.toString()
            val editText2 = findViewById(R.id.tel) as EditText
            message += " - $editText2 "
            val editText3 = findViewById(R.id.mail) as EditText
            message += " + $editText3"
            Contact.add(message)

        }
        back.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }


    }

