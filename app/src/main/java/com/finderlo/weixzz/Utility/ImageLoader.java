package com.finderlo.weixzz.Utility;

import android.content.Context;

import com.finderlo.weixzz.Widgt.BaseImageView;
import com.squareup.picasso.Picasso;

/**
 * Created by Finderlo on 2016/8/8.
 */
public class ImageLoader {

    public static void load(Context context, String imageUrl, BaseImageView imageView) {
        Picasso.with(context).load(imageUrl).into(imageView);
        imageView.setPic_Url(imageUrl);
    }
}