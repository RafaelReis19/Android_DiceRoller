package com.example.myaleatoryapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            val toast = Toast.makeText(this, "Rolou o dado!", Toast.LENGTH_SHORT).show()
        rollDice()
            /*val resultTextView: TextView = findViewById(R.id.textView)
            resultTextView.text = "6"*/
        }
    }

    private fun rollDice() {
        val dice = Dice (6)
        val diceRoll = dice.roll()
        /*val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()*/
        val diceImage: ImageView = findViewById(R.id.imageView)
        /*when (diceRoll) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }*/
        val drawableResource = when (diceRoll){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
        diceImage.contentDescription = diceRoll.toString()


    }
}
class Dice (private val numSide: Int) {
    fun roll(): Int{
        return(1..numSide).random()
    }
}
