package com.example.noflagmentproject

import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class SubActivity : AppCompatActivity() {

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
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
            )
            lp1.weight = 2f
            lp1.width = 200
            lp1.height = 200
            lp1.gravity = Gravity.CENTER

            // TextView
            val textView = TextView(this)
            textView.text = "ほげほげふがふが"

            //spacer
            val space = Space(this)

            //image
            val image = ImageView(this)
            image.setImageResource(R.drawable.sample)

            //button
            val button = Button(this)
            button.text = getString(R.string.sampleButton)


            //LinearLayoutに追加

            it.addView(image,lp1)
//            it.addView(space)
            it.addView(textView,lp1)
//            it.addView(space)
            it.addView(button,lp1)

        }

        scrollView.addView(linearLayout)
    }



}