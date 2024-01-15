package com.nigarmikayilova.catchkenny

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.nigarmikayilova.catchkenny.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)





    }
    fun play(view:View){
        val intent= Intent(this@MainActivity,charactersActivity::class.java)
        startActivity(intent)


    }





}