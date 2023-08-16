package com.spartalearning.widgetsprogressbar

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.spartalearning.widgetsprogressbar.databinding.ActivityMainBinding
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        thread(start = true) {
            showProgress(true)
            Thread.sleep(3000)
            runOnUiThread {
                showProgress(false)
            }
        }
    }

    private fun showProgress(show: Boolean) {
        binding.progressBar.visibility = if (show) {
            View.VISIBLE
        } else {
            View.GONE
        }
    }

}