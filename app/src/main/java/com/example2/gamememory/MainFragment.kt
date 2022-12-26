package com.example2.gamememory

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.navigation.fragment.findNavController
import com.example2.gamememory.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    lateinit var binding: FragmentMainBinding
    val contries = listOf("2x2","4x4","6x6","8x8")
    var positioni = 0
    var listArgs = arrayOf<String>()


   private val listThems:Array<String> = arrayOf(
       "\uD83D\uDC36","\uD83D\uDC31","\uD83D\uDC2D","\uD83D\uDC39","\uD83D\uDC30","\uD83E\uDD8A",
       "\uD83D\uDC3B","\uD83D\uDC3C","\uD83D\uDC3B\u200D","❄","\uD83D\uDC28","\uD83D\uDC2F",
       "\uD83E\uDD81","\uD83D\uDC2E","\uD83D\uDC37","\uD83D\uDC3D","\uD83D\uDC38","\uD83D\uDC35",
       "\uD83D\uDE48","\uD83D\uDE49","\uD83D\uDE4A","\uD83D\uDC12","\uD83D\uDC14","\uD83D\uDC27",
       "\uD83D\uDC26","\uD83D\uDC24","\uD83D\uDC23","\uD83D\uDC25","\uD83E\uDD86","\uD83E\uDD85",
       "\uD83E\uDD89","\uD83E\uDD87")

    private val listThems2 = arrayOf(
        "\uD83C\uDF4F","\uD83C\uDF4E","\uD83C\uDF50","\uD83C\uDF4A","\uD83C\uDF4B","\uD83C\uDF4C",
        "\uD83C\uDF49","\uD83C\uDF47","\uD83C\uDF53","\uD83E\uDED0","\uD83C\uDF48","\uD83C\uDF52",
        "\uD83C\uDF51","\uD83E\uDD6D","\uD83C\uDF4D","\uD83E\uDD65","\uD83E\uDD5D","\uD83C\uDF45",
        "\uD83C\uDF46","\uD83E\uDD51","\uD83E\uDD66","\uD83E\uDD6C","\uD83E\uDD52","\uD83C\uDF36",
        "\uD83E\uDED1","\uD83C\uDF3D","\uD83E\uDD55","\uD83E\uDED2","\uD83E\uDDC4","\uD83E\uDDC5",
        "\uD83E\uDD54","\uD83C\uDF60"
    )

    private val listThems3 = arrayOf(
        "\uD83E\uDDF3","\uD83C\uDF02","☂","\uD83E\uDDF5","\uD83E\uDEA1",
        "\uD83E\uDEA2","\uD83E\uDDF6","\uD83D\uDC53","\uD83D\uDD76","\uD83E\uDD7D","\uD83E\uDD7C",
        "\uD83E\uDDBA","\uD83D\uDC54","\uD83D\uDC55","\uD83D\uDC56","\uD83E\uDDE3","\uD83E\uDDE4",
        "\uD83E\uDDE5","\uD83E\uDDE6","\uD83D\uDC57","\uD83D\uDC58","\uD83E\uDD7B","\uD83E\uDE74",
        "\uD83E\uDE71","\uD83E\uDE72","\uD83E\uDE73","\uD83D\uDC59","\uD83D\uDC5A","\uD83D\uDC5B",
        "\uD83D\uDC5C","\uD83D\uDC5D")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentMainBinding.inflate(layoutInflater)
         val adapter = ArrayAdapter(requireActivity(), androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,contries)
             adapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item)
        val adapterTheme = ArrayAdapter(requireActivity(), androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
            listOf("\uD83D\uDC36 animals","\uD83C\uDF4F fruite","\uD83E\uDDF3 items"))
            adapterTheme.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item)
        indexGo = 0



        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View,
                position: Int,
                id: Long
            ) {
                positioni = position
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }

        binding.spinnerThems.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View,
                position: Int,
                id: Long
            ) {
               if(position == 0){
                   listArgs = ramdommCollections(listThems)
               }
               else if(position == 1){
                   listArgs = listThems2
               }
                else if(position == 2){
                   listArgs = listThems3
               }
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
               listArgs = listThems
            }
        }

        binding.spinner.adapter = adapter
        binding.spinnerThems.adapter = adapterTheme


        binding.Bplay.setOnClickListener {
            indexGo = 1

            if(positioni == 0){
                findNavController().navigate(MainFragmentDirections.actionMainFragmentToGameFragment(
                      ramdommCollections(listArgs)
                ))
            }else if(positioni == 1){
                findNavController().navigate(MainFragmentDirections.actionMainFragmentToGameFragment4x4(
                    ramdommCollections(listArgs)
                ))
            }else if(positioni == 2){

                findNavController().navigate(MainFragmentDirections.actionMainFragmentToGameFragment6x6(
                    ramdommCollections(listArgs)
                ))
            }else if(positioni == 3){

                findNavController().navigate(MainFragmentDirections.actionMainFragmentToGameFragment8x8(
                    ramdommCollections(listArgs)
                ))
            }
        }


    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }
}

