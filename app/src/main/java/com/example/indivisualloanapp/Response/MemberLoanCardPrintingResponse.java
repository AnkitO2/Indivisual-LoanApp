package com.example.indivisualloanapp.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MemberLoanCardPrintingResponse {
    @SerializedName("Message")
    @Expose
    private String message;
    @SerializedName("Status")
    @Expose
    private boolean status;
    @SerializedName("MemberLoanCardPrinting")
    @Expose
    private List<MemberLoanCardPrinting> memberLoanCardPrinting;

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

    public List<MemberLoanCardPrinting> getMemberLoanCardPrinting() {
        return memberLoanCardPrinting;
    }

    public void setMemberLoanCardPrinting(List<MemberLoanCardPrinting> memberLoanCardPrinting) {
        this.memberLoanCardPrinting = memberLoanCardPrinting;
    }

}
