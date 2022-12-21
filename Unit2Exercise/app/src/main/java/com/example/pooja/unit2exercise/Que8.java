package com.example.pooja.unit2exercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.String;

public class Que8 extends AppCompatActivity {

    EditText text;
    TextView lbl;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_que8);

        btn = (Button) findViewById(R.id.button2);
        text = (EditText) findViewById(R.id.editText8);
        lbl = (TextView) findViewById(R.id.textView4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String  b = "";

                String a=text.getText().toString();

                int n = a.length();
                for(int i = n - 1; i >= 0; i--)
                {
                    b = b + a.charAt(i);
                }
                if(a.equalsIgnoreCase(b))
                {
                    lbl.setText(a+"The string is palindrome.");
                    //refer,pop,arora,eve,eye
                   // System.out.println("The string is palindrome.");
                }
                else
                {
                    lbl.setText(a+"The string is not palindrome.");
                    //shiva,wow,redder,tent
                    //System.out.println("The string is not palindrome.");
                }}
        });
    }
}
