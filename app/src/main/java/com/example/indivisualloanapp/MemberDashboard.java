package com.example.indivisualloanapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.indivisualloanapp.databinding.MemberDashboardBinding;
import com.google.android.material.navigation.NavigationView;

import java.util.Date;

public class MemberDashboard extends AppCompatActivity {
private MemberDashboardBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = MemberDashboardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
       // binding.year.setText("Student Year :"+getIntent().getStringExtra("YEAR"));
       // binding.memberId.setText("memberId :"+getIntent().getStringExtra("MEMBERC ID"));
        binding.menuIcon.setOnClickListener(v -> {
          binding.drawerLayout1.openDrawer(GravityCompat.START);

        });

        binding.navigationView1.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int itemId = menuItem.getItemId();

                if (itemId == R.id.Loan1) {
//                    Toast.makeText(MemberDashboard.this, "Loan1 Clixked", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MemberDashboard.this,MainActivity.class);
                    startActivity(intent);

                } else if (itemId == R.id.Loan2) {
                    Intent intent = new Intent(MemberDashboard.this,HomeActivity.class);
                    startActivity(intent);
//                    Toast.makeText(MemberDashboard.this, "Loan2 Clixked", Toast.LENGTH_SHORT).show();

                } else if (itemId == R.id.Loan3) {
                    Intent intent =new Intent(MemberDashboard.this,PrintingActivity.class);
                    startActivity(intent);
  //                  Toast.makeText(MemberDashboard.this, "Loan3 Clixked", Toast.LENGTH_SHORT).show();
                } else if (itemId == R.id.Loan4) {
                    Intent intent =new Intent(MemberDashboard.this,ReportActivity.class);
                    startActivity(intent);
//                    Toast.makeText(MemberDashboard.this, "Loan4 Clixked", Toast.LENGTH_SHORT).show();
                }
                return true; // Return true to indicate that the item click is handled
            }
        });
    }
}