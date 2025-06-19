package com.example.startproject

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var seasonInput: EditText
    private lateinit var showSeasonButton: Button
    private lateinit var seasonResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seasonInput = findViewById(R.id.seasonInput)
        showSeasonButton = findViewById(R.id.showSeasonButton)
        seasonResult = findViewById(R.id.seasonResult)

        showSeasonButton.setOnClickListener {
            val input = seasonInput.text.toString().trim()
            val result = when (input.toIntOrNull()) {
                1 -> "Зима"
                2 -> "Весна"
                3 -> "Лето"
                4 -> "Осень"
                else -> "Ошибка: введите число от 1 до 4"
            }
            seasonResult.text = result
        }
    }
}