package com.metehanersoy.broadcastsender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void sendBroadcast(View view){

        Intent intent = new Intent();
        intent.setAction("com.metehanersoy.myBroadcast");
        intent.putExtra("data", "Nothing to see here, move along.");
        sendBroadcast(intent);

    }

}