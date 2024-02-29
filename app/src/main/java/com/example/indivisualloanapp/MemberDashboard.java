package com.example.indivisualloanapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.indivisualloanapp.Request.MemberLoginWithIDAndPasswordRequest;
import com.example.indivisualloanapp.Response.MemberLoginWithIDAndPasswordResponse;
import com.example.indivisualloanapp.Retrofit.RetrofitClient;
import com.example.indivisualloanapp.databinding.MemberDashboardBinding;
import com.google.android.material.navigation.NavigationView;

import java.util.Date;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MemberDashboard extends AppCompatActivity {
private MemberDashboardBinding binding;
SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = MemberDashboardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        memberDashboard();
        sharedPreferences =getSharedPreferences("MyPREFERENCES",Context.MODE_PRIVATE);
       // sharedPreferences = getSharedPreferences("MyPREFERENCES", Context.MODE_PRIVATE);
      // binding.userId.setText("Welcome Member Dashboard:"+getIntent().getStringExtra("MemberID"));
       // binding.memberId.setText("memberId :"+getIntent().getStringExtra("MEMBERC ID"));
        binding.menuIcon.setOnClickListener(v -> {
          binding.drawerLayout1.openDrawer(GravityCompat.START);
        });
        binding.navigationView1.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int itemId = menuItem.getItemId();
                if (itemId == R.id.Loan1) {
                    Intent intent = new Intent(MemberDashboard.this,MainActivity.class);
                    intent.putExtra("MemberID",""+getIntent().getStringExtra("MemberID"));
                    intent.putExtra("Year",""+getIntent().getStringExtra("Year"));
                    startActivity(intent);

                } else if (itemId == R.id.Loan2) {
                    Intent intent = new Intent(MemberDashboard.this,HomeActivity.class);
                    intent.putExtra("MemberID",""+getIntent().getStringExtra("MemberID"));
                    startActivity(intent);

                } else if (itemId == R.id.Loan3) {
                    Intent intent =new Intent(MemberDashboard.this,PrintingActivity.class);
                    intent.putExtra("MemberID",""+getIntent().getStringExtra("MemberID"));
                    startActivity(intent);
                } else if (itemId == R.id.Loan4) {
                    Intent intent =new Intent(MemberDashboard.this,ReportActivity.class);
                    intent.putExtra("MemberID",""+getIntent().getStringExtra("MemberID"));
                    startActivity(intent);
                } else if (itemId ==R.id.Loan5) {
                     Intent intent =new Intent(MemberDashboard.this,LoginActivity.class);
                     startActivity(intent);
                } else if (itemId==R.id.Loan6) {
                    Intent intent = new Intent(MemberDashboard.this,LocationActivity.class);
                    startActivity(intent);
                }
                return true; // Return true to indicate that the item click is handled
            }
        });
    }
    void memberDashboard(){
        MemberLoginWithIDAndPasswordRequest request = new MemberLoginWithIDAndPasswordRequest();
        request.setMemberId(getIntent().getStringExtra("MemberID"));
//        if (sharedPreferences.getString("MemberID","").isEmpty()){
//            request.setMemberId("MemberID"+getIntent().getStringExtra("MemberID"));
//        }else {
//            request.setMemberId("MemberID"+sharedPreferences.getString("memberId",""));
//        }
        RetrofitClient.getClient().LoginIdAndPassword(request).enqueue(new Callback<MemberLoginWithIDAndPasswordResponse>() {
            @Override
            public void onResponse(Call<MemberLoginWithIDAndPasswordResponse> call, Response<MemberLoginWithIDAndPasswordResponse> response) {
                if (response.isSuccessful()){
                    binding.memberId.setText(response.body().getMessage());
                    binding.year.setText(response.body().getMemberLoginWithIDAndPassword().getFinYear());
                }else {

                }
            }

            @Override
            public void onFailure(Call<MemberLoginWithIDAndPasswordResponse> call, Throwable t) {

            }
        });
    }
}