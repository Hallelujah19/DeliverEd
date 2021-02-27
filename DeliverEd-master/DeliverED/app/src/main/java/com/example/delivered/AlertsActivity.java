package com.example.delivered;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class AlertsActivity extends AppCompatActivity {

    private TextView tv_2,tv_3,tv_7,tv_8,tv_9,tv_10,btn_1,btn_2,btn_3,btn_4;

    private TextView tv_4,tv_5,tv_6;

    private TextView home;
    private TextView setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alerts);

        AssetManager mgr = getAssets();
        Typeface tf = Typeface.createFromAsset(mgr, "ahronbd.ttf");

        tv_3 = findViewById(R.id.tv_3);
        tv_3.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        tv_3.setTypeface(tf);

        tv_7 = findViewById(R.id.tv_7);
        tv_7.setTypeface(tf);
        tv_8 = findViewById(R.id.tv_8);
        tv_8.setTypeface(tf);
        tv_9 = findViewById(R.id.tv_9);
        tv_9.setTypeface(tf);
        tv_10 = findViewById(R.id.tv_10);
        tv_10.setTypeface(tf);
        btn_1 = findViewById(R.id.btn_1);
        btn_1.setTypeface(tf);
        btn_2 = findViewById(R.id.btn_2);
        btn_2.setTypeface(tf);
        btn_3 = findViewById(R.id.btn_3);
        btn_3.setTypeface(tf);
        btn_4 = findViewById(R.id.btn_4);
        btn_4.setTypeface(tf);

        tv_4 = findViewById(R.id.tv_4);
        tv_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AlertsActivity.this,"Navigate to Home page.",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(AlertsActivity.this, HomePageActivity.class);
                startActivity(intent);
            }
        });
        tv_5 = findViewById(R.id.tv_5);
        tv_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AlertsActivity.this,"Already in Alerts page.",Toast.LENGTH_SHORT).show();
            }
        });
        tv_6 = findViewById(R.id.tv_6);
        tv_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AlertsActivity.this,"Navigate to Account page.",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(AlertsActivity.this, AccountActivity.class);
                startActivity(intent);
            }
        });

        home = findViewById(R.id.home);
        home.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        home.setTypeface(tf);

        setting = findViewById(R.id.setting);
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AlertsActivity.this,"Setting is still building.",Toast.LENGTH_SHORT).show();
            }
        });
        setting.setTypeface(tf);


    }
}
