package com.example.bnccapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bnccapplication.lookup.LookUpData
import com.example.bnccapplication.lookup.adapter.LookUpAdapter
import kotlinx.android.synthetic.main.activity_second2.*

class SecondActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)

        val backButton = findViewById<ImageButton>(R.id.ibBackLookUp)
        backButton.setOnClickListener(){
            finish();
        }

        val mockUpData = mutableListOf<LookUpData>(
            LookUpData(provinceName = "Jakarta",deathCase = 12345,totalCase = 54321, recoverdCase = 98762),
            LookUpData(deathCase = 212345,totalCase = 354321,recoverdCase = 267890,provinceName = "Medan"),
            LookUpData(deathCase = 123453,totalCase = 154321,recoverdCase = 167890,provinceName = "Palembang"),
            LookUpData(deathCase = 123454,totalCase = 254321,recoverdCase = 367890,provinceName = "Pekanbaru"),
            LookUpData(deathCase = 123451,totalCase = 354321,recoverdCase = 267890,provinceName = "Gunung sitoli"),
            LookUpData(deathCase = 123453,totalCase = 554321,recoverdCase = 567890,provinceName = "Bandung"),
            LookUpData(deathCase = 123458,totalCase = 854321,recoverdCase = 867890,provinceName = "Papua")

        )
        val adapterRv = LookUpAdapter(mockUpData)
        rvLookUp.layoutManager = LinearLayoutManager(this)
        rvLookUp.adapter = adapterRv
    }
}