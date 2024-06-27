package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    RadioButton corans;
    Button submit;
    int res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        corans=findViewById(R.id.radioButton);
        res=getIntent().getIntExtra("result",0);

        submit=findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (corans.isChecked()) {
                    res += 1;
                } else {
                    res = res;
                }
                Intent i =new Intent(MainActivity2.this,MainActivity3.class);
                i.putExtra("res",res);
                startActivity(i);
            }
        });





    }
}