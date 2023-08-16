package com.spartalearning.widgetimagebutton

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.spartalearning.widgetimagebutton.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.radioGroup.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.radioButton -> Log.d("radioButton", "radioButton")
                R.id.radioButton2 -> Log.d("radioButton2", "radioButton2")
                R.id.radioButton3 -> Log.d("radioButton3", "radioButton3")
            }
        }
    }
}