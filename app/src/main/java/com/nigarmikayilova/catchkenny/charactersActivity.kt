package com.nigarmikayilova.catchkenny

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.nigarmikayilova.catchkenny.databinding.ActivityCharactersBinding

class charactersActivity : AppCompatActivity() {
    private lateinit var binding:ActivityCharactersBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityCharactersBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

    }


    fun kenny(view: View){
        val intent= Intent(this@charactersActivity,PlayActivity::class.java)
        startActivity(intent)

    }

    fun tammy(view: View){
        val intent= Intent(this@charactersActivity,PlayActivityTammy::class.java)
        startActivity(intent)


    }
}