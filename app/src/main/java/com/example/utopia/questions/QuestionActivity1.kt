package com.example.utopia.questions

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.example.utopia.R
import android.system.Os.link

import android.content.Intent
import com.example.utopia.ProbabilityActivity


class QuestionActivity1 : AppCompatActivity() {

    private lateinit var a2 : EditText
    private lateinit var a3 : EditText
    private lateinit var a4 : EditText
    private lateinit var a5 : EditText
    private lateinit var a6 : EditText
    private lateinit var a7 : EditText
    private lateinit var a8 : EditText
    private lateinit var a9 : EditText
    private lateinit var a10 : EditText
    private lateinit var a11 : EditText
    private lateinit var a12 : EditText
    private lateinit var a13 : EditText
    private lateinit var a14 : EditText
    private lateinit var a15 : EditText
    private lateinit var a16 : EditText
    private lateinit var a17 : EditText
    private lateinit var a18 : EditText
    private lateinit var a19 : EditText
    private lateinit var a20 : EditText
    private lateinit var a21 : EditText
    private lateinit var a22 : EditText
    private lateinit var a23 : EditText
    private lateinit var a24 : EditText
    private lateinit var a25 : EditText
    private lateinit var a26 : EditText
    private lateinit var a27 : EditText
    private lateinit var a28 : EditText
    private lateinit var a29 : EditText
    private lateinit var a30 : EditText
    private lateinit var a31 : EditText
    private lateinit var a32 : EditText
    private lateinit var a33 : EditText
    private lateinit var a34 : EditText
    private lateinit var a35 : EditText
    private lateinit var a36 : EditText
    private lateinit var a37 : EditText
    private lateinit var a38 : EditText
    private lateinit var a39 : EditText
    private lateinit var a40 : EditText
    private lateinit var a41 : EditText
    private lateinit var a42 : EditText

    private lateinit var but1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)
        a2 = findViewById(R.id.age)
        a3 = findViewById(R.id.answer1)
        a4 = findViewById(R.id.answer2)
        a5 = findViewById(R.id.answer3)
        a6 = findViewById(R.id.answer4)
        a7 = findViewById(R.id.answer5)
        a8 = findViewById(R.id.answer6)
        a9 = findViewById(R.id.answer7)
        a10 = findViewById(R.id.answer8)
        a11 = findViewById(R.id.answer9)
        a12 = findViewById(R.id.answer10)
        a13 = findViewById(R.id.answer11)
        a14 = findViewById(R.id.answer12)
        a15 = findViewById(R.id.answer13)
        a16 = findViewById(R.id.answer14)
        a17 = findViewById(R.id.answer15)
        a18 = findViewById(R.id.answer16)
        a19 = findViewById(R.id.answer17)
        a20 = findViewById(R.id.answer18)
        a21 = findViewById(R.id.answer19)
        a22 = findViewById(R.id.answer20)
        a23 = findViewById(R.id.answer21)
        a24 = findViewById(R.id.answer22)
        a25 = findViewById(R.id.answer23)
        a26 = findViewById(R.id.answer24)
        a27 = findViewById(R.id.answer25)
        a28 = findViewById(R.id.answer26)
        a29 = findViewById(R.id.answer27)
        a30 = findViewById(R.id.answer28)
        a31 = findViewById(R.id.answer29)
        a32 = findViewById(R.id.answer30)
        a33 = findViewById(R.id.answer31)
        a34 = findViewById(R.id.answer32)
        a35 = findViewById(R.id.answer33)
        a36 = findViewById(R.id.answer34)
        a37 = findViewById(R.id.answer35)
        a38 = findViewById(R.id.answer36)
        a39 = findViewById(R.id.answer37)
        a40 = findViewById(R.id.answer38)
        a41 = findViewById(R.id.answer39)
        a42 = findViewById(R.id.answer40)


        but1 = findViewById(R.id.predict)
        but1.setOnClickListener {
            val url = "https://utopia-teamup.herokuapp.com/?Age="+a2.text+"&Weight="+a3.text+"&Height="+a4.text+"&BMI="+a5.text+"&BloodGroup="+a6.text+"&Pulserate="+a7.text+"&RR="+a8.text+"&Hb="+a9.text+"&Cycle="+a10.text+"&Cyclelength="+a11.text+"&MarriageStatus="+a12.text+"&Pregnant="+a13.text+"&Noofabortions="+a14.text+"&IbetaHCG="+a15.text+"&IIbetaHCG="+a16.text+"&FSH="+a17.text+"&LH="+a18.text+"&FSH_LH="+a19.text+"&Hip="+a20.text+"&Waist="+a21.text+"&WaistHipRatio="+a22.text+"&TSH="+a23.text+"&AMH="+a24.text+"&PRL="+a25.text+"&VitD3="+a26.text+"&PRG="+a27.text+"&RBS="+a28.text+"&Weightgain="+a29.text+"&hairgrowth="+a30.text+"&Skindarkening="+a31.text+"&Hairloss="+a32.text+"&Pimples="+a33.text+"&Fastfood="+a34.text+"&RegExercise="+a35.text+"&BP_Systolic="+a36.text+"&BP_Diastolic="+a37.text+"&FollicleNo1="+a38.text+"&FollicleNo2="+a39.text+"&AvgFsize1="+a40.text+"&AvgFsize2="+a41.text+"&Endometrium="+a42.text
            val queue = Volley.newRequestQueue(this)
            val jsonObjectRequest = JsonObjectRequest(
                Request.Method.GET, url, null,
                { response ->
                    Log.e("Response:", response.getString("prediction"))
                    val intent = Intent(this, ProbabilityActivity::class.java)
                    intent.putExtra("Response", response.getString("prediction"))
                    startActivity(intent)
                    finish()
                },
                { error ->
                    Log.e("Response:", "Error ")

                }
            )
            queue.add(jsonObjectRequest)

// Access the RequestQueue through your singleton class.

        }

//
//        Log.e("e1",a3.text.toString())
//        Log.e("e2",a4.text.toString())
//        Log.e("e3",a9.text.toString())


    }
}