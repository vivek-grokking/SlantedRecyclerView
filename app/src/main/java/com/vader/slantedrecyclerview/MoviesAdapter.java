package com.vader.slantedrecyclerview;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.vader.slantedrecyclerview.model.Movie;
import com.vader.slantedrecyclerview.viewholders.BaseViewHolder;
import com.vader.slantedrecyclerview.views.HeaderImageView;
import com.vader.slantedrecyclerview.views.FooterImageView;
import com.vader.slantedrecyclerview.views.ListItemImageView;

import java.util.List;

/**
 * Created by vader on 29/11/16.
 */

public class MoviesAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private static final String TAG = "MoviesAdapter";
    private List<Movie> movies;
    private Context context;

    private final int HEADER = 0;
    private final int FOOTER = 1;
    private final int ITEM = 2;

    public MoviesAdapter(List<Movie> movies, Context context) {
        this.movies = movies;
        this.context = context;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        switch (viewType) {
            case HEADER:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movies_list_header, parent, false);
                return new HeaderViewHolder(view);

            case FOOTER:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movies_list_footer, parent, false);
                return new FooterViewHolder(view);

            default:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_list_item, parent, false);
                return new MoviesViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(final BaseViewHolder holder, int position) {
            holder.movieNameTv.setText(movies.get(position).name);
            Glide.with(context)
                    .load(movies.get(position).url)
                    .asBitmap()
                    .into(new SimpleTarget<Bitmap>() {
                        @Override
                        public void onResourceReady(Bitmap resource,
                                                    GlideAnimation<? super Bitmap> glideAnimation) {
                            holder.background.setImageBitmap(resource);
                        }
                    });
    }

    @Override
    public int getItemCount() {
        return movies != null ? movies.size() : 0;
    }

    static class MoviesViewHolder extends BaseViewHolder {
        public MoviesViewHolder(View itemView) {
            super(itemView);
            background = (ListItemImageView) itemView.findViewById(R.id.background);
        }
    }

    static class FooterViewHolder extends BaseViewHolder {
        public FooterViewHolder(View itemView) {
            super(itemView);
            background = (FooterImageView) itemView.findViewById(R.id.background);
        }
    }

    static class HeaderViewHolder extends BaseViewHolder {
        public HeaderViewHolder(View itemView) {
            super(itemView);
            background = (HeaderImageView) itemView.findViewById(R.id.background);
        }
    }

    @Override
    public int getItemViewType(int position) {
        if(position == movies.size()-1)
            return FOOTER;

        if(position == 0)
            return HEADER;

        return ITEM;
    }

}
