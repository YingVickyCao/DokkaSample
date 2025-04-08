package com.example.kotlin.dokka.app

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import com.example.kotlin.dokka.lib.lib1.Lib1Bean
import com.example.kotlin.dokka.lib.lib2.Lib2Bean
import com.example.kotlin.dokka.lib.lib3.Lib3Bean

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.info)

        val data1 = Lib1Bean(100)

        val data2 = Lib2Bean("code")

        val data3 = Lib3Bean(101)

        val data = "$data1\n$data2\n$data3"
        textView.text = data
    }
}

