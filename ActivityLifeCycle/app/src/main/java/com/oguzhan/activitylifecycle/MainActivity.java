package com.oguzhan.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("onCreate");
    }
    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("onResume");
    }
    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("onStop");
    }
    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("onPause");
    }
}