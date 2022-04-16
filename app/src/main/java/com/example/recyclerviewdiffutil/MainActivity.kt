package com.example.recyclerviewdiffutil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = ArrayList<ItemModel>()
        val adapter = Adapter()

        var  i = 0
        while (i < 50) {
            list.add(ItemModel(R.drawable.tree,"Item name $i",""))
            i++
        }
        item_rv.layoutManager = LinearLayoutManager(this)
        adapter.differ.submitList(list)
        item_rv.adapter = adapter

    }
}