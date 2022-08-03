package com.example.sdk_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SdkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sdk)

        supportFragmentManager.beginTransaction()
            .replace(R.id.container, DataFragment())
            .commit()
    }
}