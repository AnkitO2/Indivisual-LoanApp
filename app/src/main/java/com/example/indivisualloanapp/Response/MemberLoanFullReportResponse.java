package com.example.indivisualloanapp.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MemberLoanFullReportResponse {
    @SerializedName("Message")
    @Expose
    private String message;
    @SerializedName("Status")
    @Expose
    private boolean status;
    @SerializedName("MemberLoanFullReport")
    @Expose
    private List<MemberLoanFullReport> memberLoanFullReport;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<MemberLoanFullReport> getMemberLoanFullReport() {
        return memberLoanFullReport;
    }

    public void setMemberLoanFullReport(List<MemberLoanFullReport> memberLoanFullReport) {
        this.memberLoanFullReport = memberLoanFullReport;
    }
}
