package com.example.indivisualloanapp.Retrofit;
import com.example.indivisualloanapp.Request.MemberHomePageAndDashboardRequest;
import com.example.indivisualloanapp.Request.MemberLoginWithIDAndPasswordRequest;
import com.example.indivisualloanapp.Response.MemberHomePageAndDashboardResponse;
import com.example.indivisualloanapp.Response.MemberLoginWithIDAndPasswordResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiServices {
@POST("Service/MemberLoginWithIDAndPassword")
Call<MemberLoginWithIDAndPasswordResponse>LoginIdAndPassword(@Body MemberLoginWithIDAndPasswordRequest memberLoginWithIDAndPasswordRequest);
@POST("Service/MemberHomePageAndDashboard")
Call<MemberHomePageAndDashboardResponse>ClientDashboard(@Body MemberHomePageAndDashboardRequest memberHomePageAndDashboardRequest);
}
