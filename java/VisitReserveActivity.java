package com.example.sally.mapproj;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.vivekkaushik.datepicker.DatePickerTimeline;
import com.vivekkaushik.datepicker.OnDateSelectedListener;


public class VisitReserveActivity extends AppCompatActivity implements Button.OnClickListener {
    Button buttonEvent;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visit_reserve);

       // final TextView textView1 = (TextView) findViewById(R.id.textView1);
        final Button button15 = (Button) findViewById(R.id.day15);
        final Button button30 = (Button) findViewById(R.id.day30);
        final Button button60 = (Button) findViewById(R.id.day60);

        Button day15 = (Button) findViewById(R.id.day15);
        button15.setOnClickListener(this);
        Button day30 = (Button) findViewById(R.id.day30);
        button30.setOnClickListener(this);
        Button day60 = (Button) findViewById(R.id.day60);
        button60.setOnClickListener(this);

        DatePickerTimeline datePickerTimeline = findViewById(R.id.datePickerTimeline);
        // Set a Start date (Default, 1 Jan 1970)
        datePickerTimeline.setInitialDate(2019, 11, 10);
        // Set a date Selected Listener
        datePickerTimeline.setOnDateSelectedListener(new OnDateSelectedListener() {
            @Override
            public void onDateSelected(int year, int month, int day, int dayOfWeek) {
                //Do Something

            }
        });

        Button nextBtn = findViewById(R.id.button);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), VisitRecommendActivity3.class);
                startActivity(intent);

            }
        });


    }

    @Override
    public void onClick(View view) {
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        Button day15 = (Button) findViewById(R.id.day15);
        Button day30 = (Button) findViewById(R.id.day30);
        Button day60 = (Button) findViewById(R.id.day60);
        switch (view.getId()) {
            case R.id.day15 :
                day30.setBackground(getResources().getDrawable(R.drawable.bg_custom_button7));
                day60.setBackground(getResources().getDrawable(R.drawable.bg_custom_button7));
                day30.setTextColor(Color.parseColor("#858585"));
                day60.setTextColor(Color.parseColor("#858585"));
                day15.setTextColor(Color.parseColor("#00c853"));
                textView1.setText("20,400");
                day15.setBackground(getResources().getDrawable(R.drawable.bg_custom_button6));
                break ;
            case R.id.day30 :
                day15.setBackground(getResources().getDrawable(R.drawable.bg_custom_button7));
                day60.setBackground(getResources().getDrawable(R.drawable.bg_custom_button7));
                day15.setTextColor(Color.parseColor("#858585"));
                day60.setTextColor(Color.parseColor("#858585"));
                day30.setTextColor(Color.parseColor("#00c853"));
                textView1.setText("50,000");
                day30.setBackground(getResources().getDrawable(R.drawable.bg_custom_button6));
                //textView1.setBackgroundColor(Color.rgb(255, 0, 0));
                break ;
            case R.id.day60 :
                day30.setBackground(getResources().getDrawable(R.drawable.bg_custom_button7));
                day15.setBackground(getResources().getDrawable(R.drawable.bg_custom_button7));
                day15.setTextColor(Color.parseColor("#858585"));
                day30.setTextColor(Color.parseColor("#858585"));
                day60.setTextColor(Color.parseColor("#00c853"));
                textView1.setText("95,000");
                day60.setBackground(getResources().getDrawable(R.drawable.bg_custom_button6));
                break ;
        }

    }


    /* button15.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.button15:
                        button15.setTextColor(Color.parseColor("#00c853"));
                        textView1.setText("20,400");
                        button15.setBackground(getResources().getDrawable(R.drawable.bg_custom_button6));
                        break;
                    case R.id.button30:
                        textView1.setText("Green");
                        textView1.setBackgroundColor(Color.rgb(0, 255, 0));
                        break;
                    case R.id.button60:
                        textView1.setText("Blue");
                        textView1.setBackgroundColor(Color.rgb(0, 0, 255));
                        break;
                }

            }
        });

/*
        button15.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                button15.setTextColor(Color.parseColor("#00c853"));
                textView1.setText("20,400");
                button15.setBackground(getResources().getDrawable(R.drawable.bg_custom_button6));
                //textView1.setBackgroundColor(Color.rgb(255, 0, 0));
            }
        }) ;

        button30.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                button30.setTextColor(Color.parseColor("#00c853"));
                textView1.setText("50,000");
                button30.setBackground(getResources().getDrawable(R.drawable.bg_custom_button6));
                //textView1.setBackgroundColor(Color.rgb(255, 0, 0));
            }
        }) ;

        button60.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                button60.setTextColor(Color.parseColor("#00c853"));
                textView1.setText("75,000");
                button60.setBackground(getResources().getDrawable(R.drawable.bg_custom_button6));
                //textView1.setBackgroundColor(Color.rgb(255, 0, 0));
            }
        }) ;
    }
  //  public void ClickButton1(View view){
   //     if(view.getId() == R.id.day15){

    //    }else if (view.getId() == R.id.day30){

   //     }else if (view.getId() == R.id.day60){

    //    }
   // }*/


}
