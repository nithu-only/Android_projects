package com.example.auto_complete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.util.Rfc822Tokenizer;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    MultiAutoCompleteTextView multiAutoCompleteTextView;

    String states[]={"karnataka","karala","andra","andaman","gujarat","goa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompleteTextView = findViewById(R.id.autoCompleteTextView2);
        multiAutoCompleteTextView = findViewById(R.id.multiAutoCompleteTextView);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,states);
        autoCompleteTextView.setAdapter(arrayAdapter);
        autoCompleteTextView.setThreshold(2);

        multiAutoCompleteTextView.setAdapter(arrayAdapter);
        multiAutoCompleteTextView.setThreshold(2);
        multiAutoCompleteTextView.setTokenizer(new Rfc822Tokenizer());


    }
}