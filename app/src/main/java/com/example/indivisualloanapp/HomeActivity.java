package com.example.indivisualloanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.indivisualloanapp.Request.MemberHomePageAndDashboardRequest;
import com.example.indivisualloanapp.Response.MemberHomePageAndDashboardResponse;
import com.example.indivisualloanapp.Retrofit.RetrofitClient;
import com.example.indivisualloanapp.databinding.ActivityHomeBinding;

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
    }
    void homeDashboardData(){
        MemberHomePageAndDashboardRequest memberHomePageAndDashboardRequest = new MemberHomePageAndDashboardRequest();
        memberHomePageAndDashboardRequest.setMemberId(getIntent().getStringExtra("memberId"));
        RetrofitClient.getClient().ClientDashboard(memberHomePageAndDashboardRequest).enqueue(new Callback<MemberHomePageAndDashboardResponse>() {
            @Override
            public void onResponse(Call<MemberHomePageAndDashboardResponse> call, Response<MemberHomePageAndDashboardResponse> response) {
                if(response.isSuccessful()){
                    Log.d("Response", "Body: " + response.body().toString());
                    binding.homeData1.setText(response.body().getMessage());
                    binding.homeData2.setText("BalanceInterest :"+response.body().getMemberHomePageAndDashboard().getBalanceInterest()+"\n");
 //                   binding.homeData3.setText(response.body().getMemberHomePageAndDashboard().getBalancePenalty());
//                    binding.txt.setText("Student Id  :"+response.body().getStudentHomePageAndDashboard().getStudentId()+"\n"+
//                            "RegistrationDate  :"+response.body().getStudentHomePageAndDashboard().getRegistrationDate()+"\n"+
//                            "ClassName  :"+response.body().getStudentHomePageAndDashboard().getClassName()+"\n"+
//                            "StudentName  :"+response.body().getStudentHomePageAndDashboard().getStudentName()+"\n"+
//                            "Gurdian Name  :"+response.body().getStudentHomePageAndDashboard().getGuardianName() +"\n"+
//                            "Gender  :"+response.body().getStudentHomePageAndDashboard().getGender() +"\n"+
//                            "Category  :"+response.body().getStudentHomePageAndDashboard().getCategory() +"\n");
//



                } else  {

                }
            }

            @Override
            public void onFailure(Call<MemberHomePageAndDashboardResponse> call, Throwable t) {

            }
        });
    }
}