package com.example.hwplaner;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by lm-go on 10.04.2017.
 */

public class HomeworkActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.homework_title);
        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String date = intent.getStringExtra("date");
        String subject = intent.getStringExtra("subject");

        TextView titleView = (TextView)findViewById(R.id.title2);
        titleView.setText(title);

        Button dateButton = (Button)findViewById(R.id.date2);
        dateButton.setText(date);

        Button subjectButton = (Button)findViewById(R.id.subject2);
        subjectButton.setText(subject);

        switch (subject){

            case("Deutsch"):
                subjectButton.setBackgroundColor(Color.parseColor("#633DBF"));
                break;
            case("Mathe"):
                subjectButton.setBackgroundColor(Color.parseColor("#0F825F"));
                break;
            case("Französisch"):
                subjectButton.setBackgroundColor(Color.parseColor("#EE2808"));
                break;
            case("Geschichte"):
                subjectButton.setBackgroundColor(Color.parseColor("#459C1B"));
                break;
            case("Chemie"):
                subjectButton.setBackgroundColor(Color.parseColor("#1A81DB"));
                break;
            case("Physik"):
                subjectButton.setBackgroundColor(Color.parseColor("#EF871F"));
                break;


        }


    }
}