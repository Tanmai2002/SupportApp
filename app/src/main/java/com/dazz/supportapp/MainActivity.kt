package com.dazz.supportapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dazz.mymodule.Toaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toaster.simpleToast(applicationContext,"hoo")
    }
}