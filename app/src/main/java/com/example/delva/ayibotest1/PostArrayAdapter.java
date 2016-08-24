package com.example.delva.ayibotest1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Delva on 8/23/2016.
 */
public class PostArrayAdapter extends ArrayAdapter<Post> {

    public PostArrayAdapter(Context context, ArrayList<Post> posts) {
        super(context, android.R.layout.simple_list_item_1, posts);
    }

    // Model=> view
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Post posts= getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {

            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView= inflater.inflate(R.layout.item_post,parent,false);
        }

        //find the image view
        ImageView ivImag = (ImageView) convertView.findViewById(R.id.ivImag);
        // clear out image from convert view
        ivImag.setImageResource(0);

        TextView tvTitle = (TextView) convertView.findViewById(R.id.tvTitle);
        TextView tvAuteur = (TextView) convertView.findViewById(R.id.tvAuteur);

        // populate data
        tvTitle.setText(posts.getPostTitle());
        tvAuteur.setText(posts.getUserFirstName());

        // Picasso.with(getContext()).load(movie.getPosterPath()).into(ivImage);

        // return the view
        return convertView;

    }
}
