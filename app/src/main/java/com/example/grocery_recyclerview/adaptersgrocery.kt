package com.example.grocery_recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class adaptersgrocery(val context: Context, private val itemList:ArrayList<values>)
    : RecyclerView.Adapter<adaptersgrocery.MyViewHolder>() {

        inner class MyViewHolder(itemView: View)
            :RecyclerView.ViewHolder(itemView){

                var itemImg: ImageView = itemView.findViewById(R.id.imageView2)
                var itemTitle: TextView = itemView.findViewById(R.id.textView)

              init {
                  itemView.setOnClickListener(){
                      Toast.makeText(itemView.context, "you seleted : ${itemList[adapterPosition].text}", Toast.LENGTH_SHORT).show()
                  }
              }
            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_inflater, parent, false)

        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return  itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemImg.setImageResource(itemList[position].images)
        holder.itemTitle.setText(itemList[position].text)

    }
}