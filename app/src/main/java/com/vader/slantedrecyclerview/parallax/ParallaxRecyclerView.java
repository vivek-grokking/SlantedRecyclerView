package com.vader.slantedrecyclerview.parallax;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/**
 * Created by vader on 1/12/16.
 */

public class ParallaxRecyclerView extends RecyclerView {
    private ParallaxRecyclerViewHelper helper;

    public ParallaxRecyclerView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context, attrs);
    }

    public ParallaxRecyclerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    protected void init(Context context, AttributeSet attrs) {
        helper = new ParallaxRecyclerViewHelper(context, attrs, this);
        super.setOnScrollListener(helper);
    }

    @Override
    public void setOnScrollListener(RecyclerView.OnScrollListener l) {
        helper.setOnScrollListener(l);
    }

//    public void addParallaxedHeaderView(View v) {
//        super.addHeaderView(v);
//        helper.addParallaxedHeaderView(v);
//    }
//
//    public void addParallaxedHeaderView(View v, Object data, boolean isSelectable) {
//        super.addHeaderView(v, data, isSelectable);
//        helper.addParallaxedHeaderView(v, data, isSelectable);
//    }

}
