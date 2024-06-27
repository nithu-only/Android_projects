package com.example.call_dial_sms;
import static android.os.Build.VERSION_CODES.R;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText et=(EditText) findViewById(R.id.edt);
        Button bt1=(Button) findViewById(R.id.btn1);
        Button bt2=(Button) findViewById(R.id.btn2);
        Button bt3=(Button) findViewById(R.id.btn3);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String url="tel:"+et.getText().toString();
                Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+et.getText().toString()));
//                Toast.makeText(MainActivity.this,"You clicked dial",
//                        Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String url="tel:"+et.getText().toString();
                  Intent intent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+et.getText().toString()));
//                Toast.makeText(MainActivity.this,"You clicked call",Toast.LENGTH_LONG).show();
                        startActivity(intent);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String url="sms:"+et.getText().toString();
//                Intent intent=new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:"+et.getText().toString()));
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("sms:"+et.getText().toString()));
//                Toast.makeText(MainActivity.this,"you clicked sms",Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });
    }
}
