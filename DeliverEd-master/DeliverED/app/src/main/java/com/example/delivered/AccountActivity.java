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

public class AccountActivity extends AppCompatActivity {

    private TextView tv_2,tv_7;
    private Button btn_1,btn_2;

    private TextView tv_4,tv_5,tv_6;

    private TextView home;
    private TextView setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        AssetManager mgr = getAssets();
        Typeface tf = Typeface.createFromAsset(mgr, "ahronbd.ttf");

        tv_7 = findViewById(R.id.tv_7);
        tv_7.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        tv_7.setTypeface(tf);

        btn_1 = findViewById(R.id.btn_1);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AccountActivity.this,"Editing Details is still building.",Toast.LENGTH_SHORT).show();
            }
        });
        btn_1.setTypeface(tf);

        btn_2 = findViewById(R.id.btn_2);
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AccountActivity.this,"Successfully Log off.",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(AccountActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        btn_2.setTypeface(tf);

        tv_4 = findViewById(R.id.tv_4);
        tv_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AccountActivity.this,"Navigate to Home page.",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(AccountActivity.this, HomePageActivity.class);
                startActivity(intent);
            }
        });
        tv_5 = findViewById(R.id.tv_5);
        tv_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AccountActivity.this,"Navigate to Alerts page.",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(AccountActivity.this, AlertsActivity.class);
                startActivity(intent);
            }
        });
        tv_6 = findViewById(R.id.tv_6);
        tv_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AccountActivity.this,"Already in Account page.",Toast.LENGTH_SHORT).show();
            }
        });

        home = findViewById(R.id.home);
        home.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        home.setTypeface(tf);

        setting = findViewById(R.id.setting);
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AccountActivity.this,"Setting is still building.",Toast.LENGTH_SHORT).show();
            }
        });
        setting.setTypeface(tf);

    }
}
