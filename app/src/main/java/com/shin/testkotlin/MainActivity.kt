package com.shin.testkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    /**
     * 구구단 예제
     */
    fun onGugudan(){
        for(i in 1..9){
            for(j in 1..9){
                if(j == 9){
                    println("$i * $j = ${i*j}")
                } else {
                    print("$i * $j = ${i*j}")
                }

            }
        }
    }


}
