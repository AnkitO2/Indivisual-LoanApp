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
                    intent.putExtra("MemberID",""+getIntent().getStringExtra("MemberID"));
                    intent.putExtra("Year",""+getIntent().getStringExtra("Year"));
                    startActivity(intent);
                } else if (itemId ==R.id.Loan2) {
                    Intent intent = new Intent(ReportActivity.this , HomeActivity.class);
                    intent.putExtra("MemberID",""+getIntent().getStringExtra("MemberID"));
                    startActivity(intent);
                } else if (itemId ==R.id.Loan3) {
                    Intent intent = new Intent(ReportActivity.this,PrintingActivity.class);
                    intent.putExtra("MemberID",""+getIntent().getStringExtra("MemberID"));
                    startActivity(intent);
                } else if (itemId==R.id.Loan4) {
                    Intent intent = new Intent(ReportActivity.this,MemberDashboard.class);
                    intent.putExtra("MemberID",""+getIntent().getStringExtra("MemberID"));
                    startActivity(intent);
                } else if (itemId==R.id.Loan5) {
                    Intent intent = new Intent(ReportActivity.this,LoginActivity.class);
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
                   // binding.memberId.setText(""+getIntent().getStringExtra("MemberID"));
                    binding.memberId.setText(getIntent().getStringExtra("MemberID")+ "    "+response.body().getMessage());
                   // Toast.makeText(ReportActivity.this, ""+list.size(), Toast.LENGTH_SHORT).show();
                    binding.reportData1.setText("Application Amount : "+list.get(0).getApplicationAmount());
                    binding.reportData2.setText("Application Date : "+list.get(0).getApplicationDate());
                    binding.reportData3.setText("Approval Amount :"+list.get(0).getExpiryDate());
                    binding.reportData4.setText("Approval Date :"+list.get(0).getApprovalDate());
                    binding.reportData5.setText("Branch Name :"+list.get(0).getBranchName());
                    binding.reportData6.setText("Close Amount :"+list.get(0).getCloseAmount());
                    binding.reportData7.setText("Close Date :"+list.get(0).getCloseDate());
                    binding.reportData8.setText("Close Mode :"+list.get(0).getCloseMode());
                    binding.reportData9.setText("Disburse Amount :"+list.get(0).getDisburseAmount());
                    binding.reportData10.setText("Disburse Date :"+list.get(0).getDisburseDate());
                    binding.reportData11.setText("Disburse Mode :"+list.get(0).getDisburseMode());
                    binding.reportData12.setText("Expiry Date :"+list.get(0).getExpiryDate());
                    binding.reportData13.setText("Fee Pay Mode :"+list.get(0).getFeePayMode());
                    binding.reportData14.setText("ILoan Type No :"+list.get(0).getILoanTypeNo());
                    binding.reportData16.setText("Insurance Fee :"+list.get(0).getInsuranceFee());
                    binding.reportData6.setText("Interest Method :"+list.get(0).getInterestMethod());
                    binding.reportData17.setText("Interest Rate :"+list.get(0).getInterestRate());
                    binding.reportData18.setText("Loan Amount :"+list.get(0).getLoanAmount());
                    binding.reportData19.setText("Loan Cycle :"+list.get(0).getLoanCycle());
                    binding.reportData20.setText("Loan Funder :"+list.get(0).getLoanFunder());
                    binding.reportData21.setText("Loan Id :"+list.get(0).getLoanId());
                    binding.reportData22.setText("Loan Purpose :"+list.get(0).getLoanPurpose());
                    binding.reportData23.setText("Loan Status :"+list.get(0).getLoanStatus());
                    binding.reportData24.setText("Loan Term :"+list.get(0).getLoanTerm());
                    binding.reportData25.setText("Member Id :"+list.get(0).getMemberId());
                    binding.reportData26.setText("Member Name :"+list.get(0).getMemberName());
                    binding.reportData27.setText("Officer Name :"+list.get(0).getOfficerName());
                    binding.reportData28.setText("Other Fee :"+list.get(0).getOtherFee());
                    binding.reportData29.setText("Processing Fee :"+list.get(0).getProcessingFee());
                    binding.reportData30.setText("Security Fee :"+list.get(0).getSecurityFee());
                    binding.reportData31.setText("ServiceTax :"+list.get(0).getSecurityFee());
                    binding.reportData32.setText("Total Fee :"+list.get(0).getTotalFee());
                    binding.reportData33.setText("Total Interest :"+list.get(0).getTotalInterest());
                }
                else {
                    Toast.makeText(ReportActivity.this, "response is not successfully", Toast.LENGTH_SHORT);
                }
            }
            @Override
            public void onFailure(Call<MemberLoanFullReportResponse> call, Throwable t) {
                Toast.makeText(ReportActivity.this, "Something went wrong", Toast.LENGTH_SHORT).show();
            }
        });
    }
}