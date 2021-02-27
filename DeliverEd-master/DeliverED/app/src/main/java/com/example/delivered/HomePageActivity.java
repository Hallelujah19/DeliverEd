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

public class HomePageActivity extends AppCompatActivity {

    private TextView tv_2;
    private TextView tv_4,tv_5,tv_6;
    private TextView home;
    private TextView setting;

    private Button btn_1,btn_2,btn_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        tv_2 = findViewById(R.id.tv_2);
        tv_2.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        AssetManager mgr = getAssets();
        Typeface tf = Typeface.createFromAsset(mgr, "ahronbd.ttf");
        tv_2.setTypeface(tf);

        tv_4 = findViewById(R.id.tv_4);
        tv_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomePageActivity.this,"Already in Home page.",Toast.LENGTH_SHORT).show();
            }
        });
        tv_5 = findViewById(R.id.tv_5);
        tv_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomePageActivity.this,"Navigate to Alerts page.",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(HomePageActivity.this, AlertsActivity.class);
                startActivity(intent);
            }
        });
        tv_6 = findViewById(R.id.tv_6);
        tv_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomePageActivity.this,"Navigate to Account page.",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(HomePageActivity.this, AccountActivity.class);
                startActivity(intent);
            }
        });

        btn_1 = findViewById(R.id.btn_1);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomePageActivity.this,"This is just an example of DHome.",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(HomePageActivity.this, DevicePageActivity.class);
                startActivity(intent);
            }
        });
        btn_1.setTypeface(tf);

        btn_2 = findViewById(R.id.btn_2);
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomePageActivity.this,"Adding Device is still building.",Toast.LENGTH_SHORT).show();
            }
        });
        btn_2.setTypeface(tf);

        btn_3 = findViewById(R.id.btn_3);
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomePageActivity.this,"Removing Device is still building.",Toast.LENGTH_SHORT).show();
            }
        });
        btn_3.setTypeface(tf);

        home = findViewById(R.id.home);
        home.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        home.setTypeface(tf);

        setting = findViewById(R.id.setting);
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomePageActivity.this,"Setting is still building.",Toast.LENGTH_SHORT).show();
            }
        });
        setting.setTypeface(tf);

    }
}
