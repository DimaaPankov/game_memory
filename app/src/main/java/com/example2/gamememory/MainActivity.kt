package com.example2.gamememory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation


class MainActivity : AppCompatActivity() {

    lateinit var navController:NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navController = Navigation.findNavController(this,R.id.nav_host_fragment)

    }

    override fun onBackPressed() {
        timer.stop()

            if(indexFragment == 0){
                navController.navigate(R.id.action_gameFragment_to_mainFragment)

            }else if(indexFragment == 1){
                navController.navigate(R.id.action_gameFragment4x4_to_mainFragment)
            }else if(indexFragment == 2){
                navController.navigate(R.id.action_gameFragment6x6_to_mainFragment)
            }
            else if(indexFragment == 3){
                navController.navigate(R.id.action_gameFragment8x8_to_mainFragment)
            }

    }

    }
