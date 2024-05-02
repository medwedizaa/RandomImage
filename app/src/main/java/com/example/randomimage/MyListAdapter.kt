package com.example.randomimage


import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MyListAdapter: RecyclerView.Adapter<MyListAdapter.MyViewHolder>() {

    private var myData: List<String> = listOf()

    fun setList(list: List<String>) {
        myData = list
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return myData.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    class MyViewHolder(): ViewHolder() {

    }
}