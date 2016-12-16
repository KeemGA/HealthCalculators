package com.example.com410_1.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{    

@Override
protected void onCreate(Bundle savedInstanceState)
{        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 }    
 
 public void onBmi(View view) 
 {        
         Intent intent = new Intent(this,BmiActivity.class);
         startActivity(intent); 
  }   
  
  public void onBm(View view)   
  {     
          Intent intent = new Intent(this,BmActivity.class);
          startActivity(intent);
   }
   
   public void onSw(View view)
   {       
           Intent intent = new Intent(this,SwActivity.class); 
           startActivity(intent); 
    }
    
    public void onWhr(View view)   
    {   
            Intent intent = new Intent(this,WhrActivity.class);
            startActivity(intent);  
     }}
