package com.example.smd3;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class Level2Activity extends AppCompatActivity {
    private static final String FLAG = "CTF{logcat_flag}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2);

        Log.d("FLAG", "Flag-ul este: " + FLAG); // Utilizatorul trebuie să citească log-urile

        EditText input = findViewById(R.id.inputFlag);
        Button checkButton = findViewById(R.id.checkFlag);

        checkButton.setOnClickListener(v -> {
            if (input.getText().toString().equals(FLAG)) {
                Toast.makeText(this, "Flag corect!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Flag greșit!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
