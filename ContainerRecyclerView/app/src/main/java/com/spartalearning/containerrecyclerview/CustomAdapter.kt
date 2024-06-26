package com.spartalearning.containerrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.spartalearning.containerrecyclerview.databinding.ItemRecyclerBinding

class CustomAdapter : RecyclerView.Adapter<Holder>() {
    var listData = mutableListOf<Memo>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding =
            ItemRecyclerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }
    
    override fun onBindViewHolder(holder: Holder, position: Int) {
        val memo = listData.get(position)
        holder.setMemo(memo)
    }
    
    override fun getItemCount(): Int {
        return listData.size
    }
    
}

