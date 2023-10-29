package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button5_work);
        button.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(MainActivity.this, "Clicked",Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }

    public void About(View view) {
        Intent i = new Intent(this,Activity_sec.class);
        startActivity(i);
    }

    public void cullus(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("tel:00900421009"));
        startActivity(i);
    }

    public void web(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.fendi.com"));
        startActivity(i);
    }
    public void work(View view) {
        Intent i = new Intent(this,Activity_ther.class);
        startActivity(i);
    }
}