package com.example.indivisualloanapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.indivisualloanapp.Request.MemberHomePageAndDashboardRequest;
import com.example.indivisualloanapp.Response.MemberHomePageAndDashboardResponse;
import com.example.indivisualloanapp.Retrofit.RetrofitClient;
import com.example.indivisualloanapp.databinding.ActivityHomeBinding;
import com.google.android.material.navigation.NavigationView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeActivity extends AppCompatActivity {
private ActivityHomeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        homeDashboardData();
        setContentView(binding.getRoot());
        binding.menuIcon.setOnClickListener(v -> {
            binding.drawerLayout1.openDrawer(GravityCompat.START);
        });
        binding.navigationView1.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int itemId = menuItem.getItemId();
                if (itemId == R.id.Loan1){
                    Intent intent = new Intent(HomeActivity.this,MainActivity.class);
                    intent.putExtra("MemberID",""+getIntent().getStringExtra("MemberID"));
                    startActivity(intent);
                } else if (itemId ==R.id.Loan2) {
                    Intent intent = new Intent(HomeActivity.this , MemberDashboard.class);
                    intent.putExtra("MemberID",""+getIntent().getStringExtra("MemberID"));
                    startActivity(intent);
                } else if (itemId ==R.id.Loan3) {
                    Intent intent = new Intent(HomeActivity.this,PrintingActivity.class);
                    intent.putExtra("MemberID",""+getIntent().getStringExtra("MemberID"));
                    startActivity(intent);
                } else if (itemId==R.id.Loan4) {
                    Intent intent = new Intent(HomeActivity.this,ReportActivity.class);
                    intent.putExtra("MemberID",""+getIntent().getStringExtra("MemberID"));
                    startActivity(intent);
                }
                return true; // Return true to indicate that the item click is handled
            }
        });
    }
    void homeDashboardData(){
        MemberHomePageAndDashboardRequest memberHomePageAndDashboardRequest = new MemberHomePageAndDashboardRequest();
        memberHomePageAndDashboardRequest.setMemberId(getIntent().getStringExtra("MemberID"));

        RetrofitClient.getClient().ClientDashboard(memberHomePageAndDashboardRequest).enqueue(new Callback<MemberHomePageAndDashboardResponse>() {
            @Override
            public void onResponse(Call<MemberHomePageAndDashboardResponse> call, Response<MemberHomePageAndDashboardResponse> response) {
                if(response.isSuccessful()){
                    Log.d("Response", "Body: " + response.body().toString());
                    binding.homeData1.setText(response.body().getMessage());
                    binding.homeData2.setText("Balance Interest :"+response.body().getMemberHomePageAndDashboard().getBalanceInterest());
                    binding.homeData3.setText("Balance Penalty :"+response.body().getMemberHomePageAndDashboard().getBalancePenalty());
                    binding.homeData4.setText("Balance Principal :"+response.body().getMemberHomePageAndDashboard().getBalancePrincipal());
                    binding.homeData5.setText("Balance Total :"+response.body().getMemberHomePageAndDashboard().getBalanceTotal());
                    binding.homeData6.setText("Branch Name :"+response.body().getMemberHomePageAndDashboard().getBranchName());
                    binding.homeData7.setText("Last Paid Date :"+response.body().getMemberHomePageAndDashboard().getLastPaidDate());
                    binding.homeData8.setText("Loan Amount :"+response.body().getMemberHomePageAndDashboard().getLoanAmount());
                    binding.homeData9.setText("Loan Cycle :"+response.body().getMemberHomePageAndDashboard().getLoanCycle());
                    binding.homeData10.setText("Loan Funder :"+response.body().getMemberHomePageAndDashboard().getLoanFunder());
                    binding.homeData11.setText("Loan Id :"+response.body().getMemberHomePageAndDashboard().getLoanId());
                    binding.homeData12.setText("Loan Purpose :"+response.body().getMemberHomePageAndDashboard().getLoanPurpose());
                    binding.homeData13.setText("Loan Term :"+response.body().getMemberHomePageAndDashboard().getLoanTerm());
                    binding.homeData14.setText("Loan Term Mode :"+response.body().getMemberHomePageAndDashboard().getLoanTermMode());
                    binding.homeData15.setText("Member Id :"+response.body().getMemberHomePageAndDashboard().getMemberId());
                    binding.homeData16.setText("Member Name :"+response.body().getMemberHomePageAndDashboard().getMemberName());
                    binding.homeData17.setText("Officer Name :"+response.body().getMemberHomePageAndDashboard().getOfficerName());
                    binding.homeData18.setText("Paid Interest :"+response.body().getMemberHomePageAndDashboard().getPaidInterest());
                    binding.homeData19.setText("Paid Penalty :"+response.body().getMemberHomePageAndDashboard().getPaidPenalty());
                    binding.homeData20.setText("Paid Principal :"+response.body().getMemberHomePageAndDashboard().getPaidPrincipal());
                    binding.homeData21.setText("Paid Term :"+response.body().getMemberHomePageAndDashboard().getPaidTerm());
                    binding.homeData22.setText("Paid Total :"+response.body().getMemberHomePageAndDashboard().getPaidTotal());
                    binding.homeData23.setText("Total Interest"+response.body().getMemberHomePageAndDashboard().getTotalInterest());
                    binding.homeData24.setText("Total Payable :"+response.body().getMemberHomePageAndDashboard().getTotalPayable());
                    binding.homeData25.setText("Total Penalty :"+response.body().getMemberHomePageAndDashboard().getTotalPenalty());

                } else  {
                    Toast.makeText(HomeActivity.this, "response is not successfully", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<MemberHomePageAndDashboardResponse> call, Throwable t) {
                Toast.makeText(HomeActivity.this,"Something went wrong",Toast.LENGTH_SHORT).show();
            }
        });
    }
}