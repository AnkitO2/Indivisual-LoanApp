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
        CardPrintingData();
        setContentView(binding.getRoot());

        binding.menuIcon.setOnClickListener(v -> {
            binding.drawerLayout1.openDrawer(GravityCompat.START);
        });
        binding.navigationView1.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int itemId = menuItem.getItemId();
                if (itemId == R.id.Loan1){
                    Intent intent = new Intent(PrintingActivity.this,MainActivity.class);
                    startActivity(intent);
                } else if (itemId ==R.id.Loan2) {
                    Intent intent = new Intent(PrintingActivity.this , HomeActivity.class);
                    startActivity(intent);
                } else if (itemId ==R.id.Loan3) {
                    Intent intent = new Intent(PrintingActivity.this,MemberDashboard.class);
                    intent.putExtra("MemberId",""+getIntent().getStringExtra("MemberId"));
                    startActivity(intent);
                } else if (itemId==R.id.Loan4) {
                    Intent intent = new Intent(PrintingActivity.this,ReportActivity.class);
                    startActivity(intent);
                }
                return true; // Return true to indicate that the item click is handled
            }
        });
    }
    void CardPrintingData(){
        MemberLoanCardPrintingRequest  printingRequest =new MemberLoanCardPrintingRequest();
        printingRequest.setMemberId(getIntent().getStringExtra("MemberId"));

        RetrofitClient.getClient().ClientPrinting(printingRequest).enqueue(new Callback<MemberLoanCardPrintingResponse>() {
            @Override
            public void onResponse(Call<MemberLoanCardPrintingResponse> call, Response<MemberLoanCardPrintingResponse> response) {
                if (response.isSuccessful()){
                    List<MemberLoanCardPrinting>list = response.body().getMemberLoanCardPrinting();
                    binding.memberId.setText(""+getIntent().getStringExtra("MemberId"));
                    binding.printingData1.setText(response.body().getMessage());

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