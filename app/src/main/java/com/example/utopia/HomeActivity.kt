package com.example.utopia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageButton
import com.example.utopia.questions.QuestionActivity1

@Suppress("DEPRECATION")
class HomeActivity : AppCompatActivity() {
    private lateinit var hamburgerImageButton: ImageButton
    private lateinit var button_click: Animation
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
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
        button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, QuestionActivity1::class.java)
            startActivity(intent)
            finish()
        }
        }

    }