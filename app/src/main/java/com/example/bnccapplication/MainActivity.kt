package com.example.bnccapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import kotlinx.android.synthetic.*

class MainActivity : AppCompatActivity() {

    companion object {
        const val extra = "Extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lookUp = findViewById<ImageButton>(R.id.imageButton1)
        lookUp.setOnClickListener(){
            openSecondActivity()
        }
    }


    //explicit
    private fun openSecondActivity(){
        val intent = Intent(this, SecondActivity2::class.java).apply{

            putExtra(extra,"ini dari acitvity 1")
        }

        startActivity(intent)
    }
    //implicit
    private fun actionData(){
        val phoneNumber = "12345"
        val intent = Intent().apply {
            action = Intent.ACTION_DIAL
            data = Uri.parse("tel:$phoneNumber")
        }

        startActivity(intent)
    }
}