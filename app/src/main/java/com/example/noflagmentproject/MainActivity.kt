package com.example.noflagmentproject

import android.os.Bundle
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    // ViewModelのインスタンス作成、またはインスタンス取得 コードの理解度低い
    private val viewModel: CheckedViewModel by lazy {
        ViewModelProvider(
            this, ViewModelProvider.NewInstanceFactory()
        ).get(CheckedViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("-- onCreate --")

        // シェアードインスタンスを生成
        val data = Data.getInstance()

        val checkBox1 = findViewById<CheckBox>(R.id.checkbox_1)
        val checkBox2 = findViewById<CheckBox>(R.id.checkbox_2)

        //シェアードインスタンス
        if(data!=null){
            checkBox1.isChecked = data.cb1_checked //true
            checkBox2.isChecked = data.cb2_checked //false
        }

        //ViewModel
        checkBox1.isChecked = viewModel.checkbox1 //false
        checkBox2.isChecked = viewModel.checkbox2 //true

    }

    override fun onPause() {
        super.onPause()
        println("-- onCreate --")

    }

    override fun onResume() {
        super.onResume()
        println("-- onResume --")
    }



}