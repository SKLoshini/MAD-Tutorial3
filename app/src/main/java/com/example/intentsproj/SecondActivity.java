package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText etno1;
    EditText etno2;
    String number1;
    String number2;
    int n1,n2;
    TextView lblSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        etno1 = findViewById(R.id.etnum1);
        etno2 = findViewById(R.id.etnum2);
        lblSum = findViewById(R.id.lblsum);

        Intent intent = getIntent();

        number1 = intent.getStringExtra("no1");
        number2 = intent.getStringExtra("no2");

        etno1.setText(number1);
        etno2.setText(number2);

        n1 = Integer.parseInt(number1);
        n2 = Integer.parseInt(number2);
    }

    public void add(View view) {
        lblSum.setText(number1 + " + " + number2 + " = " + (n1+n2));
    }

    public void substract(View view) {
        lblSum.setText(number1 + " - " + number2 + " = " + (n1-n2));
    }
    public void multiply(View view) {
        lblSum.setText(number1 + " x " + number2 + " = " + (n1*n2));
    }
    public void divide(View view) {
        lblSum.setText(number1 + " / " + number2 + " = " + (n1/n2));
    }
}