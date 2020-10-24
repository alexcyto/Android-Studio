package com.example.practica1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Log.i("DAM", "Estoy en el método onCreate() - 3");
    }

    protected void onStart() {
        super.onStart();
        Log.i("DAM", "Estoy en el método onStart() - 3");
    }

    protected void onResume() {
        super.onResume();
        Log.i("DAM", "Estoy en el método onResume() - 3");
    }

    protected void onPause() {
        super.onPause();
        Log.i("DAM", "Estoy en el método onPause() - 3");
    }

    protected void onStop() {
        super.onStop();
        Log.i("DAM", "Estoy en el método onStop() - 3");
    }

    protected void onRestart() {
        super.onRestart();
        Log.i("DAM", "Estoy en el método onRestart() - 3");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.i("DAM", "Estoy en el método onDestroy() - 3");

        Intent implicitIntent = new Intent(Intent.ACTION_VIEW);
        implicitIntent.setData(Uri.parse("http://www.cide.es"));
        startActivity(implicitIntent);
    }

}