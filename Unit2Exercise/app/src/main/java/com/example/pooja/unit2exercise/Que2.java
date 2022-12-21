package com.example.pooja.unit2exercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Que2 extends AppCompatActivity {
    Button btn;
    TextView tno;
    EditText ename,epass,eemail,edate,eno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_que2);
        btn=(Button)findViewById(R.id.button3);

        tno=(TextView)findViewById(R.id.textView12);
        ename=(EditText)findViewById(R.id.editText);
        epass=(EditText)findViewById(R.id.editText4);
        edate=(EditText)findViewById(R.id.editText9);
        eno=(EditText)findViewById(R.id.editText3);
        eemail=(EditText)findViewById(R.id.editText2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=ename.getText().toString();

                String str1=epass.getText().toString();

                String str2=eemail.getText().toString();

                String str3=edate.getText().toString();

                String str4=eno.getText().toString();
                tno.setText(str+" "+str1+" "+str2+" "+str3+" "+str4);
            }
        });
    }
}
