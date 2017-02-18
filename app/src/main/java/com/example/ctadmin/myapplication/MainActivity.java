package com.example.ctadmin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    
    ImageView imageView = (ImageView) findViewById(R.id.kiranjethwa);
    imageView.setImageResource(R.drawable.kiranjethwa);
}
