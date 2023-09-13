package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var main: ActivityMainBinding
//    xml의 객체를 메모리에 쓰는 것 : 인플레이션
    private var count=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main = ActivityMainBinding.inflate(layoutInflater)
        setContentView(main.root)

        main.btnAdd.setOnClickListener {
            main.num.text = "${++count}"
        }
        main.btnDic.setOnClickListener {
            if(count>0) {
                main.num.text = "${--count}"
            }
        }
        main.btnRes.setOnClickListener {
            count=0
            main.num.text = "${count}"
        }
    }

}