package com.example.zad8_osh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class collection_screen : AppCompatActivity() {val list: List<String> = emptyList()
    var ar = arrayOf("фильм1","фильм2","фильм3","фильм4")

    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_collection_screen)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CustomRecyclerAdapter(fillList())
        recyclerView.adapter = CustomRecyclerAdapter(getCatList())
        ar = append(ar,"фильмX")
        recyclerView.adapter = CustomRecyclerAdapter(ar.toList())
    }

    private fun fillList(): List<String> {
        val data = mutableListOf<String>()
        (0..30).forEach { i -> data.add("$i element") }
        return data
    }

    private fun getCatList(): List<String> {
        return this.resources.getStringArray(R.array.film_names).toList()
    }

    fun addFilm(view: View) {
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CustomRecyclerAdapter(fillList())
        recyclerView.adapter = CustomRecyclerAdapter(getCatList())
        ar = append(ar,"фильмX")
        recyclerView.adapter = CustomRecyclerAdapter(ar.toList())
    }
    fun append(arr: Array<String>, element: String): Array<String> {
        val list: MutableList<String> = arr.toMutableList()
        list.add(element)
        return list.toTypedArray()
    }
}