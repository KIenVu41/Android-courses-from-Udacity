package com.vts.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.box_one_text -> v.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> v.setBackgroundColor(Color.GRAY)

            R.id.box_three_text -> v.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> v.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> v.setBackgroundResource(android.R.color.holo_green_light)
        }
    }

}