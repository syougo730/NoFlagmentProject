package com.example.noflagmentproject

import android.annotation.SuppressLint
import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class SubActivity : AppCompatActivity() {

    @SuppressLint("UseCompatLoadingForDrawables", "ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val scrollView: ScrollView = findViewById(R.id.scroll_view)

        // LinearLayoutの生成
        val linearLayout = LinearLayout(this).also {

            //LinearLayoutのパラメータ
            it.layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )

            val lp1: LinearLayout.LayoutParams = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT,
            )
            lp1.weight = 1f
            lp1.width = 0
            lp1.height = 200
            lp1.gravity = Gravity.LEFT
            lp1.setMargins(10,10,10,10)

            // TextView
            val textView = TextView(this)
            textView.text = "ほげほげふがふが"
            textView.gravity = Gravity.CENTER

            //image
            val image = ImageView(this)
            image.setImageResource(R.drawable.sample)
            image.scaleType = ImageView.ScaleType.CENTER_CROP

            //ボタンのスタイル　角丸設定など
            val drawable = GradientDrawable()
            drawable.cornerRadius = 20f//角丸
            drawable.setStroke(6, Color.parseColor("#FF6200EE"))//輪郭
            drawable.color = ColorStateList(//ボタン押下時・通常時の色指定
                arrayOf(intArrayOf(android.R.attr.state_pressed), intArrayOf()),
                intArrayOf(Color.parseColor("#FF6200EE"), Color.parseColor("#FF6200EE"))
            )

            //button
            val button = Button(this,null,R.attr.myButtonStyle)
            button.text = getString(R.string.sampleButton)
            button.gravity = Gravity.CENTER
            button.setBackgroundColor(Color.parseColor("#FF6200EE"))
            button.setTextColor(Color.WHITE)
            button.background = drawable

            //LinearLayoutに追加

            it.addView(image,lp1)
            it.addView(textView,lp1)
            it.addView(button,lp1)

        }

        scrollView.addView(linearLayout)
    }



}