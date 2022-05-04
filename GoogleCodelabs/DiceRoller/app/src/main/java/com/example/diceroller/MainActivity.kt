package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
//import android.widget.Toast

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
//        rollButton.setOnClickListener {
//           Toast.makeText(this, "Dice Rolled! Yaaaas!", Toast.LENGTH_LONG).show()
//        }
        rollButton.setOnClickListener { rollDice() }
    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val specialDice = Dice(6)
//        val diceRoll = dice.roll()
//        val specialdiceRoll = specialDice.roll()
        // Update the screen with the dice roll
//        val resultATextView: TextView = findViewById(R.id.textView)
//        resultATextView.text = diceRoll.toString()
//        val resultBTextView: TextView = findViewById(R.id.textView2)
//        resultBTextView.text = specialdiceRoll.toString()
        val diceImage1: ImageView = findViewById(R.id.Dado1)
        diceImage1.setImageResource(R.drawable.dice_2)

        val diceImage2: ImageView = findViewById(R.id.Dado2)
        diceImage2.setImageResource(R.drawable.dice_2)


    }
}

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}