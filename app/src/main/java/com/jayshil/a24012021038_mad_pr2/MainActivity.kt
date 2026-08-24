package com.jayshil.a24012021038_mad_pr2

import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        display( "onCreate method is called")
    }

    override fun onStart() {
        display("onStart method is called")
        super.onStart()
    }

    override fun onPause() {
        display("onPause method is called")
        super.onPause()
    }

    override fun onResume() {
        display("onResume method is called")
        super.onResume()
    }

    override fun onStop() {
        display("onStop method is called")
        super.onStop()
    }

    override fun onDestroy() {
        display( "onDestroy method is called")
        super.onDestroy()
    }

    override fun onRestart() {
        display("onRestart method is called")
        super.onRestart()
    }

    fun display(msg:String){
        Log.i(Tag, msg)
        Toast.makeText( this, msg, Toast.LENGTH_SHORT).show()
    }
}