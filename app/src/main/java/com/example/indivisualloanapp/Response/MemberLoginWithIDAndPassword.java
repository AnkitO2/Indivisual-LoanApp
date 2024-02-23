package com.example.indivisualloanapp.Response;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class MemberLoginWithIDAndPassword implements Serializable
{

    @SerializedName("FinYear")
    @Expose
    private String finYear;
    @SerializedName("MemberId")
    @Expose
    private String memberId;

    public String getFinYear() {
        return finYear;
    }

    public void setFinYear(String finYear) {
        this.finYear = finYear;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

}