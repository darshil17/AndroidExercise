package com.example.pooja.unit2exercise;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Que1 extends AppCompatActivity {

    Button btn;
    EditText txt;
    TextView label;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_que1);

        btn=(Button)findViewById(R.id.btn);
        txt=(EditText)findViewById(R.id.txtbox);
        label=(TextView)findViewById(R.id.txtview);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=txt.getText().toString();
                label.setText(str);
                label.setBackgroundColor(Color.YELLOW);
                Toast t=Toast.makeText(Que1.this,"Welcome "+str,Toast.LENGTH_LONG);
                t.show();
            }
        });
    }
}
