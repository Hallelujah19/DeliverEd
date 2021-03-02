package com.example.delivered;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.okhttp.OkHttpClient;

import java.io.IOException;


public class DevicePageActivity extends AppCompatActivity {

    private TextView tv_7;
    private TextView tv_8, tv_10, tv_9, tv_11;
    private Button btn_1, btn_2;
    private TextView tv_4, tv_5, tv_6;

    private APIService mAPIService;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_page);
        AssetManager mgr = getAssets();
        Typeface tf = Typeface.createFromAsset(mgr, "ahronbd.ttf");
        tv_7 = findViewById(R.id.tv_7);
        tv_7.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        tv_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DevicePageActivity.this, "Uploading photo is still building.", Toast.LENGTH_SHORT).show();
            }
        });
        tv_7.setTypeface(tf);
        tv_8 = findViewById(R.id.tv_8);
        tv_8.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        tv_8.setTypeface(tf);
        tv_10 = findViewById(R.id.tv_10);
        tv_10.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        tv_10.setTypeface(tf);
        btn_1 = findViewById(R.id.btn_1);


        btn_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Post post = new Post();
                post.run(1);
                Toast.makeText(DevicePageActivity.this, "Successfully open device!", Toast.LENGTH_SHORT).show();
            }
        });
        btn_2 = findViewById(R.id.btn_2);
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Post post = new Post();
                post.run(0);
                Toast.makeText(DevicePageActivity.this, "Successfully lock device!", Toast.LENGTH_SHORT).show();
            }
        });
        btn_1.setTypeface(tf);
        btn_2.setTypeface(tf);

        tv_9 = findViewById(R.id.tv_9);
        tv_9.setTypeface(tf);
        tv_11 = findViewById(R.id.tv_11);
        tv_11.setTypeface(tf);

        tv_4 = findViewById(R.id.tv_4);
        tv_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DevicePageActivity.this, "Navigate to Home page.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(DevicePageActivity.this, HomePageActivity.class);
                startActivity(intent);
            }
        });
        tv_5 = findViewById(R.id.tv_5);
        tv_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DevicePageActivity.this, "Navigate to Alerts page.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(DevicePageActivity.this, AlertsActivity.class);
                startActivity(intent);
            }
        });
        tv_6 = findViewById(R.id.tv_6);
        tv_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DevicePageActivity.this, "Navigate to Account page.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(DevicePageActivity.this, AccountActivity.class);
                startActivity(intent);
            }
        });

    }
}
