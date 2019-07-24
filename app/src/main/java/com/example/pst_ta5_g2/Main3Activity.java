package com.example.pst_ta5_g2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {
    private CalendarView calendarView;
    private ListView listView;
    private EventAdapter adapter;
    private ArrayList<Event> listEvents = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        calendarView = (CalendarView) findViewById(R.id.calendarView);
        listView = (ListView) findViewById(R.id.listView);
        adapter = new EventAdapter(listEvents,this);
        listView.setAdapter(adapter);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                if((year==2019)&&((month+1)==7)&&(dayOfMonth==19)){
                    listEvents.clear();
                    listEvents.add(new Event("13:00", "Cita Medica", "Iess"));
                    adapter.notifyDataSetChanged();
                }
                else{
                    listEvents.clear();
                    adapter.notifyDataSetChanged();
                }
            }
        });

    }

    public void volver(View view) {
        finish();
    }
}
