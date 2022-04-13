package com.example.noflagmentproject

import android.annotation.SuppressLint
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

            //button
            val button = Button(this,null,R.attr.myButtonStyle)
            button.text = getString(R.string.sampleButton)
            button.gravity = Gravity.CENTER
            button.setBackgroundColor(Color.parseColor("#FF6200EE"))
            button.setTextColor(Color.WHITE)

            //LinearLayoutに追加

            it.addView(image,lp1)
            it.addView(textView,lp1)
            it.addView(button,lp1)

        }

        scrollView.addView(linearLayout)
    }



}