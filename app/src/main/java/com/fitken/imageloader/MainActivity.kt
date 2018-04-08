package com.fitken.imageloader

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.fitken.imageloader.databinding.ActivityMainBinding
import com.fitken.imageloader.loader.EasyLoader
import android.graphics.BitmapFactory
import android.graphics.Bitmap
import com.bumptech.glide.Glide
import com.fitken.imageloader.loaderjava.EasyLoaderJava
import java.net.URL


class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val url = "https://kenh14cdn.com/2017/img-0190-1500373011709.jpg"
//        Glide.with(this).load(url).into(mBinding.ivPhoto)

//        EasyLoader.with(this).load("https://kenh14cdn.com/2017/img-0190-1500373011709.jpg").into(mBinding.ivPhoto)

//        EasyLoaderJava.with(this).load(url).into(mBinding.ivPhoto)
        EasyLoader.with(this).load(url).into(mBinding.ivPhoto)

    }
}
