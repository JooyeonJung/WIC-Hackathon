package com.example.sally.mapproj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    ImageButton btn_kakao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_kakao = (ImageButton) findViewById(R.id.btn_kakao);
        btn_kakao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}
