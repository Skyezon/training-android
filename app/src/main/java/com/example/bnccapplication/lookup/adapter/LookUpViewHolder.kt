package com.example.bnccapplication.lookup.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.bnccapplication.lookup.LookUpData
import kotlinx.android.synthetic.main.cardview_recycler_component.view.*

class LookUpViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView){
    fun bind(data: LookUpData){
        itemView.tvProvinceName.text = data.provinceName
        itemView.tvTotalCase.text = data.totalCase.toString()
        itemView.tvDeathCase.text = data.deathCase.toString()
        itemView.tvRecoveredCase.text = data.recoverdCase.toString()
    }
}