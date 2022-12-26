package com.example2.gamememory

import android.animation.ObjectAnimator
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.fragment.navArgs
import com.example2.gamememory.databinding.FragmentGameFragment8x8Binding
import com.example2.gamememory.text


class GameFragment8x8 : Fragment() {

    private val args: GameFragmentArgs by navArgs()
    private var textG = mutableListOf<String>()
    val anim = AnimationSlots(IndexFargment.FRAGMENT8X8)
    lateinit var binding: FragmentGameFragment8x8Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentGameFragment8x8Binding.inflate(layoutInflater)
        init()
        timer.start()
        anim.init(requireContext())

        indexFragment = 3

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root
    }



                    private fun init() {
                        if(indexGo == 2){

                            binding.TVslot1.text = text[0]
                            binding.TVslot2.text = text[1]
                            binding.TVslot3.text = text[2]
                            binding.TVslot4.text = text[3]
                            binding.TVslot5.text = text[4]
                            binding.TVslot6.text = text[5]
                            binding.TVslot7.text = text[6]
                            binding.TVslot8.text = text[7]
                            binding.TVslot9.text = text[8]
                            binding.TVslot10.text = text[9]
                            binding.TVslot11.text = text[10]
                            binding.TVslot12.text = text[11]
                            binding.TVslot13.text = text[12]
                            binding.TVslot14.text = text[13]
                            binding.TVslot15.text = text[14]
                            binding.TVslot16.text = text[15]

                            binding.TVslot1Q2.text = text[16]
                            binding.TVslot2Q2.text = text[17]
                            binding.TVslot3Q2.text = text[18]
                            binding.TVslot4Q2.text = text[19]
                            binding.TVslot5Q2.text = text[20]
                            binding.TVslot6Q2.text = text[21]
                            binding.TVslot7Q2.text = text[22]
                            binding.TVslot8Q2.text = text[23]
                            binding.TVslot9Q2.text = text[24]
                            binding.TVslot10Q2.text = text[25]
                            binding.TVslot11Q2.text = text[26]
                            binding.TVslot12Q2.text = text[27]
                            binding.TVslot13Q2.text = text[28]
                            binding.TVslot14Q2.text = text[29]
                            binding.TVslot15Q2.text = text[30]
                            binding.TVslot16Q2.text = text[31]

                            binding.TVslot1Q3.text = text[32]
                            binding.TVslot2Q3.text = text[33]
                            binding.TVslot3Q3.text = text[34]
                            binding.TVslot4Q3.text = text[35]
                            binding.TVslot5Q3.text = text[36]
                            binding.TVslot6Q3.text = text[37]
                            binding.TVslot7Q3.text = text[38]
                            binding.TVslot8Q3.text = text[39]
                            binding.TVslot9Q3.text = text[40]
                            binding.TVslot10Q3.text = text[41]
                            binding.TVslot11Q3.text = text[42]
                            binding.TVslot12Q3.text = text[43]
                            binding.TVslot13Q3.text = text[44]
                            binding.TVslot14Q3.text = text[45]
                            binding.TVslot15Q3.text = text[46]
                            binding.TVslot16Q3.text = text[47]

                            binding.TVslot14Q4.text = text[48]
                            binding.TVslot2Q4.text = text[49]
                            binding.TVslot3Q4.text = text[50]
                            binding.TVslot4Q4.text = text[51]
                            binding.TVslot5Q4.text = text[52]
                            binding.TVslot6Q4.text = text[53]
                            binding.TVslot7Q4.text = text[54]
                            binding.TVslot8Q4.text = text[55]
                            binding.TVslot9Q4.text = text[56]
                            binding.TVslot10Q4.text = text[57]
                            binding.TVslot11Q4.text = text[58]
                            binding.TVslot12Q4.text = text[59]
                            binding.TVslot13Q4.text = text[60]
                            binding.TVslot14Q4.text = text[61]
                            binding.TVslot15Q4.text = text[62]
                            binding.TVslot16Q4.text = text[63]

                        }else{
                            setFragmentResultListener("requestKey") { key, bundle ->

                                binding.TVslot1.text = bundle.getString("1")!!
                                binding.TVslot2.text = bundle.getString("2")!!
                                binding.TVslot3.text = bundle.getString("3")!!
                                binding.TVslot4.text = bundle.getString("4")!!
                                binding.TVslot5.text = bundle.getString("5")!!
                                binding.TVslot6.text = bundle.getString("6")!!
                                binding.TVslot7.text = bundle.getString("7")!!
                                binding.TVslot8.text = bundle.getString("8")!!
                                binding.TVslot9.text = bundle.getString("9")!!
                                binding.TVslot10.text = bundle.getString("10")!!
                                binding.TVslot11.text = bundle.getString("11")!!
                                binding.TVslot12.text = bundle.getString("12")!!
                                binding.TVslot13.text = bundle.getString("13")!!
                                binding.TVslot14.text = bundle.getString("14")!!
                                binding.TVslot15.text = bundle.getString("15")!!
                                binding.TVslot16.text = bundle.getString("16")!!

                                binding.TVslot1Q2.text = bundle.getString("17")!!
                                binding.TVslot2Q2.text = bundle.getString("18")!!
                                binding.TVslot3Q2.text = bundle.getString("19")!!
                                binding.TVslot4Q2.text = bundle.getString("20")!!
                                binding.TVslot5Q2.text = bundle.getString("21")!!
                                binding.TVslot6Q2.text = bundle.getString("22")!!
                                binding.TVslot7Q2.text = bundle.getString("23")!!
                                binding.TVslot8Q2.text = bundle.getString("24")!!
                                binding.TVslot9Q2.text = bundle.getString("25")!!
                                binding.TVslot10Q2.text = bundle.getString("26")!!
                                binding.TVslot11Q2.text = bundle.getString("27")!!
                                binding.TVslot12Q2.text = bundle.getString("28")!!
                                binding.TVslot13Q2.text = bundle.getString("29")!!
                                binding.TVslot14Q2.text = bundle.getString("30")!!
                                binding.TVslot15Q2.text = bundle.getString("31")!!
                                binding.TVslot16Q2.text = bundle.getString("32")!!

                                binding.TVslot1Q3.text = bundle.getString("1")!!
                                binding.TVslot2Q3.text = bundle.getString("2")!!
                                binding.TVslot3Q3.text = bundle.getString("3")!!
                                binding.TVslot4Q3.text = bundle.getString("4")!!
                                binding.TVslot5Q3.text = bundle.getString("5")!!
                                binding.TVslot6Q3.text = bundle.getString("6")!!
                                binding.TVslot7Q3.text = bundle.getString("7")!!
                                binding.TVslot8Q3.text = bundle.getString("8")!!
                                binding.TVslot9Q3.text = bundle.getString("9")!!
                                binding.TVslot10Q3.text = bundle.getString("10")!!
                                binding.TVslot11Q3.text = bundle.getString("11")!!
                                binding.TVslot12Q3.text = bundle.getString("12")!!
                                binding.TVslot13Q3.text = bundle.getString("13")!!
                                binding.TVslot14Q3.text = bundle.getString("14")!!
                                binding.TVslot15Q3.text = bundle.getString("15")!!
                                binding.TVslot16Q3.text = bundle.getString("16")!!

                                binding.TVslot14Q4.text = bundle.getString("17")!!
                                binding.TVslot2Q4.text = bundle.getString("18")!!
                                binding.TVslot3Q4.text = bundle.getString("19")!!
                                binding.TVslot4Q4.text = bundle.getString("20")!!
                                binding.TVslot5Q4.text = bundle.getString("21")!!
                                binding.TVslot6Q4.text = bundle.getString("22")!!
                                binding.TVslot7Q4.text = bundle.getString("23")!!
                                binding.TVslot8Q4.text = bundle.getString("24")!!
                                binding.TVslot9Q4.text = bundle.getString("25")!!
                                binding.TVslot10Q4.text = bundle.getString("26")!!
                                binding.TVslot11Q4.text = bundle.getString("27")!!
                                binding.TVslot12Q4.text = bundle.getString("28")!!
                                binding.TVslot13Q4.text = bundle.getString("29")!!
                                binding.TVslot14Q4.text = bundle.getString("30")!!
                                binding.TVslot15Q4.text = bundle.getString("31")!!
                                binding.TVslot16Q4.text = bundle.getString("32")!!

                                text.add(bundle.getString("1")!!)
                                text.add( bundle.getString("2")!!)
                                text.add(bundle.getString("3")!!)
                                text.add( bundle.getString("4")!!)
                                text.add( bundle.getString("5")!!)
                                text.add(bundle.getString("6")!!)
                                text.add(bundle.getString("7")!!)
                                text.add(bundle.getString("8")!!)
                                text.add( bundle.getString("9")!!)
                                text.add( bundle.getString("10")!!)
                                text.add( bundle.getString("11")!!)
                                text.add( bundle.getString("12")!!)
                                text.add( bundle.getString("13")!!)
                                text.add( bundle.getString("14")!!)
                                text.add( bundle.getString("15")!!)
                                text.add( bundle.getString("16")!!)

                                text.add(  bundle.getString("17")!!)
                                text.add( bundle.getString("18")!!)
                                text.add(bundle.getString("19")!!)
                                text.add(bundle.getString("20")!!)
                                text.add(bundle.getString("21")!!)
                                text.add(bundle.getString("22")!!)
                                text.add(bundle.getString("23")!!)
                                text.add(bundle.getString("24")!!)
                                text.add(bundle.getString("25")!!)
                                text.add(bundle.getString("26")!!)
                                text.add(bundle.getString("27")!!)
                                text.add(bundle.getString("28")!!)
                                text.add(bundle.getString("29")!!)
                                text.add( bundle.getString("30")!!)
                                text.add( bundle.getString("31")!!)
                                text.add(bundle.getString("32")!!)

                                text.add( bundle.getString("1")!!)
                                text.add(bundle.getString("2")!!)
                                text.add( bundle.getString("3")!!)
                                text.add( bundle.getString("4")!!)
                                text.add(bundle.getString("5")!!)
                                text.add(bundle.getString("6")!!)
                                text.add(bundle.getString("7")!!)
                                text.add(bundle.getString("8")!!)
                                text.add(bundle.getString("9")!!)
                                text.add(bundle.getString("10")!!)
                                text.add(bundle.getString("11")!!)
                                text.add(bundle.getString("12")!!)
                                text.add(bundle.getString("13")!!)
                                text.add(bundle.getString("14")!!)
                                text.add( bundle.getString("15")!!)
                                text.add( bundle.getString("16")!!)

                                text.add( bundle.getString("17")!!)
                                text.add(bundle.getString("18")!!)
                                text.add(bundle.getString("19")!!)
                                text.add( bundle.getString("20")!!)
                                text.add(bundle.getString("21")!!)
                                text.add(bundle.getString("22")!!)
                                text.add(bundle.getString("23")!!)
                                text.add(bundle.getString("24")!!)
                                text.add(bundle.getString("25")!!)
                                text.add( bundle.getString("26")!!)
                                text.add(bundle.getString("27")!!)
                                text.add(bundle.getString("28")!!)
                                text.add( bundle.getString("29")!!)
                                text.add( bundle.getString("30")!!)
                                text.add( bundle.getString("31")!!)
                                text.add( bundle.getString("32")!!)
                            }
                        }


                        Handler(Looper.getMainLooper()).postDelayed({
                            val animator0 = ObjectAnimator.ofFloat(binding.TVslot1, View.SCALE_Y, 0F);animator0.duration = 200;animator0.start()
                            val animator1 = ObjectAnimator.ofFloat(binding.TVslot2, View.SCALE_Y, 0F);animator1.duration = 200;animator1.start()
                            val animator2 = ObjectAnimator.ofFloat(binding.TVslot3, View.SCALE_Y, 0F);animator2.duration = 200;animator2.start()
                            val animator3 = ObjectAnimator.ofFloat(binding.TVslot4, View.SCALE_Y, 0F);animator3.duration = 200;animator3.start()
                            val animator4 = ObjectAnimator.ofFloat(binding.TVslot5, View.SCALE_Y, 0F);animator4.duration = 200;animator4.start()
                            val animator5 = ObjectAnimator.ofFloat(binding.TVslot6, View.SCALE_Y, 0F);animator5.duration = 200;animator5.start()
                            val animator6 = ObjectAnimator.ofFloat(binding.TVslot7, View.SCALE_Y, 0F);animator6.duration = 200;animator6.start()
                            val animator7 = ObjectAnimator.ofFloat(binding.TVslot8, View.SCALE_Y, 0F);animator7.duration = 200;animator7.start()
                            val animator8 = ObjectAnimator.ofFloat(binding.TVslot9, View.SCALE_Y, 0F);animator8.duration = 200;animator8.start()
                            val animator9 = ObjectAnimator.ofFloat(binding.TVslot10, View.SCALE_Y, 0F);animator9.duration = 200;animator9.start()
                            val animator10 = ObjectAnimator.ofFloat(binding.TVslot11, View.SCALE_Y, 0F);animator10.duration = 200;animator10.start()
                            val animator11 = ObjectAnimator.ofFloat(binding.TVslot12, View.SCALE_Y, 0F);animator11.duration = 200;animator11.start()
                            val animator12 = ObjectAnimator.ofFloat(binding.TVslot13, View.SCALE_Y, 0F);animator12.duration = 200;animator12.start()
                            val animator13 = ObjectAnimator.ofFloat(binding.TVslot14, View.SCALE_Y, 0F);animator13.duration = 200;animator13.start()
                            val animator14 = ObjectAnimator.ofFloat(binding.TVslot15, View.SCALE_Y, 0F);animator14.duration = 200;animator14.start()
                            val animator15 = ObjectAnimator.ofFloat(binding.TVslot16, View.SCALE_Y, 0F);animator15.duration = 200;animator15.start()

                            val animator0q2 = ObjectAnimator.ofFloat(binding.TVslot1Q2, View.SCALE_Y, 0F);animator0q2.duration = 200;animator0q2.start()
                            val animator1q2 = ObjectAnimator.ofFloat(binding.TVslot2Q2, View.SCALE_Y, 0F);animator1q2.duration = 200;animator1q2.start()
                            val animator2q2 = ObjectAnimator.ofFloat(binding.TVslot3Q2, View.SCALE_Y, 0F);animator2q2.duration = 200;animator2q2.start()
                            val animator3q2 = ObjectAnimator.ofFloat(binding.TVslot4Q2, View.SCALE_Y, 0F);animator3q2.duration = 200;animator3q2.start()
                            val animator4q2 = ObjectAnimator.ofFloat(binding.TVslot5Q2, View.SCALE_Y, 0F);animator4q2.duration = 200;animator4q2.start()
                            val animator5q2 = ObjectAnimator.ofFloat(binding.TVslot6Q2, View.SCALE_Y, 0F);animator5q2.duration = 200;animator5q2.start()
                            val animator6q2 = ObjectAnimator.ofFloat(binding.TVslot7Q2, View.SCALE_Y, 0F);animator6q2.duration = 200;animator6q2.start()
                            val animator7q2 = ObjectAnimator.ofFloat(binding.TVslot8Q2, View.SCALE_Y, 0F);animator7q2.duration = 200;animator7q2.start()
                            val animator8q2 = ObjectAnimator.ofFloat(binding.TVslot9Q2, View.SCALE_Y, 0F);animator8q2.duration = 200;animator8q2.start()
                            val animator9q2 = ObjectAnimator.ofFloat(binding.TVslot10Q2, View.SCALE_Y, 0F);animator9q2.duration = 200;animator9q2.start()
                            val animator10q2 = ObjectAnimator.ofFloat(binding.TVslot11Q2, View.SCALE_Y, 0F);animator10q2.duration = 200;animator10q2.start()
                            val animator11q2 = ObjectAnimator.ofFloat(binding.TVslot12Q2, View.SCALE_Y, 0F);animator11q2.duration = 200;animator11q2.start()
                            val animator12q2 = ObjectAnimator.ofFloat(binding.TVslot13Q2, View.SCALE_Y, 0F);animator12q2.duration = 200;animator12q2.start()
                            val animator13q2 = ObjectAnimator.ofFloat(binding.TVslot14Q2, View.SCALE_Y, 0F);animator13q2.duration = 200;animator13q2.start()
                            val animator14q2 = ObjectAnimator.ofFloat(binding.TVslot15Q2, View.SCALE_Y, 0F);animator14q2.duration = 200;animator14q2.start()
                            val animator15q2 = ObjectAnimator.ofFloat(binding.TVslot16Q2, View.SCALE_Y, 0F);animator15q2.duration = 200;animator15q2.start()

                            val animator0q3 = ObjectAnimator.ofFloat(binding.TVslot1Q3, View.SCALE_Y, 0F);animator0q3.duration = 200;animator0q3.start()
                            val animator1q3 = ObjectAnimator.ofFloat(binding.TVslot2Q3, View.SCALE_Y, 0F);animator1q3.duration = 200;animator1q3.start()
                            val animator2q3= ObjectAnimator.ofFloat(binding.TVslot3Q3, View.SCALE_Y, 0F);animator2q3.duration = 200;animator2q3.start()
                            val animator3q3 = ObjectAnimator.ofFloat(binding.TVslot4Q3, View.SCALE_Y, 0F);animator3q3.duration = 200;animator3q3.start()
                            val animator4q3 = ObjectAnimator.ofFloat(binding.TVslot5Q3, View.SCALE_Y, 0F);animator4q3.duration = 200;animator4q3.start()
                            val animator5q3 = ObjectAnimator.ofFloat(binding.TVslot6Q3, View.SCALE_Y, 0F);animator5q3.duration = 200;animator5q3.start()
                            val animator6q3 = ObjectAnimator.ofFloat(binding.TVslot7Q3, View.SCALE_Y, 0F);animator6q3.duration = 200;animator6q3.start()
                            val animator7q3 = ObjectAnimator.ofFloat(binding.TVslot8Q3, View.SCALE_Y, 0F);animator7q3.duration = 200;animator7q3.start()
                            val animator8q3 = ObjectAnimator.ofFloat(binding.TVslot9Q3, View.SCALE_Y, 0F);animator8q3.duration = 200;animator8q3.start()
                            val animator9q3 = ObjectAnimator.ofFloat(binding.TVslot10Q3, View.SCALE_Y, 0F);animator9q3.duration = 200;animator9q3.start()
                            val animator10q3 = ObjectAnimator.ofFloat(binding.TVslot11Q3, View.SCALE_Y, 0F);animator10q3.duration = 200;animator10q3.start()
                            val animator11q3 = ObjectAnimator.ofFloat(binding.TVslot12Q3, View.SCALE_Y, 0F);animator11q3.duration = 200;animator11q3.start()
                            val animator12q3 = ObjectAnimator.ofFloat(binding.TVslot13Q3, View.SCALE_Y, 0F);animator12q3.duration = 200;animator12q3.start()
                            val animator13q3 = ObjectAnimator.ofFloat(binding.TVslot14Q3, View.SCALE_Y, 0F);animator13q3.duration = 200;animator13q3.start()
                            val animator14q3 = ObjectAnimator.ofFloat(binding.TVslot15Q3, View.SCALE_Y, 0F);animator14q3.duration = 200;animator14q3.start()
                            val animator15q3 = ObjectAnimator.ofFloat(binding.TVslot16Q3, View.SCALE_Y, 0F);animator15q3.duration = 200;animator15q3.start()

                            val animator0q4 = ObjectAnimator.ofFloat(binding.TVslot1Q4, View.SCALE_Y, 0F);animator0q4.duration = 200;animator0q4.start()
                            val animator1q4 = ObjectAnimator.ofFloat(binding.TVslot2Q4, View.SCALE_Y, 0F);animator1q4.duration = 200;animator1q4.start()
                            val animator2q4= ObjectAnimator.ofFloat(binding.TVslot3Q4, View.SCALE_Y, 0F);animator2q4.duration = 200;animator2q4.start()
                            val animator3q4 = ObjectAnimator.ofFloat(binding.TVslot4Q4, View.SCALE_Y, 0F);animator3q4.duration = 200;animator3q4.start()
                            val animator4q4 = ObjectAnimator.ofFloat(binding.TVslot5Q4, View.SCALE_Y, 0F);animator4q4.duration = 200;animator4q4.start()
                            val animator5q4 = ObjectAnimator.ofFloat(binding.TVslot6Q4, View.SCALE_Y, 0F);animator5q4.duration = 200;animator5q4.start()
                            val animator6q4 = ObjectAnimator.ofFloat(binding.TVslot7Q4, View.SCALE_Y, 0F);animator6q4.duration = 200;animator6q4.start()
                            val animator7q4 = ObjectAnimator.ofFloat(binding.TVslot8Q4, View.SCALE_Y, 0F);animator7q4.duration = 200;animator7q4.start()
                            val animator8q4 = ObjectAnimator.ofFloat(binding.TVslot9Q4, View.SCALE_Y, 0F);animator8q4.duration = 200;animator8q4.start()
                            val animator9q4 = ObjectAnimator.ofFloat(binding.TVslot10Q4, View.SCALE_Y, 0F);animator9q4.duration = 200;animator9q4.start()
                            val animator10q4 = ObjectAnimator.ofFloat(binding.TVslot11Q4, View.SCALE_Y, 0F);animator10q4.duration = 200;animator10q4.start()
                            val animator11q4 = ObjectAnimator.ofFloat(binding.TVslot12Q4, View.SCALE_Y, 0F);animator11q4.duration = 200;animator11q4.start()
                            val animator12q4 = ObjectAnimator.ofFloat(binding.TVslot13Q4, View.SCALE_Y, 0F);animator12q4.duration = 200;animator12q4.start()
                            val animator13q4 = ObjectAnimator.ofFloat(binding.TVslot14Q4, View.SCALE_Y, 0F);animator13q4.duration = 200;animator13q4.start()
                            val animator14q4 = ObjectAnimator.ofFloat(binding.TVslot15Q4, View.SCALE_Y, 0F);animator14q4.duration = 200;animator14q4.start()
                            val animator15q4 = ObjectAnimator.ofFloat(binding.TVslot16Q4, View.SCALE_Y, 0F);animator15q4.duration = 200;animator15q4.start()
                        },3000)

                        Handler(Looper.getMainLooper()).postDelayed({
                            val animator02 = ObjectAnimator.ofFloat(binding.TVslot111, View.SCALE_Y, 1F);animator02.duration=200;animator02.start()
                            val animator122 = ObjectAnimator.ofFloat(binding.TVslot22, View.SCALE_Y, 1F);animator122.duration = 200;animator122.start()
                            val animator22 = ObjectAnimator.ofFloat(binding.TVslot33, View.SCALE_Y, 1F);animator22.duration = 200;animator22.start()
                            val animator32 = ObjectAnimator.ofFloat(binding.TVslot44, View.SCALE_Y, 1F);animator32.duration = 200;animator32.start()
                            val animator42 = ObjectAnimator.ofFloat(binding.TVslot55, View.SCALE_Y, 1F);animator42.duration = 200;animator42.start()
                            val animator52 = ObjectAnimator.ofFloat(binding.TVslot66, View.SCALE_Y, 1F);animator52.duration = 200;animator52.start()
                            val animator62 = ObjectAnimator.ofFloat(binding.TVslot77, View.SCALE_Y, 1F);animator62.duration = 200;animator62.start()
                            val animator72 = ObjectAnimator.ofFloat(binding.TVslot88, View.SCALE_Y, 1F);animator72.duration = 200;animator72.start()
                            val animator82 = ObjectAnimator.ofFloat(binding.TVslot99, View.SCALE_Y, 1F);animator82.duration = 200;animator82.start()
                            val animator92 = ObjectAnimator.ofFloat(binding.TVslot1010, View.SCALE_Y, 1F);animator92.duration = 200;animator92.start()
                            val animator102 = ObjectAnimator.ofFloat(binding.TVslot1111, View.SCALE_Y, 1F);animator102.duration = 200;animator102.start()
                            val animator112 = ObjectAnimator.ofFloat(binding.TVslot1212, View.SCALE_Y, 1F);animator112.duration = 200;animator112.start()
                            val animator1222 = ObjectAnimator.ofFloat(binding.TVslot1313, View.SCALE_Y, 1F);animator1222.duration = 200;animator1222.start()
                            val animator132 = ObjectAnimator.ofFloat(binding.TVslot1414, View.SCALE_Y, 1F);animator132.duration = 200;animator132.start()
                            val animator142 = ObjectAnimator.ofFloat(binding.TVslot1515, View.SCALE_Y, 1F);animator142.duration = 200;animator142.start()
                            val animator152 = ObjectAnimator.ofFloat(binding.TVslot1616, View.SCALE_Y, 1F);animator152.duration = 200;animator152.start()


                            val animator0q2 = ObjectAnimator.ofFloat(binding.TVslot111Q2, View.SCALE_Y, 1F);animator0q2.duration = 200;animator0q2.start()
                            val animator1q2 = ObjectAnimator.ofFloat(binding.TVslot22Q2, View.SCALE_Y, 1F);animator1q2.duration = 200;animator1q2.start()
                            val animator2q2 = ObjectAnimator.ofFloat(binding.TVslot33Q2, View.SCALE_Y, 1F);animator2q2.duration = 200;animator2q2.start()
                            val animator3q2 = ObjectAnimator.ofFloat(binding.TVslot44Q2, View.SCALE_Y, 1F);animator3q2.duration = 200;animator3q2.start()
                            val animator4q2 = ObjectAnimator.ofFloat(binding.TVslot55Q2, View.SCALE_Y, 1F);animator4q2.duration = 200;animator4q2.start()
                            val animator5q2 = ObjectAnimator.ofFloat(binding.TVslot66Q2, View.SCALE_Y, 1F);animator5q2.duration = 200;animator5q2.start()
                            val animator6q2 = ObjectAnimator.ofFloat(binding.TVslot77Q2, View.SCALE_Y, 1F);animator6q2.duration = 200;animator6q2.start()
                            val animator7q2 = ObjectAnimator.ofFloat(binding.TVslot88Q2, View.SCALE_Y, 1F);animator7q2.duration = 200;animator7q2.start()
                            val animator8q2 = ObjectAnimator.ofFloat(binding.TVslot99Q2, View.SCALE_Y, 1F);animator8q2.duration = 200;animator8q2.start()
                            val animator9q2 = ObjectAnimator.ofFloat(binding.TVslot1010Q2, View.SCALE_Y, 1F);animator9q2.duration = 200;animator9q2.start()
                            val animator10q2 = ObjectAnimator.ofFloat(binding.TVslot1111Q2, View.SCALE_Y, 1F);animator10q2.duration = 200;animator10q2.start()
                            val animator11q2 = ObjectAnimator.ofFloat(binding.TVslot1212Q2, View.SCALE_Y, 1F);animator11q2.duration = 200;animator11q2.start()
                            val animator12q2 = ObjectAnimator.ofFloat(binding.TVslot1313Q2, View.SCALE_Y, 1F);animator12q2.duration = 200;animator12q2.start()
                            val animator13q2 = ObjectAnimator.ofFloat(binding.TVslot14142, View.SCALE_Y, 1F);animator13q2.duration = 200;animator13q2.start()
                            val animator14q2 = ObjectAnimator.ofFloat(binding.TVslot1515Q2, View.SCALE_Y, 1F);animator14q2.duration = 200;animator14q2.start()
                            val animator15q2 = ObjectAnimator.ofFloat(binding.TVslot1616Q2, View.SCALE_Y, 1F);animator15q2.duration = 200;animator15q2.start()

                            val animator0q3 = ObjectAnimator.ofFloat(binding.TVslot111Q3, View.SCALE_Y, 1F);animator0q3.duration = 200;animator0q3.start()
                            val animator1q3 = ObjectAnimator.ofFloat(binding.TVslot22Q3, View.SCALE_Y, 1F);animator1q3.duration = 200;animator1q3.start()
                            val animator2q3= ObjectAnimator.ofFloat(binding.TVslot33Q3, View.SCALE_Y, 1F);animator2q3.duration = 200;animator2q3.start()
                            val animator3q3 = ObjectAnimator.ofFloat(binding.TVslot44Q3, View.SCALE_Y, 1F);animator3q3.duration = 200;animator3q3.start()
                            val animator4q3 = ObjectAnimator.ofFloat(binding.TVslot55Q3, View.SCALE_Y, 1F);animator4q3.duration = 200;animator4q3.start()
                            val animator5q3 = ObjectAnimator.ofFloat(binding.TVslot66Q3, View.SCALE_Y, 1F);animator5q3.duration = 200;animator5q3.start()
                            val animator6q3 = ObjectAnimator.ofFloat(binding.TVslot77Q3, View.SCALE_Y, 1F);animator6q3.duration = 200;animator6q3.start()
                            val animator7q3 = ObjectAnimator.ofFloat(binding.TVslot88Q3, View.SCALE_Y, 1F);animator7q3.duration = 200;animator7q3.start()
                            val animator8q3 = ObjectAnimator.ofFloat(binding.TVslot99Q3, View.SCALE_Y, 1F);animator8q3.duration = 200;animator8q3.start()
                            val animator9q3 = ObjectAnimator.ofFloat(binding.TVslot1010Q3, View.SCALE_Y, 1F);animator9q3.duration = 200;animator9q3.start()
                            val animator10q3 = ObjectAnimator.ofFloat(binding.TVslot1111Q3, View.SCALE_Y, 1F);animator10q3.duration = 200;animator10q3.start()
                            val animator11q3 = ObjectAnimator.ofFloat(binding.TVslot1212Q3, View.SCALE_Y, 1F);animator11q3.duration = 200;animator11q3.start()
                            val animator12q3 = ObjectAnimator.ofFloat(binding.TVslot1313Q3, View.SCALE_Y, 1F);animator12q3.duration = 200;animator12q3.start()
                            val animator13q3 = ObjectAnimator.ofFloat(binding.TVslot1414Q3, View.SCALE_Y, 1F);animator13q3.duration = 200;animator13q3.start()
                            val animator14q3 = ObjectAnimator.ofFloat(binding.TVslot1515Q3, View.SCALE_Y, 1F);animator14q3.duration = 200;animator14q3.start()
                            val animator15q3 = ObjectAnimator.ofFloat(binding.TVslot1616Q3, View.SCALE_Y, 1F);animator15q3.duration = 200;animator15q3.start()

                            val animator0q4 = ObjectAnimator.ofFloat(binding.TVslot111Q4, View.SCALE_Y, 1F);animator0q4.duration = 200;animator0q4.start()
                            val animator1q4 = ObjectAnimator.ofFloat(binding.TVslot22Q4, View.SCALE_Y, 1F);animator1q4.duration = 200;animator1q4.start()
                            val animator2q4= ObjectAnimator.ofFloat(binding.TVslot33Q4, View.SCALE_Y, 1F);animator2q4.duration = 200;animator2q4.start()
                            val animator3q4 = ObjectAnimator.ofFloat(binding.TVslot44Q4, View.SCALE_Y, 1F);animator3q4.duration = 200;animator3q4.start()
                            val animator4q4 = ObjectAnimator.ofFloat(binding.TVslot55Q4, View.SCALE_Y, 1F);animator4q4.duration = 200;animator4q4.start()
                            val animator5q4 = ObjectAnimator.ofFloat(binding.TVslot66Q4, View.SCALE_Y, 1F);animator5q4.duration = 200;animator5q4.start()
                            val animator6q4 = ObjectAnimator.ofFloat(binding.TVslot77Q4, View.SCALE_Y, 1F);animator6q4.duration = 200;animator6q4.start()
                            val animator7q4 = ObjectAnimator.ofFloat(binding.TVslot88Q4, View.SCALE_Y, 1F);animator7q4.duration = 200;animator7q4.start()
                            val animator8q4 = ObjectAnimator.ofFloat(binding.TVslot99Q4, View.SCALE_Y, 1F);animator8q4.duration = 200;animator8q4.start()
                            val animator9q4 = ObjectAnimator.ofFloat(binding.TVslot1010Q4, View.SCALE_Y, 1F);animator9q4.duration = 200;animator9q4.start()
                            val animator10q4 = ObjectAnimator.ofFloat(binding.TVslot1111Q4, View.SCALE_Y, 1F);animator10q4.duration = 200;animator10q4.start()
                            val animator11q4 = ObjectAnimator.ofFloat(binding.TVslot1212Q4, View.SCALE_Y, 1F);animator11q4.duration = 200;animator11q4.start()
                            val animator12q4 = ObjectAnimator.ofFloat(binding.TVslot1313Q4, View.SCALE_Y, 1F);animator12q4.duration = 200;animator12q4.start()
                            val animator13q4 = ObjectAnimator.ofFloat(binding.TVslot1414Q4, View.SCALE_Y, 1F);animator13q4.duration = 200;animator13q4.start()
                            val animator14q4 = ObjectAnimator.ofFloat(binding.TVslot1515Q4, View.SCALE_Y, 1F);animator14q4.duration = 200;animator14q4.start()
                            val animator15q4 = ObjectAnimator.ofFloat(binding.TVslot1616Q4, View.SCALE_Y, 1F);animator15q4.duration = 200;animator15q4.start()
                        },3200)



                            binding.TVslot111.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot1,
                                    binding.TVslot111,
                                    32
                                )
                            }
                            binding.TVslot22.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot2,
                                    binding.TVslot22,
                                    32
                                )
                            }
                            binding.TVslot33.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot3,
                                    binding.TVslot33,
                                    32
                                )
                            }
                            binding.TVslot44.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot4,
                                    binding.TVslot44,
                                    32
                                )
                            }
                            binding.TVslot55.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot5,
                                    binding.TVslot55,
                                    32
                                )
                            }
                            binding.TVslot66.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot6,
                                    binding.TVslot66,
                                    32
                                )
                            }
                            binding.TVslot77.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot7,
                                    binding.TVslot77,
                                    32
                                )
                            }
                            binding.TVslot88.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot8,
                                    binding.TVslot88,
                                    32
                                )
                            }
                            binding.TVslot99.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot9,
                                    binding.TVslot99,
                                    32
                                )
                            }
                            binding.TVslot1010.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot10,
                                    binding.TVslot1010,
                                    32
                                )
                            }
                            binding.TVslot1111.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot11,
                                    binding.TVslot1111,
                                    32
                                )
                            }
                            binding.TVslot1212.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot12,
                                    binding.TVslot1212,
                                    32
                                )
                            }
                            binding.TVslot1313.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot13,
                                    binding.TVslot1313,
                                    32
                                )
                            }
                            binding.TVslot1414.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot14,
                                    binding.TVslot1414,
                                    32
                                )
                            }
                            binding.TVslot1515.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot15,
                                    binding.TVslot1515,
                                    32
                                )
                            }
                            binding.TVslot1616.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot16,
                                    binding.TVslot1616,
                                    32
                                )
                            }

                            binding.TVslot111Q2.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot1Q2,
                                    binding.TVslot111Q2,
                                    32
                                )
                            }
                            binding.TVslot22Q2.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot2Q2,
                                    binding.TVslot22Q2,
                                    32
                                )
                            }
                            binding.TVslot33Q2.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot3Q2,
                                    binding.TVslot33Q2,
                                    32
                                )
                            }
                            binding.TVslot44Q2.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot4Q2,
                                    binding.TVslot44Q2,
                                    32
                                )
                            }
                            binding.TVslot55Q2.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot5Q2,
                                    binding.TVslot55Q2,
                                    32
                                )
                            }
                            binding.TVslot66Q2.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot6Q2,
                                    binding.TVslot66Q2,
                                    32
                                )
                            }
                            binding.TVslot77Q2.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot7Q2,
                                    binding.TVslot77Q2,
                                    32
                                )
                            }
                            binding.TVslot88Q2.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot8Q2,
                                    binding.TVslot88Q2,
                                    32
                                )
                            }
                            binding.TVslot99Q2.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot9Q2,
                                    binding.TVslot99Q2,
                                    32
                                )
                            }
                            binding.TVslot1010Q2.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot10Q2,
                                    binding.TVslot1010Q2,
                                    32
                                )
                            }
                            binding.TVslot1111Q2.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot11Q2,
                                    binding.TVslot1111Q2,
                                    32
                                )
                            }
                            binding.TVslot1212Q2.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot12Q2,
                                    binding.TVslot1212Q2,
                                    32
                                )
                            }
                            binding.TVslot1313Q2.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot13Q2,
                                    binding.TVslot1313Q2,
                                    32
                                )
                            }
                            binding.TVslot14142.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot14Q2,
                                    binding.TVslot14142,
                                    32
                                )
                            }
                            binding.TVslot1515Q2.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot15Q2,
                                    binding.TVslot1515Q2,
                                    32
                                )
                            }
                            binding.TVslot1616Q2.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot16Q2,
                                    binding.TVslot1616Q2,
                                    32
                                )
                            }

                            binding.TVslot111Q3.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot1Q3,
                                    binding.TVslot111Q3,
                                    32
                                )
                            }
                            binding.TVslot22Q3.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot2Q3,
                                    binding.TVslot22Q3,
                                    32
                                )
                            }
                            binding.TVslot33Q3.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot3Q3,
                                    binding.TVslot33Q3,
                                    32
                                )
                            }
                            binding.TVslot44Q3.setOnClickListener {
                                anim. openToCloseCard(
                                    binding.TVslot4Q3,
                                    binding.TVslot44Q3,
                                    32
                                )
                            }
                            binding.TVslot55Q3.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot5Q3,
                                    binding.TVslot55Q3,
                                    32
                                )
                            }
                            binding.TVslot66Q3.setOnClickListener {
                                anim. openToCloseCard(
                                    binding.TVslot6Q3,
                                    binding.TVslot66Q3,
                                    32
                                )
                            }
                            binding.TVslot77Q3.setOnClickListener {
                                anim. openToCloseCard(
                                    binding.TVslot7Q3,
                                    binding.TVslot77Q3,
                                    32
                                )
                            }
                            binding.TVslot88Q3.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot8Q3,
                                    binding.TVslot88Q3,
                                    32
                                )
                            }
                            binding.TVslot99Q3.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot9Q3,
                                    binding.TVslot99Q3,
                                    32
                                )
                            }
                            binding.TVslot1010Q3.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot10Q3,
                                    binding.TVslot1010Q3,
                                    32
                                )
                            }
                            binding.TVslot1111Q3.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot11Q3,
                                    binding.TVslot1111Q3,
                                    32
                                )
                            }
                            binding.TVslot1212Q3.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot12Q3,
                                    binding.TVslot1212Q3,
                                    32
                                )
                            }
                            binding.TVslot1313Q3.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot13Q3,
                                    binding.TVslot1313Q3,
                                    32
                                )
                            }
                            binding.TVslot1414Q3.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot14Q3,
                                    binding.TVslot1414Q3,
                                    32
                                )
                            }
                            binding.TVslot1515Q3.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot15Q3,
                                    binding.TVslot1515Q3,
                                    32
                                )
                            }
                            binding.TVslot1616Q3.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot16Q3,
                                    binding.TVslot1616Q3,
                                    32
                                )
                            }

                            binding.TVslot111Q4.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot1Q4,
                                    binding.TVslot111Q4,
                                    32
                                )
                            }
                            binding.TVslot22Q4.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot2Q4,
                                    binding.TVslot22Q4,
                                    32
                                )
                            }
                            binding.TVslot33Q4.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot3Q4,
                                    binding.TVslot33Q4,
                                    32
                                )
                            }
                            binding.TVslot44Q4
                                .setOnClickListener {
                                    anim.openToCloseCard(
                                    binding.TVslot4Q4,
                                    binding.TVslot44Q4,
                                    32
                                )
                            }
                            binding.TVslot55Q4.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot5Q4,
                                    binding.TVslot55Q4,
                                    32
                                )
                            }
                            binding.TVslot66Q4.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot6Q4,
                                    binding.TVslot66Q4,
                                    32
                                )
                            }
                            binding.TVslot77Q4.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot7Q4,
                                    binding.TVslot77Q4,
                                    32
                                )
                            }
                            binding.TVslot88Q4.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot8Q4,
                                    binding.TVslot88Q4,
                                    32
                                )
                            }
                            binding.TVslot99Q4.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot9Q4,
                                    binding.TVslot99Q4,
                                    32
                                )
                            }
                            binding.TVslot1010Q4.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot10Q4,
                                    binding.TVslot1010Q4,
                                    32
                                )
                            }
                            binding.TVslot1111Q4.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot11Q4,
                                    binding.TVslot1111Q4,
                                    32
                                )
                            }
                            binding.TVslot1212Q4.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot12Q4,
                                    binding.TVslot1212Q4,
                                    32
                                )
                            }
                            binding.TVslot1313Q4.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot13Q4,
                                    binding.TVslot1313Q4,
                                    32
                                )
                            }
                            binding.TVslot1414Q4.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot14Q4,
                                    binding.TVslot1414Q4,
                                    32
                                )
                            }
                            binding.TVslot1515Q4.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot15Q4,
                                    binding.TVslot1515Q4,
                                    32
                                )
                            }
                            binding.TVslot1616Q4.setOnClickListener {
                                anim.openToCloseCard(
                                    binding.TVslot16Q4,
                                    binding.TVslot1616Q4,
                                    32
                                )
                            }

                    }




        }

