package com.example.laboratorium_3;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                Toast.makeText(getApplicationContext(), "Kliknięto przycisk FAB", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id) {
            case R.id.action_settings:
                // code block
                Toast.makeText(getApplicationContext(), "Kliknięto przycisk SETTINGS", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action2_settings:
                // code block
                Toast.makeText(getApplicationContext(), "Kliknięto przycisk OPTIONS", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action3_settings:
                // code block
                Toast.makeText(getApplicationContext(), "Kliknięto przycisk MEASURING", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action4_settings:
                // code block
                Toast.makeText(getApplicationContext(), "Kliknięto przycisk RECOGNIZING", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//                startActivityForResult(intent,REQUEST_IMAGE_CAPTURE);
                //new ActivityResultContracts.StartActivityForResult();
                break;
            default:
                // code block
        }
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }
    public void kliknij(View view){
        Toast.makeText(getApplicationContext(), "Kliknięto przycisk BUTTON", Toast.LENGTH_SHORT).show();

    }
}