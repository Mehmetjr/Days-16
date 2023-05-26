package com.example.days_16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    lateinit var btn_one : Button
    lateinit var btn_two : Button
    lateinit var btn_three : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btn_one = findViewById(R.id.btn_one)
        btn_two = findViewById(R.id.btn_two)
        btn_three = findViewById(R.id.btn_three)

        btn_one.setOnClickListener {
            val one = One()
            one.arguments?.putString("key1","data1")
            changeFragment(one)
        }
        btn_two.setOnClickListener {
            val two = Two()
            changeFragment(two)
        }
        btn_three.setOnClickListener {
            val three = Three()
            changeFragment(three)
        }


    }

    fun changeFragment(fragment:Fragment){

        val fragmentTransaction=supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout,fragment)
        fragmentTransaction.commit()
    }
}