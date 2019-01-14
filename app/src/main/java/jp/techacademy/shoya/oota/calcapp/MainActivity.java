package jp.techacademy.shoya.oota.calcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.support.design.widget.Snackbar;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mEditText1;
    EditText mEditText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

        mEditText1 = (EditText) findViewById(R.id.editText1);
        mEditText2 = (EditText) findViewById(R.id.editText2);
    }

    public void onClick(View v) {

        mEditText1 = (EditText) findViewById(R.id.editText1);
        mEditText2 = (EditText) findViewById(R.id.editText2);
        Intent intent = new Intent(this, SecondActivity.class);

        if (mEditText1.getText().toString().isEmpty() || mEditText2.getText().toString().isEmpty() ||mEditText1.getText().toString().equals(".") || mEditText2.getText().toString().equals(".")||mEditText2.getText().toString().equals("0")) {
            //数値を入力するよう指示

            Snackbar.make(v, "数値を入力してください", Snackbar.LENGTH_LONG)
                    .setAction("Action", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Log.d("UI-PARTS", "数値がない");
                        }
                    }).show();

        } else {
            //ボタンそれぞれで四則演算を行う
            if (v.getId() == R.id.button1) {
                intent.putExtra("VALUE1", mEditText1.getText().toString());
                intent.putExtra("VALUE2", mEditText2.getText().toString());
                intent.putExtra("VALUE3", "+");

                startActivity(intent);
            } else if (v.getId() == R.id.button2) {
                intent.putExtra("VALUE1", mEditText1.getText().toString());
                intent.putExtra("VALUE2", mEditText2.getText().toString());
                intent.putExtra("VALUE3", "-");

                startActivity(intent);
            } else if (v.getId() == R.id.button3) {
                intent.putExtra("VALUE1", mEditText1.getText().toString());
                intent.putExtra("VALUE2", mEditText2.getText().toString());
                intent.putExtra("VALUE3", "*");

                startActivity(intent);
            } else if (v.getId() == R.id.button4) {
                intent.putExtra("VALUE1", mEditText1.getText().toString());
                intent.putExtra("VALUE2", mEditText2.getText().toString());
                intent.putExtra("VALUE3", "/");

                startActivity(intent);
            }
        }
    }
}
