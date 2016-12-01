package com.vader.slantedrecyclerview.views;
import android.content.Context;
import android.graphics.Path;
import android.util.AttributeSet;

/**
 * Created by vader on 30/11/16.
 */

public class ListItemImageView extends BaseCustomImageView {


    public ListItemImageView(Context ctx, AttributeSet attrs) {
        super(ctx, attrs);
    }

    @Override
    protected Path getPath(int w, int h) {
        Path path = new Path();
        path.moveTo(0, 150);
        path.lineTo(w, 0);
        path.lineTo(w, h-150);
        path.lineTo(0, h);
        path.lineTo(0, 150);
        path.close();
        return path;
    }
}
