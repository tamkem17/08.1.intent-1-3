package com.example.tam.a081intent_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SumActivity extends AppCompatActivity {
    private float mx = 5, my = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);
        TextView txt = (TextView)findViewById(R.id.txt_sum);
        setInputFromExtras();
        txt.setText("The sum of "+mx+" and "+my+" is: "+Sum());
    }

    private float Sum(){
        float sum;
        sum = mx +my;
        return sum;
    }

    private void setInputFromExtras(){
        Intent intent = getIntent();
        Bundle integerInfo = intent.getExtras();
        if(integerInfo != null){
            float x = integerInfo.getFloat("x");
            float y = integerInfo.getFloat("y");
            setInput(x, y);
        }
    }

    private void setInput(float x, float y) {
        mx = x;
        my = y;

    }
}
