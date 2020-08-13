package com.example.sally.mapproj;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AfterHome extends AppCompatActivity {
    ImageButton current_pill;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_home);

        current_pill = (ImageButton)findViewById(R.id.button_currentpill);
        current_pill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AfterHome.this, KnowEat.class);
                startActivity(intent);
            }
        });
    }
}
