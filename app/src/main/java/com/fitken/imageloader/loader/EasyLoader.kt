package com.fitken.imageloader.loader

import android.content.Context

/**
 * Created by ken on 3/22/18.
 */
class EasyLoader {

    companion object {
        fun with(context: Context): RequestBuilder {
            return RequestBuilder(context)
        }
    }
}