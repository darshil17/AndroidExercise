package com.example.pooja.unit2exercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Que4 extends AppCompatActivity {

    EditText name;
    TextView textview;
    Button save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_que4);

        name = (EditText)findViewById(R.id.name);
        textview = (TextView) findViewById(R.id.textview);
        save=(Button)findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        if (!name.getText().toString().isEmpty()) {
                                            StringBuffer c = new StringBuffer(name.getText().toString());
                                            textview.setText(c.reverse().toString().toUpperCase().toString());
                                            Toast.makeText(Que4.this, "Inserted "+ c, Toast.LENGTH_LONG).show();
                                        }
                                        else
                                        {
                                            name.setError("Enter NAME ");
                                        }

                                    }

        });
    }
}
