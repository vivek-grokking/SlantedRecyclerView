package com.vader.slantedrecyclerview.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.vader.slantedrecyclerview.R;

/**
 * Created by vader on 1/12/16.
 */

public abstract class BaseViewHolder extends RecyclerView.ViewHolder {

    public TextView movieNameTv;
    public ImageView background;

    public BaseViewHolder(View itemView) {
        super(itemView);
        movieNameTv = (TextView) itemView.findViewById(R.id.movie_name);
    }

}
