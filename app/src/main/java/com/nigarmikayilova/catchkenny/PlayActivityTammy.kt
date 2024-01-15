package com.nigarmikayilova.catchkenny

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.nigarmikayilova.catchkenny.databinding.ActivityPlayTammyBinding

class PlayActivityTammy : AppCompatActivity() {
    private lateinit var binding: ActivityPlayTammyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityPlayTammyBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

    }
    fun thirty(view: View){
        val intent= Intent(this@PlayActivityTammy,thirstyActivityTammy::class.java)
        startActivity(intent)
        this.finish()



    }


    fun sixty(view: View){
        val intent= Intent(this@PlayActivityTammy,SixtyActivityTammy::class.java)
        startActivity(intent)

    }

    fun ninety(view: View){
        val intent= Intent(this@PlayActivityTammy,NinetyActivityTammy::class.java)
        startActivity(intent)

    }



}