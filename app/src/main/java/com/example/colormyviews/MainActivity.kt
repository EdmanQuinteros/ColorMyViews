package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun makeColored(
        view: View,
        boxThreeText: TextView,
        boxFourText: TextView,
        boxFiveText: TextView
    ){
        when (view.id){
            R.id.box_ine_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)

            // Boxes using custom colors for background
            //R.id.red_button -> findViewById<Button>(R.id.box_three_text).setBackgroundResource(R.color.my_red)
            R.id.red_button -> boxThreeText.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> boxFourText.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> boxFiveText.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }

        // envez de color imagenes
        /*when (view.id){
            R.id.box_ine_text -> view.setBackgroundResource(R.drawable.image_two)
            R.id.box_two_text -> view.setBackgroundResource(R.drawable.image_two)
            R.id.box_three_text -> view.setBackgroundResource(R.drawable.image_two)
            R.id.box_four_text -> view.setBackgroundResource(R.drawable.image_two)
            R.id.box_five_text -> view.setBackgroundResource(R.drawable.image_two)
            else -> view.setBackgroundResource(R.drawable.image_two)
        }*/
    }

    private fun setListeners(){
        val boxOneText = findViewById<TextView>(R.id.box_ine_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val redButton = findViewById<Button>(R.id.red_button)
        val greenButton = findViewById<Button>(R.id.green_button)
        val yellowButton = findViewById<Button>(R.id.yellow_button)

        val clickableViews: List<View> =
            listOf(boxOneText, boxTwoText, boxThreeText, boxFourText, boxFiveText,
                rootConstraintLayout, redButton, greenButton, yellowButton)

        for (item in clickableViews){
            item.setOnClickListener {makeColored(it, boxThreeText, boxFourText, boxFiveText)}
        }
    }
}