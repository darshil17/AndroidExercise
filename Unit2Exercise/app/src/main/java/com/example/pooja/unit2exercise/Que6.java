package com.example.pooja.unit2exercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Scanner;

public class Que6 extends AppCompatActivity {

    Button btn;
    EditText e,e1;
    TextView txt,rep;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_que6);
        btn=(Button)findViewById(R.id.button5);
        e=(EditText)findViewById(R.id.editText11);
        e1=(EditText)findViewById(R.id.editText12);
        txt=(TextView)findViewById(R.id.textView14);
        rep=(TextView)findViewById(R.id.textView15);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String S = e.getText().toString();
                String I = e1.getText().toString();
                String str = S + I;
                String st=str.replaceAll("[aeiouAEIOU]", "x");
                txt.setText(str);
                rep.setText(st);


            }
        });

    }
}
