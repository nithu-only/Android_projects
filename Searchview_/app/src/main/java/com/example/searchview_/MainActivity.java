package com.example.searchview_;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

public class MainActivity extends AppCompatActivity {
SearchView searchView;
ListView listView;
String [] color={"red","orange","white","violet","black","blue",
        "falured","purple","darkblue",
        "red","orange","white","violet","black","blue","red","orange","white","violet","black","blue",
        "red","orange","white","violet","black","blue",
        "red","orange","white","violet","black","blue",};

ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchView = findViewById(R.id.searchview);
        listView = findViewById(R.id.listview);

        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,color);
        listView.setAdapter(arrayAdapter);



        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {

                arrayAdapter.getFilter().filter(s);
                return false;
            }
        });


    }
}