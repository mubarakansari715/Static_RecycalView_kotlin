package com.example.static_recycalview_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.main_recycalView)

        val emplist: MutableList<ModelClass> = mutableListOf()
        emplist.add(ModelClass("mubarak@gmail.com", "9994824"))
        emplist.add(ModelClass("happy@gmail.com", "8866299"))
        emplist.add(ModelClass("mubarak@gmail.com", "999208484"))
        emplist.add(ModelClass("happy@gmail.com", "88665199"))
        emplist.add(ModelClass("mubarak@gmail.com", "99208484"))
        emplist.add(ModelClass("happy@gmail.com", "88665299"))
        emplist.add(ModelClass("mubarak@gmail.com", "99988484"))
        emplist.add(ModelClass("happy@gmail.com", "88665299"))
        emplist.add(ModelClass("mubarak@gmail.com", "995208484"))
        emplist.add(ModelClass("happy@gmail.com", "88665899"))
        emplist.add(ModelClass("mubarak@gmail.com", "999208484"))
        emplist.add(ModelClass("happy@gmail.com", "886687199"))
        emplist.add(ModelClass("mubarak@gmail.com", "99982484"))
        emplist.add(ModelClass("happy@gmail.com", "88665899"))

        recyclerView.adapter = MyAdapter(emplist)
        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}