package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private Button btnPickImage, btnRegister;
    private CheckBox checkAgree;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.SpinnerCountry);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter
                .createFromResource(this, R.array.planets_array, android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        checkAgree = findViewById(R.id.checkAgree);
        btnPickImage = findViewById(R.id.btnSelectImage);
        btnPickImage.setOnClickListener(v -> {
            Toast.makeText(this, "Pick Image Clicked", Toast.LENGTH_SHORT).show();
        });
        btnRegister = findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(v -> {
            if (checkAgree.isChecked())
                Toast.makeText(this, "Register successfully", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this, "License agreement required", Toast.LENGTH_SHORT).show();
        });
    }

}