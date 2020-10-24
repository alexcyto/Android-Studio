package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("DAM", "Estoy en el método onCreate()");
    }

    protected void onStart() {
        super.onStart();
        Log.i("DAM", "Estoy en el método onStart()");
    }

    protected void onResume() {
        super.onResume();
        Log.i("DAM", "Estoy en el método onResume()");
    }

    protected void onPause() {
        super.onPause();
        Log.i("DAM", "Estoy en el método onPause()");
    }

    protected void onStop() {
        super.onStop();
        Log.i("DAM", "Estoy en el método onStop()");
    }

    protected void onRestart() {
        super.onRestart();
        Log.i("DAM", "Estoy en el método onRestart()");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.i("DAM", "Estoy en el método onDestroy()");

        Intent explicitIntent = new Intent(this, MainActivity2.class);
        startActivity(explicitIntent);
    }

}