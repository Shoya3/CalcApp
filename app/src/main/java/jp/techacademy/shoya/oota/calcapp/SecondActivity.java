package jp.techacademy.shoya.oota.calcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String value3 = intent.getStringExtra("VALUE3");

        if(value3=="+"){
            int value1 = intent.getIntExtra("VALUE1", 0);
            int value2 = intent.getIntExtra("VALUE2", 0);

            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText(String.valueOf(value1 + value2));
        }else if(value3=="-"){
            int value1 = intent.getIntExtra("VALUE1", 0);
            int value2 = intent.getIntExtra("VALUE2", 0);

            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText(String.valueOf(value1 - value2));
        }else if(value3=="*"){
            int value1 = intent.getIntExtra("VALUE1", 0);
            int value2 = intent.getIntExtra("VALUE2", 0);

            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText(String.valueOf(value1 * value2));
        }else if(value3=="/"){
            int value1 = intent.getIntExtra("VALUE1", 0);
            int value2 = intent.getIntExtra("VALUE2", 0);

            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText(String.valueOf(value1 / value2));
        }
    }
}
