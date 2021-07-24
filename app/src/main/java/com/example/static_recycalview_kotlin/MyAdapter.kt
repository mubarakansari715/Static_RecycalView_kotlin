package com.example.static_recycalview_kotlin

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val email: List<ModelClass>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val infilter = LayoutInflater.from(parent.context)
        val view = infilter.inflate(R.layout.item_view, parent, false)
        return MyViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.email.text = "Email : " + email[position].email
        holder.mobile.text = "Mobile : " + email[position].mobile
    }

    override fun getItemCount(): Int {
        return email.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var email: TextView = itemView.findViewById(R.id.tv_email)
        var mobile: TextView = itemView.findViewById(R.id.tv_mobile)
    }
}
