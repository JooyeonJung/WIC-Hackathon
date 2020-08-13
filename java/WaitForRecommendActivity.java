package com.example.sally.mapproj;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class WaitForRecommendActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wait_for_recommend);
        ImageView iv = (ImageView)findViewById(R.id.loading);
        Glide.with(this).load(R.raw.loading).into(iv);

        Handler handler = new Handler() {

            public void handleMessage(Message msg) {

                super.handleMessage(msg);

                //startActivity(intent);

                startActivity(new Intent(WaitForRecommendActivity.this, RecommendActivitiy4.class));

                finish();

            }

        };

        handler.sendEmptyMessageDelayed(0, 3000); //3초후 화면전환
    }
}