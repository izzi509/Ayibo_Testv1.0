package com.example.delva.ayibotest1;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class Post {


    public String postTitle;
    public String userFirstName;
    public String image;
    public String contenu;

    public String getPostTitle() {
        return postTitle;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public String getImage() {
        return String.format("");
    }

    public String getContenu() {
        return contenu;
    }

    public Post (JSONObject jsonObject) throws JSONException {
        this.postTitle = jsonObject.getString("title");
        this.userFirstName = jsonObject.getString("first_name");
        this.image = jsonObject.getJSONObject("featured_image").getString("source");
        this.contenu = jsonObject.getString("contenu");

    }

    public static ArrayList<Post> fromJSONArray(JSONArray array) {
        ArrayList<Post> results = new ArrayList<>();

        for (int x = 0; x < array.length(); x++){
            try {
                results.add (new Post(array.getJSONObject(x)));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return results;

    }


    /*    movies.add(new Movie("Interstellar", "", 90.0f));
        movies.add(new Movie("Minions", "", 45.0f));
        movies.add(new Movie("Matrix", "", 50.0f));
        return movies;
    }*/

}
