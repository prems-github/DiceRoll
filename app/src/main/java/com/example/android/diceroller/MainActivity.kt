package com.example.android.diceroller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android.diceroller.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rollButton.setOnClickListener {
            rollDice()
        }

    }

    private fun rollDice() {

        val randomInt = Random.nextInt(6) + 1
        binding.rollText.text = randomInt.toString()
    }
}