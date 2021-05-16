package com.iamyeong.superrace;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView card_start, card_point, card_schedule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card_start = findViewById(R.id.card_start_main);
        card_point = findViewById(R.id.card_point_ranking_main);
        card_schedule = findViewById(R.id.card_schedule_main);

        allSetOnClickListener(MainActivity.this);


    }

    private void allSetOnClickListener(View.OnClickListener listener) {

        card_start.setOnClickListener(listener);
        card_point.setOnClickListener(listener);
        card_schedule.setOnClickListener(listener);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.card_start_main :

                UsualDialog dialog = new UsualDialog(MainActivity.this, "테스트");
                dialog.show();

                System.out.println("START CARD CLICK!");
                break;

            case R.id.card_point_ranking_main :

                SingleDialog singleDialog = new SingleDialog(MainActivity.this, "테스트2");
                singleDialog.show();

                System.out.println("POINT RANKING CARD CLICK!");
                break;

            case R.id.card_schedule_main :

                System.out.println("SCHEDULE CARD CLICK!");
                break;
        }

    }
}