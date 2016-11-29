package com.example.ehar.usemyfancymusicserviceapp;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Intent intent = new Intent();

        // Change this package location to where
        // your music service is installed.
        String pkg = "com.example.ehar.musicserviceexample";
        intent.setComponent(new ComponentName(pkg,
                pkg+".MusicService"));
        startService(intent);
    }
}
