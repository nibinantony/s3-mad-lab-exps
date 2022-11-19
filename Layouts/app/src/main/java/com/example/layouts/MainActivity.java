package com.example.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = findViewById(R.id.b1);
    }

    public void clickfun(View  v) {
        RadioGroup rg = findViewById(R.id.rg1);
        int rid = rg.getCheckedRadioButtonId();
        switch(rid) {
            case R.id.r1:
                Intent i1 = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i1);
                break;
            case R.id.r2:
                Intent i2 = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(i2);
                break;
            case R.id.r3:
                Intent i3 = new Intent(MainActivity.this, GridActivity.class);
                startActivity(i3);
                break;
            case R.id.r4:
                Intent i4 = new Intent(MainActivity.this, TableActivity.class);
                startActivity(i4);
                break;
            case R.id.r5:
                Intent i5 = new Intent(MainActivity.this, FrameActivity.class);
                startActivity(i5);
                break;
            default:
                Toast.makeText(this, "Select any options", Toast.LENGTH_SHORT).show();
        }
    }
}