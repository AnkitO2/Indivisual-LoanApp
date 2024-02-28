package com.example.indivisualloanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import com.example.indivisualloanapp.databinding.ActivitySpashBinding;

public class SpashActivity extends AppCompatActivity {
 private ActivitySpashBinding binding;
 SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivitySpashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        sharedPreferences = getSharedPreferences("MyPREFERENCES", Context.MODE_PRIVATE);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                String loginStatus =sharedPreferences.getString("loginStatus","");
                if (loginStatus.isEmpty()){
                    Intent intent = new Intent(SpashActivity.this,LoginActivity.class);
                    startActivity(intent);
                }else {
                    Intent intent =new Intent(SpashActivity.this,MemberDashboard.class);
                    startActivity(intent);
                }
                finish();
            }
        },3000);
    }
}
    //        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                String logiStatus=sharedpreferences.getString("loginStatus", "");
//                if (logiStatus.isEmpty()){
//                    Intent  intent = new Intent(SpashActivity.this, LoginActitiy.class);
//                    startActivity(intent);
//                }else {
//                    Intent  intent = new Intent(SpashActivity.this, MainActivity.class);
//                    startActivity(intent);
//                }
//                finish();
//            }
//        },3000);
//    }
