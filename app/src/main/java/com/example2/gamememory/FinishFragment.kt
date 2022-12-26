package com.example2.gamememory

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example2.gamememory.databinding.FragmentFinishBinding


class FinishFragment : Fragment() {
lateinit var binding: FragmentFinishBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
     binding = FragmentFinishBinding.inflate(layoutInflater)
     indexGo = 2


        binding.button2.setOnClickListener {

            (requireContext() as MainActivity).navController.navigate(R.id.action_finishFragment_to_mainFragment)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding.TVsecond.text = if(timer.second>60){
            (timer.second/60).toString() +"."+(timer.second % 60).toShort()+" min"

        }else{
            timer.second.toString()+" sec"
        }
        timer.stop()
       return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        timer.stop()
    }
    
}