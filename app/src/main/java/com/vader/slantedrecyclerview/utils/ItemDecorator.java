package com.vader.slantedrecyclerview.utils;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by vader on 29/11/16.
 */

public class ItemDecorator extends RecyclerView.ItemDecoration {

    private static final String TAG = "ItemDecorator";

    public ItemDecorator() {}

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.left = 0;
        outRect.right = 0;
        outRect.bottom = -200;
        outRect.top = 0;
    }

}
