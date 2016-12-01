package com.vader.slantedrecyclerview.views;

import android.content.Context;
import android.graphics.Path;
import android.util.AttributeSet;

/**
 * Created by vader on 1/12/16.
 */

public class FooterImageView extends BaseCustomImageView {

    public FooterImageView(Context ctx, AttributeSet attrs) {
        super(ctx, attrs);
    }

    @Override
    protected Path getPath(int w, int h) {
        Path path = new Path();
        path.moveTo(0, 200);
        path.lineTo(w, 0);
        path.lineTo(w, h);
        path.lineTo(0, h);
        path.lineTo(0, 200);
        path.close();
        return path;
    }
}
