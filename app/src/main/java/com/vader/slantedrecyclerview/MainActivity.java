package com.vader.slantedrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.vader.slantedrecyclerview.model.ListItem;
import com.vader.slantedrecyclerview.parallax.ParallaxRecyclerView;
import com.vader.slantedrecyclerview.utils.ItemDecorator;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ParallaxRecyclerView moviesRecyclerView  = (ParallaxRecyclerView) findViewById(R.id.movies_recycle_view);
        MoviesAdapter moviesAdapter = new MoviesAdapter(createDummyData(), MainActivity.this);
        moviesRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        moviesRecyclerView.setAdapter(moviesAdapter);
        moviesRecyclerView.setHasFixedSize(true);
        moviesRecyclerView.addItemDecoration(new ItemDecorator());
    }

    private List<ListItem> createDummyData() {
        List<ListItem> movies = new ArrayList<>();
        movies.add(new ListItem("We Bought A Zoo", "http://vignette1.wikia.nocookie.net/howearlaskedsheena/images/0/01/We-bought-a-zoo-poster05web.jpg/revision/latest?cb=20131204051410"));
        movies.add(new ListItem("Predestination", "http://www.tribute.ca/images/videos/predestination-12300-large.jpg"));
        movies.add(new ListItem("Upstrean Color", "http://iris.theaureview.com/wp-content/uploads/2016/04/Upstream-Color.jpeg"));
        movies.add(new ListItem("We Bought A Zoo", "http://vignette1.wikia.nocookie.net/howearlaskedsheena/images/0/01/We-bought-a-zoo-poster05web.jpg/revision/latest?cb=20131204051410"));
        movies.add(new ListItem("Predestination", "http://www.tribute.ca/images/videos/predestination-12300-large.jpg"));
        movies.add(new ListItem("Upstrean Color", "http://iris.theaureview.com/wp-content/uploads/2016/04/Upstream-Color.jpeg"));
        movies.add(new ListItem("We Bought A Zoo", "http://vignette1.wikia.nocookie.net/howearlaskedsheena/images/0/01/We-bought-a-zoo-poster05web.jpg/revision/latest?cb=20131204051410"));
        movies.add(new ListItem("Predestination", "http://www.tribute.ca/images/videos/predestination-12300-large.jpg"));
        movies.add(new ListItem("Upstrean Color", "http://iris.theaureview.com/wp-content/uploads/2016/04/Upstream-Color.jpeg"));
        movies.add(new ListItem("We Bought A Zoo", "http://vignette1.wikia.nocookie.net/howearlaskedsheena/images/0/01/We-bought-a-zoo-poster05web.jpg/revision/latest?cb=20131204051410"));
        movies.add(new ListItem("Predestination", "http://www.tribute.ca/images/videos/predestination-12300-large.jpg"));
        movies.add(new ListItem("Upstrean Color", "http://iris.theaureview.com/wp-content/uploads/2016/04/Upstream-Color.jpeg"));
        movies.add(new ListItem("We Bought A Zoo", "http://vignette1.wikia.nocookie.net/howearlaskedsheena/images/0/01/We-bought-a-zoo-poster05web.jpg/revision/latest?cb=20131204051410"));
        movies.add(new ListItem("Predestination", "http://www.tribute.ca/images/videos/predestination-12300-large.jpg"));
        movies.add(new ListItem("Upstrean Color", "http://iris.theaureview.com/wp-content/uploads/2016/04/Upstream-Color.jpeg"));
        movies.add(new ListItem("We Bought A Zoo", "http://vignette1.wikia.nocookie.net/howearlaskedsheena/images/0/01/We-bought-a-zoo-poster05web.jpg/revision/latest?cb=20131204051410"));
        movies.add(new ListItem("Predestination", "http://www.tribute.ca/images/videos/predestination-12300-large.jpg"));
        movies.add(new ListItem("Upstrean Color", "http://iris.theaureview.com/wp-content/uploads/2016/04/Upstream-Color.jpeg"));
        movies.add(new ListItem("We Bought A Zoo", "http://vignette1.wikia.nocookie.net/howearlaskedsheena/images/0/01/We-bought-a-zoo-poster05web.jpg/revision/latest?cb=20131204051410"));
        movies.add(new ListItem("Predestination", "http://www.tribute.ca/images/videos/predestination-12300-large.jpg"));
        movies.add(new ListItem("Upstrean Color", "http://iris.theaureview.com/wp-content/uploads/2016/04/Upstream-Color.jpeg"));
        movies.add(new ListItem("We Bought A Zoo", "http://vignette1.wikia.nocookie.net/howearlaskedsheena/images/0/01/We-bought-a-zoo-poster05web.jpg/revision/latest?cb=20131204051410"));
        movies.add(new ListItem("Predestination", "http://www.tribute.ca/images/videos/predestination-12300-large.jpg"));
        movies.add(new ListItem("Upstrean Color", "http://iris.theaureview.com/wp-content/uploads/2016/04/Upstream-Color.jpeg"));
        movies.add(new ListItem("We Bought A Zoo", "http://vignette1.wikia.nocookie.net/howearlaskedsheena/images/0/01/We-bought-a-zoo-poster05web.jpg/revision/latest?cb=20131204051410"));
        movies.add(new ListItem("Predestination", "http://www.tribute.ca/images/videos/predestination-12300-large.jpg"));
        movies.add(new ListItem("Upstrean Color", "http://iris.theaureview.com/wp-content/uploads/2016/04/Upstream-Color.jpeg"));
        movies.add(new ListItem("We Bought A Zoo", "http://vignette1.wikia.nocookie.net/howearlaskedsheena/images/0/01/We-bought-a-zoo-poster05web.jpg/revision/latest?cb=20131204051410"));
        movies.add(new ListItem("Predestination", "http://www.tribute.ca/images/videos/predestination-12300-large.jpg"));
        movies.add(new ListItem("Upstrean Color", "http://iris.theaureview.com/wp-content/uploads/2016/04/Upstream-Color.jpeg"));
        movies.add(new ListItem("We Bought A Zoo", "http://vignette1.wikia.nocookie.net/howearlaskedsheena/images/0/01/We-bought-a-zoo-poster05web.jpg/revision/latest?cb=20131204051410"));
        movies.add(new ListItem("Predestination", "http://www.tribute.ca/images/videos/predestination-12300-large.jpg"));
        movies.add(new ListItem("Upstrean Color", "http://iris.theaureview.com/wp-content/uploads/2016/04/Upstream-Color.jpeg"));
        movies.add(new ListItem("We Bought A Zoo", "http://vignette1.wikia.nocookie.net/howearlaskedsheena/images/0/01/We-bought-a-zoo-poster05web.jpg/revision/latest?cb=20131204051410"));
        movies.add(new ListItem("Predestination", "http://www.tribute.ca/images/videos/predestination-12300-large.jpg"));
        movies.add(new ListItem("Upstrean Color", "http://iris.theaureview.com/wp-content/uploads/2016/04/Upstream-Color.jpeg"));

        return movies;
    }

}
