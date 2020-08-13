package com.example.sally.mapproj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class NewActivity3 extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newactivity3);

         Button button2 = (Button)findViewById(R.id.pharmacy_connect);
         button2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent = new Intent(NewActivity3.this, MainActivity.class);
                 startActivity(intent);
                 finish();
             }
         });


    }
}
