package com.example.noflagmentproject

import androidx.lifecycle.ViewModel
import java.lang.reflect.Method

/**
 * チェック状態を管理するVM
 */
class CheckedViewModel: ViewModel() {
    var checkbox1 : Boolean = false
    var checkbox2 : Boolean = true

    override fun onCleared() {
        super.onCleared()
        // ここに
        // ViewModelの削除時に実行する処理を書く
    }
}