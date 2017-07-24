package com.example.tam.a081intent_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btn_back1 = (Button)findViewById(R.id.btn_back1);
        btn_back1.setOnClickListener(new backActivity1());
    }

    private class backActivity1 implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent i = new Intent(Main2Activity.this,MainActivity.class);
            startActivity(i);
        }
    }
}
