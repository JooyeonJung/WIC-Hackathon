package com.example.sally.mapproj;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;

import com.bumptech.glide.Glide;



import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

public class NewActivity4 extends FragmentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newactivity4);
        ImageView iv = (ImageView)findViewById(R.id.loading);
        Glide.with(this).load(R.raw.loading).into(iv);

        Handler handler = new Handler() {

            public void handleMessage(Message msg) {

                super.handleMessage(msg);

                //startActivity(intent);

                startActivity(new Intent(NewActivity4.this, RecommendActivity.class));

                finish();

            }

        };

        handler.sendEmptyMessageDelayed(0, 3000); //3초후 화면전환

    }
}
