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

        String value1 = intent.getStringExtra("VALUE1");
        String value2 = intent.getStringExtra("VALUE2");

        TextView textView = (TextView) findViewById(R.id.textView);

        double db1 = Double.parseDouble(value1);
        double db2 = Double.parseDouble(value2);


        if(value3.equals("+")){

            textView.setText(String.valueOf(db1 + db2));
        }else if(value3.equals("-")){

            textView.setText(String.valueOf(db1 - db2));
        }else if(value3.equals("*")){

            textView.setText(String.valueOf(db1 * db2));
        }else if(value3.equals("/")){

            textView.setText(String.valueOf(db1 / db2));
        }
    }
}
