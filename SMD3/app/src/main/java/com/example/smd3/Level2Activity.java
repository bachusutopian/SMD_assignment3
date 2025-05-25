package com.example.smd3;

import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Level2Activity extends AppCompatActivity {
    private static final String ENCODED_FLAG = "Q1RGe2xvZ2NhdF9mbGFnfQ==";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2);

        // Decode Base64 flag
        String decodedFlag = new String(Base64.decode(ENCODED_FLAG, Base64.DEFAULT));

        // Print decoded flag in Logcat
        Log.d("FLAG", "Flag-ul este: " + decodedFlag);

        EditText input = findViewById(R.id.inputFlag);
        Button checkButton = findViewById(R.id.checkFlag);

        checkButton.setOnClickListener(v -> {
            String enteredFlag = input.getText().toString().trim();
            if (enteredFlag.equals(decodedFlag)) {
                Toast.makeText(this, "Flag corect!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Flag greșit!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
