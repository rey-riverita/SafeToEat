package com.facebook.myparselogin;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseFacebookUtils;
import com.parse.ParseObject;
import com.parse.ParseTwitterUtils;

public class SampleApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Item.class);

        // Required - Initialize the Parse SDK
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("myAppId")
                .clientKey("ParseLoginSampleBasicAppId")
                .server("https://to-eat-or-not-to-eat.herokuapp.com/parse/").build());

        // ParseFacebookUtils should initialize the Facebook SDK for you
        ParseFacebookUtils.initialize(this);

        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);

        // Optional - If you don't want to allow Twitter login, you can
        // remove this line (and other related ParseTwitterUtils calls)
        ParseTwitterUtils.initialize(getString(R.string.twitter_consumer_key),
                getString(R.string.twitter_consumer_secret));
    }
}
