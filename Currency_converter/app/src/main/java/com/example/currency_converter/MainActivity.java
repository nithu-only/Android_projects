package com.example.currency_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b=(Button) findViewById(R.id.submit);
        Spinner sp1=(Spinner) findViewById(R.id.from);
        Spinner sp2=(Spinner) findViewById(R.id.to);
        EditText e1=(EditText)findViewById(R.id.amount);
        t=(TextView) findViewById(R.id.resulttext);


        String[] currency = {"USD","INDIAN","EURO"};
        String[] currenc = {"USD","INDIAN","EURO"};

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,currency);
        sp1.setAdapter(arrayAdapter);
        ArrayAdapter<String> arrayAdapterr = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,currenc);
        sp2.setAdapter(arrayAdapterr);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double tot;
                Double amt = Double.parseDouble(e1.getText().toString());
                if(sp1.getSelectedItem().toString() =="USD"&&sp2.getSelectedItem().toString() =="Indian Rupees")
                {
                    tot = amt * 79.89;
                    t.setText("The Converted Amount is:"+tot);
                }else if(sp1.getSelectedItem().toString() == "USD"&& sp2.getSelectedItem().toString() =="Euro")
                {
                    tot = amt*1.01;
                    t.setText("The Converted Amount is:"+tot);
                }else if(sp1.getSelectedItem().toString() =="Indian Rupees"&& sp2.getSelectedItem().toString() == "USD")
                {
                    tot = amt/79.89;
                    t.setText("The Converted Amount is:"+tot);
                }else if(sp1.getSelectedItem().toString() == "Indian Rupees"&& sp2.getSelectedItem().toString() == "Euro")
                {
                    tot = amt/79.23;
                    t.setText("The Converted Amount is:"+tot);
                }else if(sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() =="USD")
                {
                    tot = amt*0.99;
                    t.setText("The Converted Amount is:"+tot);
                }else if(sp1.getSelectedItem().toString() =="Euro"&& sp2.getSelectedItem().toString() =="Indian Rupees")
                {
                    tot = amt*79.22;
                    t.setText("The Converted Amount is: " +tot);
                }

            }
        });

    }
}