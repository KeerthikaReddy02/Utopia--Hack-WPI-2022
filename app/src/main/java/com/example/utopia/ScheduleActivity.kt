package com.example.utopia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageButton

@Suppress("DEPRECATION")
class ScheduleActivity : AppCompatActivity() {
    private lateinit var hamburgerImageButton: ImageButton
    private lateinit var button_click: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_schedule)

        button_click = AnimationUtils.loadAnimation(this, R.anim.button_click)

        hamburgerImageButton = findViewById(R.id.hamburgerImageButton)

        hamburgerImageButton.setOnClickListener(View.OnClickListener {
            hamburgerImageButton.setAnimation(button_click)
            Handler().postDelayed({
                val intent = Intent(this, MenuActivity::class.java)
                startActivity(intent)
                finish()
            }, 200)
        })
    }
}