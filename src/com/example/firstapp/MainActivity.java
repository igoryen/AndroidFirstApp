package com.example.firstapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View v){
    	EditText number1text = (EditText)findViewById(R.id.num1text);
    	EditText number2text = (EditText)findViewById(R.id.num2text);
    	Integer num1 = Integer.parseInt(number1text.getText().toString());
    	Integer num2 = Integer.parseInt(number2text.getText().toString());
    	Integer ans = num1 + num2;
    	
    	TextView answer = (TextView)findViewById(R.id.answertxt);
    	answer.setText("Answer: " + ans.toString());
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
