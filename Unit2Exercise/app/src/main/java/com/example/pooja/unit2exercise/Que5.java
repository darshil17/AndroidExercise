package com.example.pooja.unit2exercise;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Que5 extends AppCompatActivity {

    Button btn;
    EditText a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_que5);

        btn=(Button)findViewById(R.id.button);
        a=(EditText)findViewById(R.id.editText6);
        b=(EditText)findViewById(R.id.editText7);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=a.getText().toString();

                b.setText(str);
                b.setBackgroundColor(Color.RED);
            }
        });
    }
}
