package com.example.com410_1.healthcare;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class BmActivity extends AppCompatActivity
{
     String num1, num2,num3;
     EditText editText1, editText2, editText3;
     Double resultDouble;
     RadioGroup radioGroup1;
     RadioButton male, female;
     
     @Override
     protected void onCreate(Bundle savedInstanceState)
     {
             super.onCreate(savedInstanceState);
             setContentView(R.layout.activity_bm);
             radioGroup1 = (RadioGroup) findViewById(R.id.radioGroup1);
             male = (RadioButton) findViewById(R.id.male);
             female = (RadioButton) findViewById(R.id.female);
             editText1 = (EditText) findViewById(R.id.editText1);
             editText2 = (EditText) findViewById(R.id.editText2);
             editText3 = (EditText) findViewById(R.id.editText3);
     }
     
     public void onResult(View view)
     {
             if (male.isChecked())
             {
                         num1 = editText1.getText().toString();//키
                         num2 = editText2.getText().toString();//몸무게
                         num3 = editText3.getText().toString();//나
                         resultDouble = 66.47 + (13.75 * Double.parseDouble(num2)) + (5 * Double.parseDouble(num1)) - (6.76 * Double.parseDouble(num3));            Toast.makeText(this,"기초 대사량은"+resultDouble.toString(), Toast.LENGTH_LONG).show();        }        else if (female.isChecked())        {            num1 = editText1.getText().toString();            resultDouble = 66.51 + (9.56 * Double.parseDouble(num2))                    + (1.85 * Double.parseDouble(num1))                    - (4.68 * Double.parseDouble(num3));            Toast.makeText(this,"기초 대사량은"+resultDouble.toString(), Toast.LENGTH_LONG).show();        }    }}
