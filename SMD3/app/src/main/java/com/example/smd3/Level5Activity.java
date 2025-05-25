package com.example.smd3;

import android.os.Bundle;
import android.util.Base64;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Level5Activity extends AppCompatActivity {
    private final String correctFlag = "Q1RGe2lfYW1faGVyZV9mbGFnfQ==";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level5);

        EditText inputFlag = findViewById(R.id.inputFlag);
        Button checkButton = findViewById(R.id.checkFlag);

        checkButton.setOnClickListener(v -> {
            String enteredFlag = inputFlag.getText().toString().trim();
            String encodedInput = Base64.encodeToString(enteredFlag.getBytes(), Base64.NO_WRAP);

            if (encodedInput.equals(correctFlag)) {
                Toast.makeText(this, "Flag corect!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Flag greșit!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
