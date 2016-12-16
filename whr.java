package com.example.com410_1.healthcare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class WhrActivity extends AppCompatActivity
{
    String num1, num2;
    EditText editText1, editText2;
    Double resultDouble;
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {        
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_whr);
            editText1 = (EditText) findViewById(R.id.editText1);
            editText2 = (EditText) findViewById(R.id.editText2);
     }    public void onResult(View view)
          {        
                  num1 = editText1.getText().toString();//허리
                  num2 = editText2.getText().toString();//엉덩이
                  resultDouble = Double.parseDouble(num1) / Double.parseDouble(num2);
                  Toast.makeText(this,"복부 비만도는"+resultDouble.toString()+"입니다.", Toast.LENGTH_LONG).show();
           }}
