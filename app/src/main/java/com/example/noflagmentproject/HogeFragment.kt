package com.example.noflagmentproject

import android.os.Bundle
import androidx.fragment.app.Fragment

class HogeFragment : Fragment() {
    var buttonFlg: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            buttonFlg = it.getInt(buttonFlg.toString())
            println(" onCreate - HogeFlagment ")
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        println("-- onSaveInstanceState - HogeFragment --")
        outState.putInt("BUTTON_FLG", buttonFlg)
        println(" BUTTON_FLG onSIS -> $buttonFlg ")
    }

}