package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("H3idWNBTTS5PJn3dq4Y4ukDmSTEHD0mDfI9kFpXv")
                .clientKey("duBeMuY6rZwQlnrO860urj9ffeFxnxhvVhMkIJXx")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
