package com.example.classtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.classtest.databinding.ActivityMainBinding

open class Buy(
    var image:String = "",
    var name:String = "",
    var city:String = "",
    var time:String = "",
    var much:String = ""
) {
    open fun desc():String {
        return "$name($time)"
    }
}

class MainActivity : AppCompatActivity() {
    lateinit var animalAdapter: AnimalAdapter
    val datas = mutableListOf<Buy>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root)
//        setContentView(R.layout.activity_main)

        animalAdapter = AnimalAdapter(this)
        initRecycler()
        binding.rcView.adapter = animalAdapter

    }


    private fun initRecycler() {

        datas.apply {
            add(Buy("제품1", "나이키 신발", "전농동", "1분 전", "100,000원"))
            add(Buy("제품1", "나이키 신발", "휘경동", "3분 전", "100,000원"))
            add(Buy("제품1", "나이키 신발", "회기동", "7분 전", "1000,00원"))
            add(Buy("제품1", "나이키 신발", "중화동", "11분 전", "100,000원"))
            add(Buy("제품1", "나이키 신발", "신내동", "14분 전", "100,000원"))
            add(Buy("제품1", "나이키 신발", "청량리", "15분 전", "100,000원"))
            add(Buy("제품1", "나이키 신발", "답십리", "18분 전", "100,000원"))
            add(Buy("제품1", "나이키 신발", "장안동", "21분 전", "100,000원"))
            add(Buy("제품1", "나이키 신발", "이문동", "29분 전", "100,000원"))
            add(Buy("제품1", "나이키 신발", "용두동", "31분 전", "100,000원"))
            add(Buy("제품1", "나이키 신발", "월계동", "33분 전", "100,000원"))
            add(Buy("제품1", "나이키 신발", "면목동", "47분 전", "100,000원"))
            add(Buy("제품1", "나이키 신발", "장위동", "1시간 전", "100,000원"))

            animalAdapter.datas = datas
            animalAdapter.notifyDataSetChanged()

        }
    }
}