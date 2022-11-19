package com.example.twonumbersumgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView t1, t2;
    EditText et;
    Button b;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = findViewById(R.id.tv1);
        t2 = findViewById(R.id.tv2);
        et = findViewById(R.id.et1);
        b = findViewById(R.id.b1);

        Random random = new Random();
        int i1 = random.nextInt(100);
        int i2 = random.nextInt(100);

        t1.setText(""+i1);
        t2.setText(""+i2);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = et.getText().toString();
                if(TextUtils.isEmpty(s))
                    Toast.makeText(getApplicationContext(), "Enter some value", Toast.LENGTH_SHORT).show();
                else {
                    int num1 = Integer.parseInt(t1.getText().toString());
                    int num2 = Integer.parseInt(t2.getText().toString());
                    int sum = Integer.parseInt(s);
                    if(num1+num2 == sum)
                        Toast.makeText(getApplicationContext(), "You Win", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(getApplicationContext(), "You Lose", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}