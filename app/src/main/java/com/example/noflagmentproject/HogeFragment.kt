package com.example.noflagmentproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


/**
 * A simple [Fragment] subclass.
 * Use the [HogeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
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