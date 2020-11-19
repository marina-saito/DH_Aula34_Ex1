package com.example.exercicio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreen : AppCompatActivity() {

    val scope = CoroutineScope(Dispatchers.Main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

//        scope.launch {
//            delay(2000)
//
//            startActivity(Intent(this@SplashScreen, MainActivity::class.java))
//        }

//        Thread(
//            Runnable {
//                Thread.sleep(2000)
//                startActivity(Intent(this@SplashScreen, MainActivity::class.java))
//
//            }).start()

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this@SplashScreen, MainActivity::class.java))
        }, 2000)

    }
}