package com.example.prakhar.popularmovies;

public class Trailer {
    private String mKey;
    private String mName;

    public Trailer(String key, String name){
        mKey = key;
        mName = name;
    }

    public String getKey(){
        return mKey;
    }
    public String getName(){
        return mName;
    }
}
