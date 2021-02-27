package com.example.delivered;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private TextView tv_2;
    private TextView tv_3;
    private TextView tv_5,tv_6;
    private Button btn_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        tv_2 = findViewById(R.id.tv_2);
//        tv_2.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        AssetManager mgr = getAssets();
        Typeface tf = Typeface.createFromAsset(mgr, "ahronbd.ttf");
        tv_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this,"Privacy Notice is still building.",Toast.LENGTH_SHORT).show();
            }
        });
        tv_2.setTypeface(tf);


        tv_3 = findViewById(R.id.tv_3);
        tv_3.setTypeface(tf);
        tv_5 = findViewById(R.id.tv_5);
        tv_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this,"Sign up is still building.",Toast.LENGTH_SHORT).show();
            }
        });
        tv_5.setTypeface(tf);

        tv_6 = findViewById(R.id.tv_6);
        tv_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this,"User Guide is still building.",Toast.LENGTH_SHORT).show();
            }
        });
        tv_6.setTypeface(tf);



        btn_1 = findViewById(R.id.btn_1);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this,"Successfully Sign in.",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LoginActivity.this, HomePageActivity.class);
                startActivity(intent);
            }
        });
        btn_1.setTypeface(tf);


    }
}
