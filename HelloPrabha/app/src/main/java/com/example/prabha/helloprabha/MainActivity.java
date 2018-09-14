package com.example.prabha.helloprabha;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3;
    TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textview);
        btn1 = (Button) findViewById(R.id.button);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    textView.setTextColor(Color.BLUE);
            }
        });

        btn2 = (Button) findViewById(R.id.button2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.rootview).setBackgroundColor(getResources().getColor(R.color.peach, null));
            }
        });

        btn3 = (Button) findViewById(R.id.button3);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newText = ((EditText) findViewById(R.id.editText)).getText().toString();
                if(TextUtils.isEmpty(newText)) {
                    textView.setText("Android is Awesome !");
                } else {
                    textView.setText(newText);
                }

            }
        });

        findViewById(R.id.rootview).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 //1. reset the text color back to PrimaryDark
                //2. reset the background color to holo_blue_dark
                //3. reset the text back to "Hello from Prabha !"
                textView.setTextColor(getResources().getColor(R.color.colorPrimaryDark, null));
                findViewById(R.id.rootview).setBackgroundColor(getResources().getColor(R.color.holo_blue_dark, null));
                textView.setText("Hello from Prabha !");

            }
        });

    }
}
