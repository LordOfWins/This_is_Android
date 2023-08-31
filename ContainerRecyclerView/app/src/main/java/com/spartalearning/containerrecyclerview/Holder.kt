package com.spartalearning.containerrecyclerview

import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.spartalearning.containerrecyclerview.databinding.ItemRecyclerBinding
import java.text.SimpleDateFormat

// 바인딩은 어댑터에서 생성한 후 넘겨주는데 어댑터에서 사용할 레이아웃 이름이 item_recycler.xml이므로 ItemRecyclerBinding으로 생성한다.
class Holder(val binding: ItemRecyclerBinding) : RecyclerView.ViewHolder(binding.root) {
    init {
        binding.root.setOnClickListener {
            Toast.makeText(
                binding.root.context, "클릭된 아이템=${binding.textTitle.text}", Toast
                    .LENGTH_SHORT
            ).show()
        }
    }
    
    fun setMemo(memo: Memo) {
        binding.textNo.text = "${memo.no}"
        binding.textTitle.text = memo.title
        val sdf = SimpleDateFormat("yyyy/MM/dd")
        val formattedDate = sdf.format(memo.timestamp)
        binding.textDate.text = formattedDate
    }
}