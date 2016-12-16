package com.example.com410_1.healthcare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SwActivity extends AppCompatActivity
{
    String num1,num2;
    Double resultDouble;
    EditText edit1,edit2;
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_sw);
            edit1 = (EditText) findViewById(R.id.editText1);
            edit2 = (EditText) findViewById(R.id.editText2);
     }    public void onResult(View view)
          {
                  num1 = edit1.getText().toString();//키
                  num2 = edit2.getText().toString();//몸무게
                  resultDouble = (Double.parseDouble(num1) - 100) * 0.9; 
                  Toast.makeText(this,"표준 체중은"+resultDouble.toString()+"이고"+"현재 체중은"+num2+"이다.", Toast.LENGTH_LONG).show();
           }}
