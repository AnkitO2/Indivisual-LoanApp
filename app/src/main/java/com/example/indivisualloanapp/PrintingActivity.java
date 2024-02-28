package com.example.indivisualloanapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.indivisualloanapp.Request.MemberLoanCardPrintingRequest;
import com.example.indivisualloanapp.Response.MemberLoanCardPrinting;
import com.example.indivisualloanapp.Response.MemberLoanCardPrintingResponse;
import com.example.indivisualloanapp.Retrofit.RetrofitClient;
import com.example.indivisualloanapp.databinding.ActivityPrintingBinding;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PrintingActivity extends AppCompatActivity {
private ActivityPrintingBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPrintingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        CardPrintingData();
        binding.memberId.setText(""+getIntent().getStringExtra("MemberID"));
        binding.menuIcon.setOnClickListener(v -> {
            binding.drawerLayout1.openDrawer(GravityCompat.START);
        });
        binding.navigationView1.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int itemId = menuItem.getItemId();
                if (itemId == R.id.Loan1){
                    Intent intent = new Intent(PrintingActivity.this,MainActivity.class);
                    intent.putExtra("MemberID",""+getIntent().getStringExtra("MemberID"));
                    intent.putExtra("Year",""+getIntent().getStringExtra("Year"));
                    startActivity(intent);
                } else if (itemId ==R.id.Loan2) {
                    Intent intent = new Intent(PrintingActivity.this , HomeActivity.class);
                    intent.putExtra("MemberID",""+getIntent().getStringExtra("MemberID"));
                    startActivity(intent);
                } else if (itemId ==R.id.Loan3) {
                    Intent intent = new Intent(PrintingActivity.this,MemberDashboard.class);
                    intent.putExtra("MemberID",""+getIntent().getStringExtra("MemberID"));
                    startActivity(intent);
                } else if (itemId==R.id.Loan4) {
                    Intent intent = new Intent(PrintingActivity.this,ReportActivity.class);
                    intent.putExtra("MemberID",""+getIntent().getStringExtra("MemberID"));
                    startActivity(intent);
                } else if (itemId ==R.id.Loan5) {
                    Intent intent = new Intent(PrintingActivity.this,LoginActivity.class);
                    startActivity(intent);
                }
                return true; // Return true to indicate that the item click is handled
            }
        });
    }
    void CardPrintingData(){
        MemberLoanCardPrintingRequest  printingRequest =new MemberLoanCardPrintingRequest();
        printingRequest.setMemberId(getIntent().getStringExtra("MemberID"));
        RetrofitClient.getClient().ClientPrinting(printingRequest).enqueue(new Callback<MemberLoanCardPrintingResponse>() {
            @Override
            public void onResponse(Call<MemberLoanCardPrintingResponse> call, Response<MemberLoanCardPrintingResponse> response) {
                if (response.isSuccessful()){
                    binding.memberId.setText(getIntent().getStringExtra("MemberID")+ "  "+response.body().getMessage());
                    List<MemberLoanCardPrinting>list = response.body().getMemberLoanCardPrinting();
                    binding.printingData1.setText("Branch Name :" +list.get(0).getBranchName());
                    binding.printingData2.setText("Disburse Date :" +list.get(0).getDisburseDate());
                    binding.printingData3.setText("Expiry Date :" +list.get(0).getExpiryDate());
                    binding.printingData4.setText("ILoan Type No :" +list.get(0).getILoanTypeNo());
                    binding.printingData5.setText("Interest Method :"+list.get(0).getInterestMethod());
                    binding.printingData6.setText("Loan Amount :" +list.get(0).getLoanAmount());
                    binding.printingData7.setText("Loan Cycle :" +list.get(0).getLoanCycle());
                    binding.printingData8.setText("Loan Funder :" +list.get(0).getLoanFunder());
                    binding.printingData9.setText("Loan Id :" +list.get(0).getLoanId());
                    binding.printingData10.setText("Loan Purpose :"+list.get(0).getLoanPurpose());
                    binding.printingData11.setText("Loan Term :" +list.get(0).getLoanTerm());
                    binding.printingData12.setText("MemberID :" +list.get(0).getMemberId());
                    binding.printingData13.setText("Member Name :" +list.get(0).getMemberName());
                    binding.printingData14.setText("Officer Name :" +list.get(0).getOfficerName());

                }else {
                    Toast.makeText(PrintingActivity.this, "response is not successfully", Toast.LENGTH_SHORT);
                }
            }
            @Override
            public void onFailure(Call<MemberLoanCardPrintingResponse> call, Throwable t) {
                Toast.makeText(PrintingActivity.this, "Something went wrong", Toast.LENGTH_SHORT).show();
            }
        });
    }
}