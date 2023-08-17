package com.spartalearning.activity

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.spartalearning.activity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val activityResult =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
                if (it.resultCode == RESULT_OK) {
                    val message = it.data?.getStringExtra("return1")
                    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
                }
            }

        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        binding.buttonSub.setOnClickListener {
            activityResult.launch(intent)
        }
    }
}