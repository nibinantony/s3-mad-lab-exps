package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "onCreate() called", Toast.LENGTH_SHORT).show();
        Log.e("MainActivity","onCreate() called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("MainActivity","onStart() called");
        Toast.makeText(getApplicationContext(), "onStart() called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("MainActivity","onResume() called");
        Toast.makeText(getApplicationContext(), "onResume() called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("MainActivity","onPause() called");
        Toast.makeText(getApplicationContext(), "onPause() called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("MainActivity","onStop() called");
        Toast.makeText(getApplicationContext(), "onStop() called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("MainActivity","onRestart() called");
        Toast.makeText(getApplicationContext(), "onRestart() called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("MainActivity","onDestroy() called");
        Toast.makeText(getApplicationContext(), "onDestroy() called", Toast.LENGTH_SHORT).show();
    }
}