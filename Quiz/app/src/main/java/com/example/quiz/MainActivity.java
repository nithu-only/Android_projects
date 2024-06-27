package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    RadioButton corans;
    Button submit;
    int res;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        corans = findViewById(R.id.radioButton);
        submit = findViewById(R.id.button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(corans.isChecked()){
                    res+=1;
                }else {
                    res=0;
                }
                intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("result",res);
                startActivity(intent);
            }
        });



    }
}