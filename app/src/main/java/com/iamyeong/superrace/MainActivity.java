package com.iamyeong.superrace;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_play, btn_rank, btn_schedule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_play = findViewById(R.id.btn_play_main);
        btn_rank = findViewById(R.id.btn_rank_main);
        btn_schedule = findViewById(R.id.btn_schedule_main);

        allSetOnClickListener(MainActivity.this);


    }

    private void allSetOnClickListener(View.OnClickListener listener) {

        btn_play.setOnClickListener(listener);
        btn_rank.setOnClickListener(listener);
        btn_schedule.setOnClickListener(listener);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

        }

    }
}