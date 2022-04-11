package com.example.noflagmentproject

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider


class MainActivity : AppCompatActivity() {

    //savedInstanceState
    private var buttonFlg: Int = 0
    private val buttonTexts = arrayOf("ほげ","ふが")


    // ViewModelのインスタンス作成、またはインスタンス取得 コードの理解度低い
//    private val viewModel: CheckedViewModel by lazy {
//        ViewModelProvider(
//            this, ViewModelProvider.NewInstanceFactory()
//        ).get(CheckedViewModel::class.java)
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("-- onCreate --")

        val checkBox1 = findViewById<CheckBox>(R.id.checkbox_1)
        val checkBox2 = findViewById<CheckBox>(R.id.checkbox_2)
        val button = findViewById<Button>(R.id.test_button)

        println(" buttonFlag -> $buttonFlg")
        //savedInstanceState
        if (savedInstanceState != null) {
            buttonFlg = savedInstanceState.getInt("buttonFlg")
            println(" buttonFlag(SIS) -> $buttonFlg")
        }
        button.text = buttonTexts[buttonFlg] //ほげ

        //ViewModel
//        checkBox1.isChecked = viewModel.checkbox1 //false
//        checkBox2.isChecked = viewModel.checkbox2 //true
//        button.text = viewModel.buttonTexts[viewModel.button] //ほげ

        //シェアードインスタンス
//        val data = Data.getInstance()
//        if(data!=null){
//            checkBox1.isChecked = data.cb1_checked //true
//            checkBox2.isChecked = data.cb2_checked //false
//            button.text = data.buttonTexts[data.button] //ほげ
//        }

    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("buttonFlg", buttonFlg)
        println(" buttonFlag(onSIS) -> $buttonFlg")
    }
    override fun onPause() {
        super.onPause()
        println("-- onPause --")
    }

    override fun onResume() {
        super.onResume()
        println("-- onResume --")
    }

    //savedInstanceStateでの処理
    fun onButtonClick(view: View) {
        var button = findViewById<Button>(view.id)
        var num = buttonFlg
        when(num){
            0 -> num = 1
            1 -> num = 0
        }
        buttonFlg = num
        button.text = buttonTexts[num]
    }

    //ViewModelでの処理
//    fun onButtonClick(view: View) {
//        var button = findViewById<Button>(view.id)
//        var num = viewModel.button
//        when(num){
//            0 -> num = 1
//            1 -> num = 0
//        }
//        viewModel.button = num
//        button.text = viewModel.buttonTexts[num]
//    }

      //シェアードインスタンスでの処理
//    fun onButtonClick(view: View) {
//        var button = findViewById<Button>(view.id)
//        // シェアードインスタンスを生成
//        val data = Data.getInstance()
//        if (data != null) {
//            var num = data.button
//            when(num){
//                0 -> num = 1
//                1 -> num = 0
//            }
//            data.button = num
//            button.text = data.buttonTexts[num]
//        }
//    }

}