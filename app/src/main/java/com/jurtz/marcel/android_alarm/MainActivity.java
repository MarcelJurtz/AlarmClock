package com.jurtz.marcel.android_alarm;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // GUI-Elements
    Button cmdNewAlarm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Remove Actionbar
        getSupportActionBar().hide();

        // GUI-Elements
        cmdNewAlarm = (Button)findViewById(R.id.cmdNewAlarm);
        cmdNewAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newAlarmIntent = new Intent(getApplicationContext(), NewAlarmActivity.class);
                startActivity(newAlarmIntent);
            }
        });


    }
}
