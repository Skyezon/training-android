package com.example.bnccapplication.lookup.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bnccapplication.R
import com.example.bnccapplication.lookup.LookUpData

class LookUpAdapter (private  val kumpulanData: MutableList<LookUpData>) : RecyclerView.Adapter<LookUpViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LookUpViewHolder {
        return LookUpViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.cardview_recycler_component,parent,false)
        )
    }

    override fun onBindViewHolder(holder: LookUpViewHolder, position: Int) {
        holder.bind(kumpulanData[position])
    }

    override fun getItemCount(): Int {
        return kumpulanData.size
    }

}