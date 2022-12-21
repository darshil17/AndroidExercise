package com.example.pooja.unit2exercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Que9 extends AppCompatActivity {

    Button btn;
    TextView txt;
    EditText s1,s2,s3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_que9);

        btn=(Button)findViewById(R.id.button5);
        txt=(TextView) findViewById(R.id.textView14);
        s1=(EditText) findViewById(R.id.editText11);
        s2=(EditText) findViewById(R.id.editText12);
        s3=(EditText) findViewById(R.id.editText13);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=s1.getText().toString();
                String str1=s2.getText().toString();
                String str2=s3.getText().toString();

                String st=str.replaceAll(str1.toString(),str2.toString());

                txt.setText(st);
            }
        });

    }
}
