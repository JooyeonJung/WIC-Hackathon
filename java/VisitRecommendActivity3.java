package com.example.sally.mapproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

public class VisitRecommendActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visit_recommend3);

        Handler handler = new Handler() {

            public void handleMessage(Message msg) {

                super.handleMessage(msg);

                //startActivity(intent);

                startActivity(new Intent(VisitRecommendActivity3.this, AfterHome.class));

                finish();

            }

        };

        handler.sendEmptyMessageDelayed(0, 3000); //3초후 화면전환
    }
}
