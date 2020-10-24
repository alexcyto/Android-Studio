package com.example.practica1;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.i("DAM", "Estoy en el método onCreate() - 2");
    }

    protected void onStart() {
        super.onStart();
        Log.i("DAM", "Estoy en el método onStart() - 2");
    }

    protected void onResume() {
        super.onResume();
        Log.i("DAM", "Estoy en el método onResume() - 2");
    }

    protected void onPause() {
        super.onPause();
        Log.i("DAM", "Estoy en el método onPause() - 2");
    }

    protected void onStop() {
        super.onStop();
        Log.i("DAM", "Estoy en el método onStop() - 2");
    }

    protected void onRestart() {
        super.onRestart();
        Log.i("DAM", "Estoy en el método onRestart() - 2");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.i("DAM", "Estoy en el método onDestroy() - 2");

        Intent intent = new Intent(this, MainActivity3.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this,1, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        AlarmManager alarm = (AlarmManager) getSystemService(ALARM_SERVICE);
        alarm.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + (5 * 1000), pendingIntent);
    }







}