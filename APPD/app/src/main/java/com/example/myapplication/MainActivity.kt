package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bt:Button=findViewById(R.id.button)
        bt.setOnClickListener(View.OnClickListener {
            Toast.makeText(this,"This is made by Mohd Zia!!",Toast.LENGTH_SHORT).show() })
    }
}