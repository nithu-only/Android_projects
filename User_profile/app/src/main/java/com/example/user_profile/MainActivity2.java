package com.example.user_profile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView textView;
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView=findViewById(R.id.textView5);
        imageView=findViewById(R.id.imageView2);

        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            String name = bundle.getString("name");
            String fname = bundle.getString("fname");
            String hobb = bundle.getString("hobby");
            Integer integer=bundle.getInt("img");
            textView.setText("your profile"+name+"     "+fname+"        "+hobb+"     ");
            imageView.setImageResource(integer);
        }

    }
}