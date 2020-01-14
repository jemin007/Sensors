package com.example.sensors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dashboardd extends AppCompatActivity {

        Button btnShow, btnAccelorometer, btnGyro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboardd);

        btnShow = findViewById(R.id.btnShow);
        btnAccelorometer = findViewById(R.id.btnAccelorometer);
        btnGyro= findViewById(R.id.btnGyroscope);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ShowSensor = new Intent(Dashboardd.this, MainActivity.class);
                startActivity(ShowSensor);
            }
        });

        btnAccelorometer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Accelorometer= new Intent(Dashboardd.this, Accelorometer.class);
                startActivity(Accelorometer);
            }
        });

        btnGyro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gyro= new Intent(Dashboardd.this, Gyroscope.class);
                startActivity(Gyro);
            }
        });

    }
}
