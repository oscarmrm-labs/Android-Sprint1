package com.qualentum.sprint1

import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var tvText1 : TextView
    private lateinit var tvText2 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvText1 = findViewById(R.id.tvTexto1)
        tvText2 = findViewById(R.id.tvTexto2)
        val imageButton = findViewById<ImageButton>(R.id.imgButXML)
        changeparagraphs()

        imageButton.setOnClickListener{
            changeparagraphs()
        }
    }

    private fun changeparagraphs(){
        tvText1.text = getRandomText(MIN_PARAGRAPH_LENGTH, MAX_PARAGRAPH_LENGTH)
        tvText2.text = getRandomText(MIN_PARAGRAPH_LENGTH, MAX_PARAGRAPH_LENGTH)
    }
}
