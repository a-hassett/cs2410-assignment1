package com.allykh.assignment1

import android.content.Context
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

class LabelledInput (context: Context, labelText: String) : LinearLayout(context) {
    private val inputText = EditText(context)

    fun getInput(): String {
        return inputText.text.toString()
    }

    init {
        orientation = VERTICAL
        val label = TextView(context)
        label.text = labelText

        addView(label)
        addView(inputText)
    }

}