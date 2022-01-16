package com.example.utopia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MenuActivity : AppCompatActivity() {

    private lateinit var home: TextView
    private lateinit var about_us: TextView
    private lateinit var schedule: TextView
    private lateinit var steps: TextView
    private lateinit var symptoms: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        home = findViewById(R.id.home)
        home.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        })
        schedule = findViewById(R.id.schedule)
        schedule.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, ScheduleActivity::class.java)
            startActivity(intent)
            finish()
        })
        steps = findViewById(R.id.steps)
        steps.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, StepsActivity::class.java)
            startActivity(intent)
            finish()
        })
        symptoms = findViewById(R.id.symptoms)
        symptoms.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, SymptomsActivity::class.java)
            startActivity(intent)
            finish()
        })
        about_us = findViewById(R.id.about)
        about_us.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
            finish()
        })
    }
}