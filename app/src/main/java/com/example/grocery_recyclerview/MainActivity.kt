package com.example.grocery_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycle: RecyclerView = findViewById(R.id.recyclerView)
        recycle.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        var groceryItems: ArrayList<values> = ArrayList()

        val v1 = groceryItems.add(values(R.drawable.brinjal, "Brinjal"))
        val v2 = groceryItems.add(values(R.drawable.cucumber, "Cucumber"))
        val v3 = groceryItems.add(values(R.drawable.omato, "Tomato"))
        val v4 = groceryItems.add(values(R.drawable.onion, "Onion"))
        val v5 = groceryItems.add(values(R.drawable.brinjal, "Brinjal"))
        val v6 = groceryItems.add(values(R.drawable.cucumber, "Cucumber"))
        val v7 = groceryItems.add(values(R.drawable.omato, "Tomato"))
        val v8 = groceryItems.add(values(R.drawable.onion, "Onion"))

        val adapter = adaptersgrocery(this, groceryItems)
        recycle.adapter = adapter



    }
}