package com.example.gothamcity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Input extends AppCompatActivity {
    private EditText input;
    private Button Next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input);
        input=findViewById(R.id.input);
        Next=findViewById(R.id.next);


        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number =input.getText().toString().trim();
                if(number.length()==0)
                {   input.setError("Incomplete Field");
                    return;
                }
                else
                {
                    Intent i1=new Intent(Input.this,Calculate.class);
                    i1.putExtra("Input",number);
                    startActivity(i1);
                }
            }
        });
    }
}
