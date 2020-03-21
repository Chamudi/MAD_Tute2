package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private static final String TAG = "Main2Activity";
    EditText edT1,edT2;
    TextView ans;
    String val1, val2;
    Double x,y;

    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        b1 = findViewById(R.id.button2);
        b2 = findViewById(R.id.button3);
        b3 = findViewById(R.id.button4);
        b4 = findViewById(R.id.button5);


        Intent intent = getIntent();

        val1 = intent.getStringExtra("Value1") ;
        val2 = intent.getStringExtra("Value2");

        edT1 = findViewById(R.id.editText3);
        edT2 = findViewById(R.id.editText4);
        ans = findViewById(R.id.textView5);

        edT1.setText(val1);
        edT2.setText(val2);

        x = Double.parseDouble(val1);
        y = Double.parseDouble(val2);

        Log.i(TAG,"onCreate:: x = "+x);
        Log.i(TAG,"onCreate:: y = "+y);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ans.setText(x+"+"+y + "=" + String.valueOf(x+y));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(x+"-"+y + "="+ String.valueOf(x-y)  );
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(x+"*"+y + "="+ String.valueOf(x*y)  );
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(x+"/"+y + "=" + String.valueOf(x/y) );
            }
        });

    }

    //public void addition(View view){ans.setText(String.valueOf(x+y));}

   // public void sub(View view){ans.setText(String.valueOf(x-y));}

    //public void mul(View view){ans.setText(String.valueOf(x*y));}

    //public void div(View view){ans.setText(String.valueOf(x/y));}

}
