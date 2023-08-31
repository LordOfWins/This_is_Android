package com.spartalearning.containerrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.spartalearning.containerrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        
        val data = loadData()
        val adapter = CustomAdapter()
        adapter.listData = data
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
    }
    fun loadData() : MutableList<Memo> {
        val data:MutableList<Memo> = mutableListOf()
        for (no in 1..100) {
            val title = "메모 ${no}"
            val timestamp = System.currentTimeMillis()
            val memo = Memo(no, title, timestamp)
            data.add(memo)
        }
        return data
    }
}