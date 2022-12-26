package com.allykh.assignment1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.LinearLayout
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        val layout2 = LinearLayout(this)
        layout2.orientation = LinearLayout.VERTICAL

        setContentView(layout)

        val title = TextView(this)
        title.text = "Welcome to Mad Libs!"

        val label1 = LabelledInput(this, "\nplural noun")
        val label2 = LabelledInput(this, "adjective")
        val label3 = LabelledInput(this, "number")
        val label4 = LabelledInput(this, "place")
        val label5 = LabelledInput(this, "verb in past tense")
        val label6 = LabelledInput(this, "adjective")
        val label7 = LabelledInput(this, "disease")
        val label8 = LabelledInput(this, "verb in present tense")
        val label9 = LabelledInput(this, "adjective")

        val finishButton = Button(this)
        finishButton.text = "Enter"
        val backButton = Button(this)
        backButton.text = "Restart"
        var story = TextView(this)

        layout.addView(title)
        layout.addView(label1)
        layout.addView(label2)
        layout.addView(label3)
        layout.addView(label4)
        layout.addView(label5)
        layout.addView(label6)
        layout.addView(label7)
        layout.addView(label8)
        layout.addView(label9)
        layout.addView(finishButton)

        layout2.addView(story)
        layout2.addView(backButton)

        finishButton.setOnClickListener() {
            setContentView(layout2)
            story.text = "\nGood morning, " + label1.getInput() + "! I have a few announcements to make but, first, I need to address the " + label2.getInput() + " event from yesterday. As many of you may know, over " + label3.getInput() + " chickens were released into " + label4.getInput() + " during lunch, and several students were " + label5.getInput() + ". So anyone who was pecked by those " + label6.getInput() + " animals yesterday needs to get checked for rabies and " + label7.getInput() + ". If you don’t, you could " + label8.getInput() + ". Alrighty, have a(n) " + label9.getInput() + " day, everyone!"
        }

        backButton.setOnClickListener() {
            setContentView(layout)
        }
    }
}