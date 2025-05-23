package com.example.smd3;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.buttonLevel1).setOnClickListener(v ->
                startActivity(new Intent(this, Level1Activity.class)));

        findViewById(R.id.buttonLevel2).setOnClickListener(v ->
                startActivity(new Intent(this, Level2Activity.class)));

        findViewById(R.id.buttonLevel3).setOnClickListener(v ->
                startActivity(new Intent(this, Level3Activity.class)));

        findViewById(R.id.buttonLevel4).setOnClickListener(v ->
                startActivity(new Intent(this, Level4Activity.class)));

        findViewById(R.id.buttonLevel5).setOnClickListener(v ->
                startActivity(new Intent(this, Level5Activity.class)));
    }
}
