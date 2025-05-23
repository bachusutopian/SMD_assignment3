package com.example.smd3;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Level3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3);

        EditText input = findViewById(R.id.inputFlag);
        Button checkButton = findViewById(R.id.checkFlag);

        checkButton.setOnClickListener(v -> {
            String entered = input.getText().toString();
            if (isFlagCorrect(entered)) {
                Toast.makeText(this, "Flag corect!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Flag greșit!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    // Algoritm custom de validare flag
    private boolean isFlagCorrect(String input) {
        if (input.length() != 11) return false;

        char[] expected = new char[] {
                (char) ('p' + 3),  // s
                (char) ('d' + 1),  // e
                (char) ('a' + 2),  // c
                (char) ('o' + 3),  // r
                (char) ('f' - 1),  // e
                (char) ('u' - 1),  // t
                (char) ('^' + 1),  // _
                (char) ('d' + 2),  // f
                (char) ('m' - 1),  // l
                (char) ('c' - 2),  // a
                (char) ('h' - 1)   // g
        };

        for (int i = 0; i < expected.length - 1; i++) {
            if (input.charAt(i) != expected[i]) {
                return false;
            }
        }
        return true;
    }
}
