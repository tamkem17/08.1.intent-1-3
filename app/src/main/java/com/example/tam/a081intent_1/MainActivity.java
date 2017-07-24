package com.example.tam.a081intent_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_goActivitySumData = (Button)findViewById(R.id.btn_activitySumData);
        Button btn_go2 = (Button)findViewById(R.id.btn_go2);
        Button btn_goActivitySum = (Button)findViewById(R.id.btn_activitySum);
        Button btn_goTabActivity = (Button)findViewById(R.id.btn_goTabActivity);
        btn_go2.setOnClickListener(this);
        btn_goActivitySum.setOnClickListener(this);
        btn_goActivitySumData.setOnClickListener(this);
        btn_goTabActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_go2:
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
                break;
            case R.id.btn_activitySum:
                startActivity(new Intent(MainActivity.this, SumActivity.class));
                break;
            case R.id.btn_activitySumData:
                Intent intentSumActivityData = new Intent(MainActivity.this, SumActivity.class);
                intentSumActivityData.putExtras(IntegerBundle.randomInteger());
                startActivity(intentSumActivityData);
            case R.id.btn_goTabActivity:
                startActivity(new Intent(MainActivity.this, TabActivity.class));
                break;
            default:
                break;
        }
    }

    public static class IntegerBundle{
        public static Bundle makeIntegerInfoBundle(float x, float y) {
            Bundle IntegerInfo = new Bundle();
            IntegerInfo.putFloat("x",x);
            IntegerInfo.putFloat("y",y);
            return (IntegerInfo);
        }

        public static Bundle randomInteger(){
            float x,y;
            Random random = new Random();
            x = random.nextFloat();
            y = random.nextFloat();
            return IntegerBundle.makeIntegerInfoBundle(x,y);
        }
    }

}
