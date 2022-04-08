package com.example.noflagmentproject

import androidx.lifecycle.ViewModel

/**
 * チェック状態を管理するVM
 */
class CheckedViewModel: ViewModel() {
    var checkbox1 : Boolean = false
    var checkbox2 : Boolean = true
    var button : Int = 0
    val buttonTexts = arrayOf("ほげ","ふが")

    override fun onCleared() {
        super.onCleared()
        println("-- onCleared --")
        // ここに
        // ViewModelの削除時に実行する処理を書く
    }
}