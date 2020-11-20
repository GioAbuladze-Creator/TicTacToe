package com.example.tictactoe

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var playerOne = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        checkWinner()
    }

    private fun init() {
        button11.setOnClickListener {
            buttonChange(button11)
            checkWinner()
        }
        button12.setOnClickListener {
            buttonChange(button12)
            checkWinner()
        }
        button13.setOnClickListener {
            buttonChange(button13)
            checkWinner()
        }
        button21.setOnClickListener {
            buttonChange(button21)
            checkWinner()
        }
        button22.setOnClickListener {
            buttonChange(button22)
            checkWinner()
        }
        button23.setOnClickListener {
            buttonChange(button23)
            checkWinner()
        }
        button31.setOnClickListener {
            buttonChange(button31)
            checkWinner()
        }
        button32.setOnClickListener {
            buttonChange(button32)
            checkWinner()
        }
        button33.setOnClickListener {
            buttonChange(button33)
            checkWinner()

        }


    }

    private fun buttonChange(button: Button) {
        if (playerOne) {
            button.text = "X"
        } else {
            button.text = "0"
        }
        button.isClickable = false
        playerOne = !playerOne
    }

    private fun checkWinner() {
        if (button11.text.toString()
                .isNotEmpty() && button11.text.toString() == button12.text.toString() && button12.text.toString() == button13.text.toString()
        )
            showToast(button11.text.toString())
        else if (button21.text.toString()
                .isNotEmpty() && button21.text.toString() == button22.text.toString() && button22.text.toString() == button23.text.toString()
        )
            showToast(button21.text.toString())
        else if (button31.text.toString()
                .isNotEmpty() && button31.text.toString() == button32.text.toString() && button32.text.toString() == button33.text.toString()
        )
            showToast(button31.text.toString())
        else if (button11.text.toString()
                .isNotEmpty() && button11.text.toString() == button21.text.toString() && button11.text.toString() == button31.text.toString()
        )
            showToast(button11.text.toString())
        else if (button12.text.toString()
                .isNotEmpty() && button12.text.toString() == button22.text.toString() && button22.text.toString() == button32.text.toString()
        )
            showToast(button12.text.toString())
        else if (button31.text.toString()
                .isNotEmpty() && button31.text.toString() == button32.text.toString() && button32.text.toString() == button33.text.toString()
        )
            showToast(button31.text.toString())
        else if (button11.text.toString()
                .isNotEmpty() && button11.text.toString() == button22.text.toString() && button22.text.toString() == button33.text.toString()
        )
            showToast(button11.text.toString())
        else if (button31.text.toString()
                .isNotEmpty() && button31.text.toString() == button22.text.toString() && button22.text.toString() == button13.text.toString()
        )
            showToast(button21.text.toString())
        else if (button11.text.toString().isNotEmpty() && button11.text.toString()
                .isNotEmpty() && button11.text.toString().isNotEmpty()
            && button21.text.toString().isNotEmpty() && button22.text.toString()
                .isNotEmpty() && button23.text.toString().isNotEmpty()
            && button31.text.toString().isNotEmpty() && button32.text.toString()
                .isNotEmpty() && button33.text.toString().isNotEmpty()
        )
            Toast.makeText(this, "It's a Tie", Toast.LENGTH_SHORT).show()


    }

    private fun showToast(message: String) {
        Toast.makeText(this, "The Winner is $message", Toast.LENGTH_SHORT).show()
        button11.isClickable = false
        button12.isClickable = false
        button13.isClickable = false
        button21.isClickable = false
        button22.isClickable = false
        button23.isClickable = false
        button31.isClickable = false
        button32.isClickable = false
        button33.isClickable = false
        resetButton.setOnClickListener{
            restart(button11)
            restart(button12)
            restart(button13)
            restart(button21)
            restart(button22)
            restart(button23)
            restart(button31)
            restart(button32)
            restart(button33)
        }

    }

    private fun restart(button: Button) {
        button.text = ""
        button.isClickable=true

    }

}


