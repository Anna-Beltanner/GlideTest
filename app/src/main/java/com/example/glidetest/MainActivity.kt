package com.example.glidetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy

class MainActivity : AppCompatActivity() {

    private val image = "https://cdn.pixabay.com/photo/2018/05/03/21/49/android-3372580_960_720.png"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageOne = findViewById<ImageView>(R.id.image_one)
        val imageTwo = findViewById<ImageView>(R.id.image_two)
        val imageThree = findViewById<ImageView>(R.id.image_three)

        Glide.with(this)
            .load(image)
            .into(imageOne)

        Glide.with(this)
            .load(image)
            .fitCenter()
            .circleCrop()
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .placeholder(R.drawable.img_placeholder)
            .into(imageTwo)

        Glide.with(this)
            .load(image)
            .override(300, 400)
            .centerCrop()
            .error(R.drawable.img_placeholder)
            .into(imageThree)



    }
}