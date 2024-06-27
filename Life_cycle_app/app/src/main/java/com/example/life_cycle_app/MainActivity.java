package com.example.life_cycle_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("state","oncreate...................");

    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i("state","onStarted....................");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("state","onPaused....................");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("state","onResumed....................");
    }

    protected void onRestart(){
        super.onRestart();
        Log.i("state","onReStarted....................");
    }

    protected void onStop(){
        super.onStop();
        Log.i("state","onStoped....................");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.i("state","onDestroy....................");
    }


}