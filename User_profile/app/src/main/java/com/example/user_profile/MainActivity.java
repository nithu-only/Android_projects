package com.example.user_profile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    String hob="";
    Button btn;
    EditText name,fname,address;
    CheckBox ch1,ch2;
    RadioButton r1,r2;
    ImageView profile;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.submit);
        name=findViewById(R.id.name);
        fname=findViewById(R.id.father);
        address=findViewById(R.id.address);
        r1=findViewById(R.id.male);
        r2=findViewById(R.id.female);
        ch1=findViewById(R.id.hobby);
        ch1=findViewById(R.id.hobby1);
        profile=findViewById(R.id.imageView);





        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(MainActivity.this,MainActivity2.class);
                Bundle bundle = new Bundle();
                bundle.putInt("img", R.drawable.img);
                bundle.putString("name", name.getText().toString());
                bundle.putString("fname",fname.getText().toString());
                if(ch1.isChecked()){
                    hob=ch1.getText().toString();
                }else {
                    hob=hob;
                }
                bundle.putString("hobby",hob);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

    }


}