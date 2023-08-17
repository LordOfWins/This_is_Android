package com.spartalearning.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.spartalearning.activity.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {

    private val binding by lazy { ActivitySubBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.to1.text = intent.getStringExtra("from1")
        binding.to2.text = intent.getIntExtra("from2", 0).toString()

        binding.button.setOnClickListener {
            val returnIntent = intent //돌려줄 대는 대상 저장 x
            returnIntent.putExtra("return1", binding.editTextText.text.toString())
            setResult(RESULT_OK, returnIntent)
            finish()
        }
    }
}