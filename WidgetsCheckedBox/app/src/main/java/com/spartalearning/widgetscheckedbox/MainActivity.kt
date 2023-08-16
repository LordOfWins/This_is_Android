package com.spartalearning.widgetscheckedbox

import android.os.Bundle
import android.util.Log
import android.widget.CompoundButton
import androidx.appcompat.app.AppCompatActivity
import com.spartalearning.widgetscheckedbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val checkBox by lazy {
        CompoundButton.OnCheckedChangeListener { compoundButton, isChecked ->
            when (compoundButton.id) {
                R.id.checkBox -> if (isChecked) Log.d(
                    "MainActivity",
                    "checkBox is checked"
                ) else Log.d("MainActivity", "checkBox is unchecked")

                R.id.checkBox2 -> if (isChecked) Log.d(
                    "MainActivity",
                    "checkBox2 is checked"
                ) else Log.d("MainActivity", "checkBox2 is unchecked")

                R.id.checkBox3 -> if (isChecked) Log.d(
                    "MainActivity",
                    "checkBox3 is checked"
                ) else Log.d("MainActivity", "checkBox3 is unchecked")
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.checkBox.setOnCheckedChangeListener(checkBox)
        binding.checkBox2.setOnCheckedChangeListener(checkBox)
        binding.checkBox3.setOnCheckedChangeListener(checkBox)
    }


}