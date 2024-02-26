package com.example.indivisualloanapp.Retrofit;
import com.example.indivisualloanapp.Request.MemberHomePageAndDashboardRequest;
import com.example.indivisualloanapp.Request.MemberLoanCardPrintingRequest;
import com.example.indivisualloanapp.Request.MemberLoanFullReportRequest;
import com.example.indivisualloanapp.Request.MemberLoginWithIDAndPasswordRequest;
import com.example.indivisualloanapp.Response.MemberHomePageAndDashboardResponse;
import com.example.indivisualloanapp.Response.MemberLoanCardPrintingResponse;
import com.example.indivisualloanapp.Response.MemberLoanFullReportResponse;
import com.example.indivisualloanapp.Response.MemberLoginWithIDAndPasswordResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiServices {
@POST("Service/MemberLoginWithIDAndPassword")
Call<MemberLoginWithIDAndPasswordResponse>LoginIdAndPassword(
        @Body MemberLoginWithIDAndPasswordRequest memberLoginWithIDAndPasswordRequest
);

@POST("Service/MemberHomePageAndDashboard")
Call<MemberHomePageAndDashboardResponse>ClientDashboard(
        @Body MemberHomePageAndDashboardRequest memberHomePageAndDashboardRequest
);

@POST("Service/MemberLoanCardPrinting")
    Call<MemberLoanCardPrintingResponse>ClientPrinting(
            @Body MemberLoanCardPrintingRequest memberLoanCardPrintingRequest
              );
@POST("Service/MemberLoanFullReport")
    Call<MemberLoanFullReportResponse>ClientReport(
            @Body MemberLoanFullReportRequest memberLoanFullReportRequest
              );
}
