package com.example.indivisualloanapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.indivisualloanapp.Request.MemberLoanFullReportRequest;
import com.example.indivisualloanapp.Response.MemberLoanFullReport;
import com.example.indivisualloanapp.Response.MemberLoanFullReportResponse;
import com.example.indivisualloanapp.Retrofit.RetrofitClient;
import com.example.indivisualloanapp.databinding.ActivityReportBinding;
import com.google.android.material.navigation.NavigationView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ReportActivity extends AppCompatActivity {
private ActivityReportBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityReportBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        fullReportData();
        binding.menuIcon.setOnClickListener(v -> {
            binding.drawerLayout1.openDrawer(GravityCompat.START);
        });
        binding.navigationView1.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int itemId = menuItem.getItemId();
                if (itemId == R.id.Loan1){
                    Intent intent = new Intent(ReportActivity.this,MainActivity.class);

                    startActivity(intent);
                } else if (itemId ==R.id.Loan2) {
                    Intent intent = new Intent(ReportActivity.this , HomeActivity.class);
                    startActivity(intent);
                } else if (itemId ==R.id.Loan3) {
                    Intent intent = new Intent(ReportActivity.this,PrintingActivity.class);
                    startActivity(intent);
                } else if (itemId==R.id.Loan4) {
                    Intent intent = new Intent(ReportActivity.this,MemberDashboard.class);
                    //intent.putExtra("memberId",""+getIntent().getStringExtra("memberId"));
                    startActivity(intent);
                }
                return true; // Return true to indicate that the item click is handled
            }
        });
    }
    void fullReportData(){
        MemberLoanFullReportRequest reportRequest = new MemberLoanFullReportRequest();
        reportRequest.setMemberId(getIntent().getStringExtra("MemberID"));

        RetrofitClient.getClient().ClientReport(reportRequest).enqueue(new Callback<MemberLoanFullReportResponse>() {
            @Override
            public void onResponse(Call<MemberLoanFullReportResponse> call, Response<MemberLoanFullReportResponse> response) {
                if (response.isSuccessful()){
                    List<MemberLoanFullReport>list = response.body().getMemberLoanFullReport();
                    binding.reportData1.setText(getIntent().getStringExtra("MemberID")+ "    "+response.body().getMessage());
                    Toast.makeText(ReportActivity.this, ""+list.size(), Toast.LENGTH_SHORT).show();
                    binding.reportData2.setText("Brance Name : "+list.get(0).getBranchName());

                }else {

                }
            }
            @Override
            public void onFailure(Call<MemberLoanFullReportResponse> call, Throwable t) {

            }
        });
    }
}