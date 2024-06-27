package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button frag1,frag2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frag1 = findViewById(R.id.b);
        frag2 = findViewById(R.id.b1);


        frag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                replacefragment(new fragment1());

            }

        });

        frag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               replacefragment(new fragment2());

            }
        });


    }

    private void replacefragment(Fragment fragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.framelayout,fragment);
        fragmentTransaction.commit();

    }
}