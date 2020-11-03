package com.example.exoticsneakersapp;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Yeaa5lLQQqmTHUkpcjemOLwtPEgwBWXW8YPzaimo")
                .clientKey("uUfIglWkKGxhTFeSeBHr6UenwbbdlTDH4dXdHk8n")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
