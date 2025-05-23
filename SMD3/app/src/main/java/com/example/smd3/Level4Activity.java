package com.example.smd3;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Level4Activity extends AppCompatActivity {

    // SHA-256 hash pentru "password123"
    private final String correctHash = "ef92b778bafe771e89245b89ecbc08a44a4e166c06659911881f383d4473e94f";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level4);

        EditText input = findViewById(R.id.inputFlag);
        Button checkButton = findViewById(R.id.checkFlag);

        checkButton.setOnClickListener(v -> {
            String enteredFlag = input.getText().toString();
            if (sha256(enteredFlag).equals(correctHash)) {
                Toast.makeText(this, "Flag corect!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Flag greșit!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private String sha256(String base) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(base.getBytes("UTF-8"));
            StringBuilder hexString = new StringBuilder();

            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if(hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (Exception ex) {
            return "";
        }
    }
}
