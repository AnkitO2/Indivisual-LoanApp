package com.example.indivisualloanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.indivisualloanapp.databinding.ActivityReportBinding;

public class ReportActivity extends AppCompatActivity {
private ActivityReportBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityReportBinding.inflate(getLayoutInflater());
        fullReportData();
        setContentView(binding.getRoot());
    }
    void fullReportData(){

    }
}