package com.spartalearning.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.spartalearning.fragment.databinding.FragmentListBinding


class ListFragment : Fragment() {
    var mainActivity: MainActivity? = null
    
    lateinit var binding: FragmentListBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentListBinding.inflate(inflater, container, false)
        binding.btnNext.setOnClickListener {
            mainActivity?.goDetail()
        }
        binding.textTitle.text = arguments?.getString("key")
        binding.textValue.text = arguments?.getInt("key2").toString()
        return binding.root
    }
    
    fun setValue(value: String) {
        Log.d("값", value)
        binding.textFromActivity.text = value
    }
    
    
    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is MainActivity) {
            mainActivity = context
        }
    }
}