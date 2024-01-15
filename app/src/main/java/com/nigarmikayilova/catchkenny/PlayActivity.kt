package com.nigarmikayilova.catchkenny

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import com.nigarmikayilova.catchkenny.databinding.ActivityPlayBinding

class PlayActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPlayBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityPlayBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)


    }


    fun thirty(view: View){
        val intent= Intent(this@PlayActivity,thirstyActivity::class.java)
        startActivity(intent)
        this.finish()



    }


    fun sixty(view:View){
        val intent= Intent(this@PlayActivity,SixtyActivity::class.java)
        startActivity(intent)

    }

    fun ninety(view:View){
        val intent= Intent(this@PlayActivity,NinetyActivity::class.java)
        startActivity(intent)

    }

}