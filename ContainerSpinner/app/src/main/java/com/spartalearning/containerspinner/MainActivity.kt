package com.spartalearning.containerspinner

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.spartalearning.containerspinner.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val data = listOf("- 선택하세요 -", "1월", "2월", "3월", "4월", "5월", "6월")
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data)
        binding.spinner.adapter = adapter
        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                binding.result.text = data.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {}
        }
    }
}