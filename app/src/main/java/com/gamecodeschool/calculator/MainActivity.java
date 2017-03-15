package com.gamecodeschool.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static Button button_sec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClick(View v){
        float ans;
        ans=0;
        EditText e1 = (EditText)findViewById(R.id.editText);
        EditText e2 = (EditText)findViewById(R.id.editText2);
        TextView t=(TextView)findViewById(R.id.textView);
        Button button = (Button)findViewById(R.id.button);
        Button button2 = (Button)findViewById(R.id.button2);
        Button button3 = (Button)findViewById(R.id.button3);
        Button button4= (Button)findViewById(R.id.button4);
        float num1 = Float.parseFloat(e1.getText().toString());
        float num2 = Float.parseFloat(e2.getText().toString());
        if(v.getId()==R.id.button)
            ans=num1+num2;
        if(v.getId()==R.id.button2)
            ans=num1-num2;
            if(v.getId()==R.id.button3)
                ans=num1*num2;
                if(v.getId()==R.id.button4)
                    ans=num1/num2;
        t.setText(Float.toString(ans));

    }
    }

