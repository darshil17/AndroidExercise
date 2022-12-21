package com.example.pooja.unit2exercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Que7 extends AppCompatActivity {

    Button btn;
    EditText e,e1;
    TextView txt,sub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_que7);

        btn=(Button)findViewById(R.id.button5);
        e=(EditText)findViewById(R.id.editText11);
        e1=(EditText)findViewById(R.id.editText12);
        txt=(TextView)findViewById(R.id.textView14);
        sub=(TextView)findViewById(R.id.textView13);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String S = e.getText().toString();
                String I = e1.getText().toString();

                txt.setText(S+I);
                //String string = "Java";
                //String substring = "va";
                System.out.println(S.contains(I));
                if(( S.contains(I))){
                    sub.setText("Yes");
                }
                else{
                    sub.setText("NO");
                }
            }
        });

    }
}
