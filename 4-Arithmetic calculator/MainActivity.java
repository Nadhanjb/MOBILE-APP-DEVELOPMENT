package com.example.arithmetic_calculstor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button sum, sub, mul, div;
    EditText ET1, ET2;
    TextView T1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ET1 = findViewById(R.id.ET1);
        ET2 = findViewById(R.id.ET2);
        T1 = findViewById(R.id.T1);
        sum = findViewById(R.id.sumButton);
        sub = findViewById(R.id.subButton);
        mul = findViewById(R.id.divButton);
        div = findViewById(R.id.mulButton);


    }

    public void sum(View view) {

        float a = Float.parseFloat(ET1.getText().toString());
        float b = Float.parseFloat(ET2.getText().toString());
        float c = a + b;
        T1.setText("Result: " + c);
    }


    public void sub(View view) {
        float a = Float.parseFloat(ET1.getText().toString());
        float b = Float.parseFloat(ET2.getText().toString());
        float c = a - b;
        T1.setText("Result: " + c);

    }

    public void mul(View view) {
        float a = Float.parseFloat(ET1.getText().toString());
        float b = Float.parseFloat(ET2.getText().toString());
        float c = a * b;
        T1.setText("Result: " + c);

    }

    public void div(View view) {
        float a = Float.parseFloat(ET1.getText().toString());
        float b = Float.parseFloat(ET2.getText().toString());
        float c = a / b;
        if(a==Float.parseFloat(ET1.getText().toString()) & b==0){
            T1.setText("Cannot Defined");

        } else {
            T1.setText("Result: " + c);
        }


    }
}