package com.example.lovecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
EditText Male,Female;
TextView lc;
String result;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showResult(View v)
    {

        Male=(EditText) findViewById(R.id.editTextTextPersonName);
        Female=(EditText) findViewById(R.id.editTextTextPersonName2);
        lc=(TextView) findViewById(R.id.textView);
        String m=Male.getText().toString();
        String f=Female.getText().toString();
        String sum=m+f;
        sum=sum.toLowerCase();
        int value = sum.hashCode();
        Random random;
        random = new Random(value);
        result=(random.nextInt(100)+1) + "%";
        lc.setText(result);

    }
}