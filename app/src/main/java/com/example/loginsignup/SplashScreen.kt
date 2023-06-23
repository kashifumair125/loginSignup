package com.example.loginsignup

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

@SuppressLint("CustomSplashScreen")
class SplashScreen : AppCompatActivity() {
    lateinit var countDownTimer:CountDownTimer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

       countDownTimer=object :CountDownTimer(1500,500) {

           override fun onTick(millisUntilFinished: Long) {
           }

           override fun onFinish() {
               startActivity(Intent(this@SplashScreen, SignInActivity::class.java))
               overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)

               finish()
           }
       }.start()

      //  iv_note.animate().setDuration(1500),alpha (value:1f).withEndAction{


//            val i =Intent(this,MainActivity::class.java)
//            startActivity(i)
//            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
//            finish()

        }
    }