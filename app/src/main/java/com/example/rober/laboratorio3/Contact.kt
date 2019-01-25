package com.example.rober.laboratorio3

import android.app.Application

class Contact : Application() {

    companion object {

        private var contacts : ArrayList<String> = ArrayList()

        fun add(element : String) {
            this.contacts.add(element)
        }

        fun del(index : Int) {
            this.contacts.removeAt(index)
        }

        fun getitem(index : Int): String {
            return this.contacts.get(index)
        }
        fun getList() : ArrayList<String> {
            return contacts
        }

    }
}