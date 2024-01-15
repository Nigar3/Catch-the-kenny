package com.nigarmikayilova.catchkenny

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.View.GONE
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.nigarmikayilova.catchkenny.databinding.ActivitySixtyBinding
import com.nigarmikayilova.catchkenny.databinding.ActivityThirstyBinding
import java.lang.Math.random
import java.util.ArrayList
import java.util.Random

class SixtyActivity : AppCompatActivity() {
    val imageviews= ArrayList<ImageView>()

    private lateinit var binding:ActivitySixtyBinding
    var score=0
    var runnable=Runnable{}
    var handler= Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding=ActivitySixtyBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        hideImages()




        object:CountDownTimer(60000,1000){



            override fun onTick(p0: Long) {
                binding.textView2.text = "Left: ${p0/1000}"


                /*binding.imageView16.setOnClickListener{

                    score++
                    binding.textView3.text="Score: ${score}"
                }*/


            }

            override fun onFinish() {
                handler.removeCallbacks(runnable)

                binding.textView2.text = "Left: 0"

                val alert=AlertDialog.Builder(this@SixtyActivity)
                alert.setTitle("Restart game!")
                alert.setMessage("Are you ready to restart the game?")
                alert.setPositiveButton("Yes"){p0,p1->
                    handler.postDelayed(runnable,365)
                    score=0
                    binding.textView3.text="Score: ${score}"



                    Toast.makeText(this@SixtyActivity,"Restarting game!", Toast.LENGTH_LONG).show()
                    this.start()


                }
                alert.setNegativeButton("No"){ p0,p1 ->
                    Toast.makeText(this@SixtyActivity,"Exit game!",Toast.LENGTH_LONG).show()
                    val intent= Intent(this@SixtyActivity,PlayActivity::class.java)
                    startActivity(intent)
                    finish()

                }
                alert.show()
            }


        }.start()


    }

    private fun hideImages() {


        runnable=object:Runnable{
            override fun run() {
                val imageviews= ArrayList<ImageView>()
                imageviews.add(binding.imageView23)
                imageviews.add(binding.imageView14)
                imageviews.add(binding.imageView15)
                imageviews.add(binding.imageView17)
                imageviews.add(binding.imageView18)
                imageviews.add(binding.imageView19)
                imageviews.add(binding.imageView20)
                imageviews.add(binding.imageView21)
                imageviews.add(binding.imageView22)

                for (image in imageviews){
                    image.visibility=View.INVISIBLE
                }
                val random=Random()
                val randomIndex=random.nextInt(9)
                imageviews[randomIndex].visibility=View.VISIBLE

                handler.postDelayed(runnable,365)

            }

        }
        handler.post(runnable)



    }


    fun score(view:View){
        score=score+1
        binding.textView3.text="Score: ${score}"
    }

}




