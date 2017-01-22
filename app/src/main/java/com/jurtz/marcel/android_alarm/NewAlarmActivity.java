package com.jurtz.marcel.android_alarm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class NewAlarmActivity extends AppCompatActivity {

    // GUI-Elements
    Spinner spHours;
    Spinner spMinutes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_alarm);

        // Remove Actionbar
        getSupportActionBar().hide();

        // GUI-Elements
        spHours = (Spinner)findViewById(R.id.spHours);
        spMinutes = (Spinner)findViewById(R.id.spMinutes);

        // Load Spinner Items
        populateListViews();
    }

    // Populate Hours/Min Listviews
    private void populateListViews()
    {
        String[] hours = new String[24];
        String[] mins = new String[60];

        for(int i = 1; i <= 60; i++) {
            String current = String.format("%02d", i);
            if( i <= 24) {
                hours[i-1] = current;
            }
            mins[i-1] = current;
        }

        // Spinner - Hours
        ArrayAdapter<String> adapterHours = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, hours);
        adapterHours.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spHours.setAdapter(adapterHours);

        // Spinner - Minutes
        ArrayAdapter<String> adapterMinutes = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, mins);
        adapterMinutes.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spMinutes.setAdapter(adapterMinutes);
    }
}
