package com.example.laboratorium_3;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;

import com.example.laboratorium_3.ui.login.LoginActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.provider.MediaStore;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    static final int REQUEST_IMAGE_CAPTURE = 1;

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
//        final Button button = findViewById(R.id.button2);
//        button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View arg0) {
//                Toast.makeText(getApplicationContext(), "Kliknięto przycisk LOSOWANIE", Toast.LENGTH_SHORT).show();
//                button.setCompoundDrawablesWithIntrinsicBounds(android.R.drawable.presence_audio_busy, 0, 0, 0);
//            }
//        });

        ImageButton button = (ImageButton)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
                    public  void onClick(View view){
                Toast.makeText(getApplicationContext(), "Kliknięto przycisk LOSOWANIE", Toast.LENGTH_SHORT).show();
                Random random = new Random();
                int liczbaLosowa = random.nextInt(5);
                System.out.println
                        ("The Randomly generated integer is : " + liczbaLosowa);
                switch (liczbaLosowa) {
                    case 0:
                        button.setImageDrawable(getResources().getDrawable(R.drawable.maestro, getTheme()));
                        break;
                    case 1:
                        button.setImageDrawable(getResources().getDrawable(android.R.drawable.presence_busy, getTheme()));
                        break;
                    case 2:
                        button.setImageDrawable(getResources().getDrawable(R.drawable.western, getTheme()));
                        break;
                    case 3:
                        button.setImageDrawable(getResources().getDrawable(android.R.drawable.arrow_up_float, getTheme()));
                        break;
                    case 4:
                        button.setImageDrawable(getResources().getDrawable(R.drawable.xing, getTheme()));
                        break;
                    default:
                }
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
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);

    }
    public void pstryknij(View view){
        Toast.makeText(getApplicationContext(), "Kliknięto przycisk PHOTO", Toast.LENGTH_SHORT).show();
        Intent intencja = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intencja, REQUEST_IMAGE_CAPTURE);

    }
//    public void losuj(View view){
//        Toast.makeText(getApplicationContext(), "Kliknięto przycisk LOSOWANIE", Toast.LENGTH_SHORT).show();
//        Random random = new Random();
//        int liczbaLosowa = random.nextInt();
//        System.out.println
//                ("The Randomly generated integer is : " + liczbaLosowa);
////        R.id.button2.setImageDrawable(getResources().getDrawable(R.drawable.icon, getTheme()));
////        R.id.button2.setCompoundDrawablesWithIntrinsicBounds(drawable.low, 0, 0, 0);
//
//        //button = findViewById(R.id.button2);
////        if (liczbaLosowa<=0) {
////            button.setImageDrawable(getResources().getDrawable(android.R.drawable.presence_audio_busy));
////            }
////        else {
////            button.setImageDrawable(getResources().getDrawable(R.drawable.sample));
////            }
    //      ImageButton btn = (ImageButton)findViewById(R.id.imageButton1);
//          btn.setImageResource(R.drawable.actions_record);
//
//    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            //imageView.setImageBitmap(imageBitmap);
            ConstraintLayout lay = (ConstraintLayout)findViewById(R.id.cont);
            lay.setBackground(new BitmapDrawable(getResources(), imageBitmap));
        }

    }
}