/*
Bichoy Sedrak - CSIT551 Mobile Computing Summer 2022
Creating Drive to MSU application.
 */

package com.example.drivemsu_sedrakb1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // creating the navigation button.

    private Button Navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Navigation = findViewById(R.id.drive);
        Navigation.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Uri MSU = Uri.parse("google.navigation:q=Montclair+State+University,+Montclair+New+Jersey");

        Intent Map = new Intent(Intent.ACTION_VIEW,MSU);

        Map.setPackage("com.google.android.apps.maps");

        startActivity(Map);

    }
}