package com.example.indivisualloanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.indivisualloanapp.databinding.ActivityPrintingBinding;

public class PrintingActivity extends AppCompatActivity {
private ActivityPrintingBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPrintingBinding.inflate(getLayoutInflater());
        CardPrintingData();
        setContentView(binding.getRoot());
    }
    void CardPrintingData(){

    }
}