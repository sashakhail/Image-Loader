package com.fitken.imageloader.loaderjava;

import android.content.Context;
import android.widget.ImageView;

public class BuilderJava {

    private String url;
    private Context context;
    private ImageView imageView;

    public BuilderJava(Context context) {
        this.context = context;
    }

    public BuilderJava load(String url) {
        this.url = url;
        return this;
    }

    public BuilderJava with(Context context) {
        this.context = context;
        return this;
    }

    public BuilderJava into(ImageView imageView) {
        this.imageView = imageView;
        new RequestManagerJava(imageView).execute(url);
        return this;
    }
}
