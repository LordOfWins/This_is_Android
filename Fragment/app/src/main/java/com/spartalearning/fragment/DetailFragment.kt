package com.spartalearning.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.spartalearning.fragment.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {
    lateinit var mainActivity: MainActivity
    override fun onAttach(context: Context) {
        super.onAttach(context)
        mainActivity = context as MainActivity
    }
    
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentDetailBinding.inflate(inflater, container, false)
        binding.btnBack.setOnClickListener {
            Log.d("버튼", "버튼 클릭")
            mainActivity.goBack()
        }
        return binding.root
    }
}