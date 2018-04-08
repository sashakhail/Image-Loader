package com.fitken.imageloader.loader

import android.content.Context
import android.widget.ImageView

class RequestBuilder(context: Context) {
    lateinit var mUrl: String
    var mContext = context
    lateinit var mImageView: ImageView

    fun load(url: String): RequestBuilder {
        mUrl = url
        return this
    }

    fun into(imageView: ImageView): RequestBuilder {
        mImageView = imageView
        RequestManager(mImageView).execute(mUrl)
        return this
    }

}