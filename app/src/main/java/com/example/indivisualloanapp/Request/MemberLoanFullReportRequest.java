package com.example.indivisualloanapp.Request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MemberLoanFullReportRequest {
    @SerializedName("MemberId")
    @Expose
    private String memberId;

    public String getMemberId() {
        return memberId;
    }
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

}
