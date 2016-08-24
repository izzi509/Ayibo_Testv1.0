package com.example.delva.ayibotest1;

import android.graphics.Movie;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import cz.msebera.android.httpclient.Header;

/**
 * Created by Delva on 8/23/2016.
 */
public class Articles extends AppCompatActivity {

    ArrayList<Post> posts;
    PostArrayAdapter postAdapter;
    ListView lvItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.articles_list);

        lvItems = (ListView) findViewById(R.id.lvArticles);
        posts = new ArrayList<>();
        postAdapter = new PostArrayAdapter(this,posts);
        lvItems.setAdapter(postAdapter);


        AsyncHttpClient client = new AsyncHttpClient();

        client.get(url,new JsonHttpResponseHandler(){
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                JSONArray movieJsonResults = null;


                try {
                    movieJsonResults = response.getJSONArray("");
                    posts.addAll( Post.fromJSONArray());
                    postAdapter.notifyDataSetChanged();
                    Log.d("DEBUG",posts.toString());
                } catch (JSONException e) {
                    e.printStackTrace();
                }


            }

            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                super.onFailure(statusCode, headers, responseString, throwable);
            }
        });



    }
}

