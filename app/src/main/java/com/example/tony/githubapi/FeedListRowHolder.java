package com.example.tony.githubapi;

/**
 * Created by Tony on 15/8/3.
 */
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class FeedListRowHolder extends RecyclerView.ViewHolder {
    protected ImageView picture;
    protected TextView name;
    protected TextView link;


    public FeedListRowHolder(View view) {
        super(view);
        this.picture = (ImageView) view.findViewById(R.id.picture);
        this.name = (TextView) view.findViewById(R.id.name);
        this.link = (TextView) view.findViewById(R.id.link);
    }

}
