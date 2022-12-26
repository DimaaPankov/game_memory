package com.example2.gamememory

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example2.gamememory.databinding.FragmentGameBinding



class GameFragment : Fragment() {

    val anim = AnimationSlots(IndexFargment.FRAGMENT)
    private val args: GameFragmentArgs by navArgs()
    private var textG = mutableListOf<String>()



    lateinit var binding: FragmentGameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentGameBinding.inflate(layoutInflater)
        anim.init(requireContext())
            textG.add(args.list.get(0))
            textG.add(args.list.get(1))
            textG.add(args.list.get(0))
            textG.add(args.list.get(1))
            textG = ramdommCollections(textG.toTypedArray()).toMutableList()


        Handler(Looper.getMainLooper()).postDelayed({
            timer.start()
        },3000)




        binding.TVslot1.text = textG.get(0)
        binding.TVslot2.text = textG.get(1)
        binding.TVslot3.text = textG.get(2)
        binding.TVslot4.text = textG.get(3)

        Handler(Looper.getMainLooper()).postDelayed({

            binding.TVslot11.setOnClickListener {
                    anim.openToCloseCard(binding.TVslot1, binding.TVslot11, 2 )
                }

            binding.TVslot22.setOnClickListener {
                    anim.openToCloseCard(binding.TVslot2, binding.TVslot22,  2 )
            }

            binding.TVslot33.setOnClickListener {
                   anim.openToCloseCard(binding.TVslot3, binding.TVslot33,  2 )
            }

            binding.TVslot44.setOnClickListener {
                    anim.openToCloseCard(binding.TVslot4, binding.TVslot44, 2 )
            }
        }, 3000)

        indexGo = 1
        indexFragment = 0
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return binding.root

    }



    }






