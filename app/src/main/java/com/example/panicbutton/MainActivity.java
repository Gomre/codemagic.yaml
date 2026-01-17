package com.example.panicbutton;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // THIS LINE SETS THE UI LAYOUT
        setContentView(R.layout.activity_main);

        Button panic = findViewById(R.id.panicButton);
        panic.setOnClickListener(v -> sendSms());
    }

    private void sendSms() {
        SmsManager.getDefault().sendTextMessage(
                "1234567890",
                null,
                "PANIC! I need help.",
                null,
                null
        );
    }
}
