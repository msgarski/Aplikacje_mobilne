package com.example.laboratorium_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Dodane linie kodu:
        Log.d("Lab2", "metoda onCreate");
        // Lub:
        Toast.makeText(this, "Metoda onCreate", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        // Dodane linie kodu:
        Log.d("Lab2", "metoda onResume");
        // Lub:
        Toast.makeText(this, "Metoda onResume", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        // Dodane linie kodu:
        Log.d("Lab2", "metoda onPause");
        // Lub:
        Toast.makeText(this, "Metoda onPause", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        // Dodane linie kodu:
        Log.d("Lab2", "metoda onStop");
        // Lub:
        Toast.makeText(this, "Metoda onStop", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Dodane linie kodu:
        Log.d("Lab2", "metoda onDestroy");
        // Lub:
        Toast.makeText(this, "Metoda onDestroy", Toast.LENGTH_SHORT).show();
    }
}