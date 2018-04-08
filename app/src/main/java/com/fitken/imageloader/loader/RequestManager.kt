package com.fitken.imageloader.loader

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.AsyncTask
import android.widget.ImageView
import java.io.InputStream
import java.lang.ref.WeakReference
import java.net.HttpURLConnection
import java.net.URL

class RequestManager(imageView: ImageView) : AsyncTask<String, Void, Bitmap?>() {
    private var mImageView: WeakReference<ImageView> = WeakReference(imageView)
    override fun doInBackground(vararg urls: String?): Bitmap? {
        val url = urls[0]
        val bitmap: Bitmap?
        try {
            val connection = URL(url).openConnection() as HttpURLConnection
            connection.connectTimeout = 5000
            connection.readTimeout = 5000
            connection.connect()
            val inputStream: InputStream = connection.inputStream
            bitmap = BitmapFactory.decodeStream(inputStream)
        } catch (e: Exception) {
            e.printStackTrace()
            return null
        }
        return bitmap
    }

    override fun onPostExecute(result: Bitmap?) {
        super.onPostExecute(result)
        mImageView.get()?.setImageBitmap(result)
    }
}