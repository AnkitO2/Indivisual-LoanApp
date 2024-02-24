package com.example.indivisualloanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.indivisualloanapp.databinding.MemberDashboardBinding;

public class MemberDashboard extends AppCompatActivity {
private MemberDashboardBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = MemberDashboardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.year.setText("Student Year :"+getIntent().getStringExtra("Year"));
        binding.studentId.setText("Member Id :"+getIntent().getStringExtra("memberId"));
    }
}