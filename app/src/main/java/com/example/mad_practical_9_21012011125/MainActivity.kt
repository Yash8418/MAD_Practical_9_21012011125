package com.example.mad_practical_9_21012011125

import android.graphics.drawable.AnimationDrawable
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var animAlarm:AnimationDrawable
    lateinit var animHeart:AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val alarmIv:ImageView=findViewById(R.id.imageView)
        animAlarm = alarmIv.drawable as AnimationDrawable
        animAlarm.start()

        val heartIv:ImageView=findViewById(R.id.imageView2)
        animHeart = heartIv.drawable as AnimationDrawable
        animHeart.start()
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if(hasFocus){
            animAlarm.start()
            animHeart.start()
        }
        else{
            animAlarm.stop()
            animHeart.stop()
        }
    }
}
