package com.example.uicustomviews

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class TitleLayout(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {
    init {
        LayoutInflater.from(context).inflate(R.layout.title, this)

        findViewById<Button>(R.id.titleBack).setOnClickListener {
            val activity = context as Activity
            activity.finish()
        }
        findViewById<Button>(R.id.titleEdit).setOnClickListener {
            Toast.makeText(context, "You Clicked Edit Button!", Toast.LENGTH_SHORT).show()
        }
    }

}