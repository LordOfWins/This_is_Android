package com.spartalearning.fragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.spartalearning.fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) } // 바인딩 추가
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        
        setFragment()
        binding.btnSend.setOnClickListener {
            listFragment.setValue("전닳할 값")
        }
    }
    
    private lateinit var listFragment: ListFragment
    
    fun setFragment() {
        listFragment = ListFragment()
        val bundle = Bundle()
        bundle.putString("key", "value")
        bundle.putInt("key2", 20210101)
        listFragment.arguments = bundle
        
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.framelayout, listFragment)
        transaction.commit()
    }
    
    fun goDetail() {
        val detailFragment = DetailFragment()
        
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.framelayout, detailFragment)
        transaction.addToBackStack("detail")
        transaction.commit()
    }
    
    fun goBack() {
        onBackPressed()
    }
}