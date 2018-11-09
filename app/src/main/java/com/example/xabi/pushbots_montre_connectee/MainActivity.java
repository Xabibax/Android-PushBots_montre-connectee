package com.example.xabi.pushbots_montre_connectee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.pushbots.push.Pushbots;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Register for Push Notifications
        Pushbots.sharedInstance().registerForRemoteNotifications();
    }
}
